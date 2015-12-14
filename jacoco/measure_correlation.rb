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
                        mutant_label = parts[0].split(/&/)[0].lstrip #full mutant name
                        mutants[mutant_label] = {:live=>0, :dead=>0} unless mutants.has_key? mutant_label 
                        exceptions = parts[0].split /&/
                        #exception_map = {} #Let's just ignore exceptions for now
                        #except = false
                        #if exceptions.length != 1 #there were exceptions
                            #each item an exception
                            #for index in 1..(exceptions.length-1) do
                                #exc_parts = exceptions[index].split /\./
                                #if !(exception_map.has_key? exc_parts[1]) #func
                                    #exception_map[exc_parts[1]] = [ exc_parts[2] ]
                                #else
                                    #exception_map[exc_parts[1]] << exc_parts[2]
                                #end
                            #end
                        #end
                        
                        if parts.length == 1 #timeout
                            #live = false #timeouts always die
                            #timeout += 1
                            next #ignore timeouts
                        #elsif exception_map.has_key? method_name
                            #print "Exception_map has key - #{method_name}: #{exception_map[method_name]}\n"
                            #if (exception_map[method_name].include? @mr) or (@mr == "aggregate")
                                #print "^^adding\n"
                                #subtle += 1
                            #end
                            #next #ingnore exceptions
                        elsif exceptions.length > 1
                            next
                        else
                            tests = parts[1].split /,/
                            live = true
                            tests.each do |test|
                                results = test.lstrip.split /\=/
                                if results[1] != "pass" then live = false end
                                if (!live) then break end
                            end
                        end
                        if live
                            mutants[mutant_label][:live] += 1
                        else
                            mutants[mutant_label][:dead] += 1
                        end

                    end
                    #this line done

                end

                run_count += 1
                #print "Subtles:  #{subtle}\n"
                #print "Timeouts: #{timeout}\n"
            end
        end
    rescue EOFError
        print "next File!\n"
    ensure 
    end
    mutants
end

mr_map = parse_file("report_MethodCollection2_mrs")

mr_map.keys.each do |mut|
    puts "#{mut}: #{mr_map[mut]}"
end
=begin
pre_map = build_map("report_MethodCollection2_pre.csv")
post_map = build_map("report_MethodCollection2_post.csv")

match = 0
mismatch = 0
pre_map.keys.each do |key|
    if pre_map[key] == post_map[key]
        match += 1
    else
        mismatch += 1
    end
end

print "Match: #{match}"
print "Mismatch: #{mismatch}"

=end
