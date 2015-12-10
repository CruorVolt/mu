require 'optparse'

@mutant_types = [ "AO", "RO", "CO", "SO", "LO", "AS", "DL"]

@header = [
    "class", "mr", "run",
    "AO_live", "AO_killed",
    "RO_live", "RO_killed",
    "CO_live", "CO_killed",
    "SO_live", "SO_killed",
    "LO_live", "LO_killed",
    "AS_live", "AS_killed",
    "DL_live", "DL_killed",
    "total_timeouts", "total_exceptions", 
    "total_live", "total_killed", "error_score", "mutant_score"]

@add = [ "errorRate", "lag1", "scale", "selection_sort", "safeNorm", "elementwise_not_equal", "hamming_dist", "product", "calculateAbsoluteDifferences", "standardize", "kurtosis", "square", "evaluateInternal", "autoCorrelation", "covariance", "weightedMean", "winsorizedMean", "bubble", "sumOfLogarithms", "find_median", "find_magnitude", "average", "sampleSkew", "evaluateHoners", "find_max", "meanDeviation", "pooledMean", "find_max2", "polevl", "clip", "power", "geometric_mean", "weighted_average", "sum", "checkNonNegative", "variance", "ebeAdd", "ebeDivide", "sampleVariance", "skew", "select", "entropy", "binarySearchFromTo", "reverse", "add", "max", "pooledVariance", "sampleKurtosis", "evaluateNewton", "find_min", "harmonicMean", "ebeMultiply", "add_values", "array_copy", "insertion_sort", "quantile", "partition", "array_calc1", "set_min_val"].map(&:downcase)
@mult = [ "errorRate", "manhattanDistance", "power", "select", "square", "dot_product", "product", "hamming_dist", "computeCanberraDistance", "distance1", "checkNonNegative", "kurtosis", "chiSquare", "durbinWatson", "meanDeviation", "elementwise_min", "mean_absolute_error", "sumOfLogarithms", "find_euc_dist", "shell_sort", "selection_sort", "clip", "g", "ebeAdd", "pooledMean", "set_min_val", "sumOfPowerOfDeviations", "meanDifference", "sampleVariance", "array_copy", "min", "find_median", "insertion_sort", "elementwise_not_equal", "reverse", "harmonicMean", "average", "chebyshevDistance", "calculateAbsoluteDifferences", "ebeMultiply", "find_max", "eucleadianDistance", "pooledVariance", "add", "covariance", "autoCorrelation", "weighted_average", "evaluateHoners", "entropy", "manhattan_dist", "add_values", "checkPositive", "partition", "evaluateInternal", "skew", "bubble", "safeNorm", "find_max2", "winsorizedMean", "evaluateNewton", "ebeDivide", "tanimotoDistance", "geometric_mean", "elementwise_max", "quantile", "find_min", "variance", "polevl", "standardize", "find_magnitude", "max", "distanceInf", "evaluateWeightedProduct", "sum", "scale", "binarySearchFromTo"].map(&:downcase)
@exc = [ "find_max2", "evaluateWeightedProduct", "dot_product", "sum", "manhattanDistance", "chiSquare", "polevl", "count_k", "distance1", "cnt_zeroes", "hamming_dist", "computeCanberraDistance", "eucleadianDistance", "find_euc_dist", "sequential_search", "sumOfLogarithms", "distanceInf", "count_non_zeroes", "manhattan_dist", "add_values", "evaluateNewton", "sumOfPowerOfDeviations", "geometric_mean"].map(&:downcase)
@inc = [ "sumOfPowerOfDeviations", "manhattan_dist", "evaluateNewton", "add_values", "sum", "manhattanDistance", "checkPositive", "distance1", "count_k", "equals", "count_non_zeroes", "computeCanberraDistance", "eucleadianDistance", "find_min", "sequential_search", "dot_product", "polevl", "sumOfLogarithms", "distanceInf", "find_max2", "min", "cnt_zeroes", "evaluateWeightedProduct", "chiSquare", "geometric_mean", "evaluateHoners", "hamming_dist", "find_euc_dist", "checkNonNegative", "find_magnitude"].map(&:downcase)
@perm = [ "weightedMean", "sampleKurtosis", "variance", "errorRate", "pooledMean", "sumOfLogarithms", "harmonicMean", "safeNorm", "find_median", "kurtosis", "standardize", "sampleSkew", "sum", "find_max", "find_min", "sequential_search", "checkNonNegative", "product", "entropy", "geometric_mean", "count_non_zeroes", "add_values", "set_min_val", "find_max2", "min", "select", "checkPositive", "cnt_zeroes", "average", "skew", "sampleVariance", "meanDeviation", "count_k", "pooledVariance"].map(&:downcase)
@inv = [ "weightedRMS", "binarySearchFromTo", "eucleadianDistance", "reverse", "ebeAdd", "add_values", "find_min", "quantile", "clip", "standardize", "manhattanDistance", "product", "sumOfLogarithms", "meanDeviation", "add", "set_min_val", "ebeDivide", "checkNonNegative", "calculateAbsoluteDifferences", "array_copy", "find_euc_dist", "evaluateInternal", "insertion_sort", "min", "count_non_zeroes", "sampleSkew", "selection_sort", "polevl", "variance", "find_magnitude", "distance1", "checkPositive", "elementwise_not_equal", "computeCanberraDistance", "geometric_mean", "ebeMultiply", "power", "sum", "evaluateNewton", "errorRate", "hamming_dist", "chiSquare", "find_max2", "partition", "covariance", "distanceInf", "square", "evaluateHoners", "mean_absolute_error", "bubble", "meanDifference", "entropy", "sumOfPowerOfDeviations", "select", "pooledMean", "manhattan_dist", "find_median", "scale", "find_max", "max", "g", "harmonicMean", "sampleVariance", "average", "shell_sort", "elementwise_equal", "weightedMean"].map(&:downcase)
@add_mult = (@add + @mult).uniq.map(&:downcase)
@add_mult_inc = (@add + @mult + @inc).uniq.map(&:downcase)
@add_mult_inc_perm = (@add + @mult + @inc + @perm).uniq.map(&:downcase)
@add_mult_inc_perm_exc = (@add + @mult + @inc + @perm + @exc).uniq.map(&:downcase)
@all = (@add + @mult + @inc + @perm + @exc + @inv).uniq.map(&:downcase)

