def build_map(file)
    map = {}
    File.open(file) do |f|
        f.readlines.each do |line|
            parts = line.split ','
            map[parts[0]] = parts[5].to_i unless parts[1] == 'timeout'
        end
    end
    map
end

def parse_file(file)
    print "Parsing #{file}\n"
    
    in_file= File.open(file, "r")

    run_count = 1
    mutants = {}

    begin
        run_map = {} #test => pass?
        loop do 
            line = in_file.readline

            if (line.include? "Executing Mutants")

                loop do 
                    new_line = in_file.readline
                    if (new_line.include? "test report")
                        break #next run
                    else
                        #process this mutant here
                        live = true
                        parts = new_line.split /[{}]/
                        if parts[0] == "" then next end #erroneous unlabled result
                        method_name = get_mutant_method(parts[0].strip.split(/[ &]/)[0], class_name)
                        mutant_label = parts[0].split(/&/)[0].lstrip #full mutant name
                        mutants[mutant_label = {} unless mutants.has_key? mutant_label
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
                            live = true
                            tests.each do |test|
                                results = test.lstrip.split /\=/
                                if results[1] != "pass" then live = false end
                                if (!live) then break end
                            end
                        end
                        if mutants[mutant_label].has_key? "live"

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
                run_count += 1
                #print "Subtles:  #{subtle}\n"
                #print "Timeouts: #{timeout}\n"
            end
        end
    rescue EOFError
        #print "next File!\n"
    ensure 
    end

end

#mr_file = File.open("report_MethodCollection2_mrs", "r")
mr_map = parse_file("report_MethodCollection2_mrs")
pre_map = build_map("report_MethodCollection2_pre.csv")
post_map = build_map("report_MethodCollection2_post.csv")

#pre_map.keys.each do |key|
    #puts key
#end

#mr_file.close