def parse_file(file)
    print "Parsing #{file}\n"
    file_name = File.split(file)[1]
    class_name = file_name.split(".")[0]
    
    in_file= File.open(file, "r")
    out_file = File.open( "#{class_name}_#{@mr}.csv", "a")

    if File.zero? out_file 
        puts "WRITING #{class_name} HEADER"
        out_file.puts(@header.join ",") 
    end

    run_count = 1

    begin
        run_map = {} #test => pass?
        loop do 
            line = in_file.readline

            if (line.include? "Generating Original Test Results")
                run_map = {} #reset since files have more than one run
                in_file.readline.split(/[{},]/).each do |part|
                    if part.length > 2 and !part.include? "exception"
                        test = part.split /\=/
                        puts "TEST - #{test}"
                        run_map[test[0].strip] = get_failures(test[1])
                    end
                end
                #print run_map
            end

            if (line.include? "Executing Mutants")

                live_map = {}
                killed_map = {}
                write_line = [ class_name, @mr, run_count ]
                total_live = 0
                total_killed = 0
                timeout = 0
                subtle = 0

                #total_live2 = 0
                #total_killed2 = 0
                

                loop do 
                    new_line = in_file.readline
                    if (new_line.include? "test report")
                        break
                    else
                        #process this mutant here
                        live = true
                        parts = new_line.split /[{}]/
                        
                        if parts[0] == "" then next end #erroneous unlabled result

                        #print "get_mutant_method(#{parts[0].strip.split(/[ &]/)[0]}, #{class_name})\n"
                        method_name = get_mutant_method(parts[0].strip.split(/[ &]/)[0], class_name)

                        if (@mr != "aggregate")
                            funcs = eval("@#{@mr}")
                            if (method_name.nil?) or !(funcs.include? method_name.downcase) #if this mutant is not relevant to this MR
                                #print "#{@mr} was not predicted for #{method_name} \n"
                                next
                            end
                        end


                        mutant_label = parts[0].split(/\_/)[0].lstrip[0..1] #category only
                        mutant_label = "DL" if ["SD", "VD", "CD", "OD"].include? mutant_label
                        #puts mutant_label

                        exceptions = parts[0].split /&/
                        exception_map = {}
                        except = false
                        if exceptions.length != 1 #there were exceptions
                            #each item an exception
                            for index in 1..(exceptions.length-1) do
                                exc_parts = exceptions[index].split /\./
                                if !(exception_map.has_key? exc_parts[1]) #func
                                    exception_map[exc_parts[1]] = [ exc_parts[2] ]
                                else
                                    exception_map[exc_parts[1]] << exc_parts[2]
                                end
                            end
                            #print "map is #{exception_map}\n"
                            #print "method is #{method_name}"
                        end
                        
                        if parts.length == 1 #timeout
                            #live = false #timeouts always die
                            timeout += 1
                            next #ignore timeouts
                        elsif exception_map.has_key? method_name
                            #print "Exception_map has key - #{method_name}: #{exception_map[method_name]}\n"
                            if (exception_map[method_name].include? @mr) or (@mr == "aggregate")
                                #print "^^adding\n"
                                subtle += 1
                            end
                            next #ingnore exceptions
                        else
                            tests = parts[1].split /,/
                            tests.each do |test|
                                results = test.lstrip.split /\=/
                                live = compare_failures(get_failures(results[1]), run_map[results[0]])
                                if live.nil? then next end #unused results
                                if (!live) then break end
                            end
                        end

                        update_map = live ? live_map : killed_map
                        if update_map.has_key? mutant_label
                            update_map[mutant_label] += 1
                        else
                            update_map[mutant_label] = 1
                        end
                    end
                    #this line done

                end

                @mutant_types.each do |type|

                    if live_map.has_key? type
                        write_line << live_map[type]
                        total_live += live_map[type]
                    else
                        write_line << 0
                    end

                    if killed_map.has_key? type
                        write_line << killed_map[type]
                        total_killed += killed_map[type]
                    else
                        write_line << 0
                    end
                end
                #write totals
                write_line << timeout
                write_line << subtle
                write_line << total_live                
                write_line << total_killed                
                write_line << (total_killed.to_f) / subtle
                mutant_score = ((total_killed.to_f) / (total_killed + total_live))
                write_line << "%.2f" % mutant_score
                out_file.puts write_line.join ","
                run_count += 1
                #print "Subtles:  #{subtle}\n"
                #print "Timeouts: #{timeout}\n"
            end
        end
    rescue EOFError
        #print "next File!\n"
    ensure 
        out_file.close
    end

end

def get_failures(result_string)
    # find_max2_test: 226; add failure&mult failure&exc failure&inc failure&perm failure&
    failures = []
    if result_string == "pass"
        return failures
    end
    under_consideration = ["add", "mult"]
    case @mr
    when "add_mult_inc"
        under_consideration << "inc"
    when "add_mult_inc_perm"
        under_consideration << "inc" << "perm"
    when "add_mult_inc_perm_exc"
        under_consideration << "inc" << "perm" << "exc"
    end
    result_string.split(/;/)[1].split(/&/).map(&:strip).keep_if { |x| under_consideration.include? x }
end

def compare_failures(original, mutant, mr = @mr)
    if original == mutant
        return true
    else
        return (((original.length == 0) and (mutant.length == 0)) or ((original.length != 0) and (mutant.length != 0)))
    end
end

def parse_dir(dir)
    print dir
    Dir.foreach(dir) do |file|
        parse_file File.join(dir, file) unless ((file == ".") or (file == ".."))
    end
end

def get_mutant_method(mutant_id, class_name)
    here = File.dirname(__FILE__)
    File.open(File.join(here, "..", "result", class_name, "traditional_mutants", "mutation_log"), "r") do |log|
        while line = log.gets
            parts = line.split /:/
            if parts[0] == mutant_id
                function_string = parts[2]
                start = function_string.index '_'
                stop = function_string.index '('
                return function_string[(start+1)...stop]
            end
        end
    end
    return nil
end

["aggregate"].each do |relation|
    @mr = relation
    puts "SUMMARIZING #{@mr}"

    ["MethodCollection2", "ApacheMath", "MethodsFromColt", "MethodsFromMahout"].each do |prefix|
        system("cat /dev/null > #{prefix}_#{@mr}.csv")
    end
    
    here = File.dirname(__FILE__)
    
    dirs = Dir.entries(here).select do |entry| 
     File.directory? File.join(here, entry) and !(entry =='.' || entry == '..') 
    end
    
    dirs.each do |directory|
        parse_dir directory
    end
end
