@mr = "aggregate"

@mutant_types = [ "AORB", "AORS", "AOIU", "AOIS", "AODU",
    "AODS", "ROR", "COR", "COD", "COI", "SOR", "LOR",
    "LOI", "LOD", "ASRS", "SDL", "VDL", "CDL", "ODL" ]

@header = [
    "class", "method", "mr", "run",
    "AORB_live", "AORB_killed",
    "AORS_live", "AORS_killed",
    "AOIU_live", "AOIU_killed",
    "AOIS_live", "AOIS_killed",
    "AODU_live", "AODU_killed",
    "AODS_live", "AODS_killed",
    "ROR_live", "ROR_killed",
    "COR_live", "COR_killed",
    "COD_live", "COD_killed",
    "COI_live", "COI_killed",
    "SOR_live", "SOR_killed",
    "LOR_live", "LOR_killed",
    "LOI_live", "LOI_killed",
    "LOD_live", "LOD_killed",
    "ASRS_live", "ASRS_killed",
    "SDL_live", "SDL_killed",
    "VDL_live", "VDL_killed",
    "CDL_live", "CDL_killed",
    "ODL_live", "ODL_killed",
    "total_live", "total_killed", "mutant_score"]

def parse_file(file)
    print "Parsing #{file}\n"
    file_name = File.split(file)[1]
    class_name = file_name.split(".")[0]
    method_name = file_name.split(".")[1]

    #print "Class: #{class_name}\n"
    #print "Method: #{method_name}\n"

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
                in_file.readline.split(/[{},]/).each do |part|
                    if part.length > 2
                        test = part.split /\=/
                        #puts "PART: #{part}, TEST - #{test}"
                        run_map[test[0].lstrip] = (test[1] == "pass") ? true : false
                    end
                end
                #print run_map
            end

            if (line.include? "Executing Mutants")

                live_map = {}
                killed_map = {}
                write_line = [ class_name, method_name, @mr, run_count ]
                total_live = 0
                total_killed = 0

                total_live2 = 0
                total_killed2 = 0

                loop do 
                    new_line = in_file.readline
                    if (new_line.include? "test report")
                        break
                    else
                        #process this mutant here
                        live = true
                        parts = new_line.split /[{}]/
                        mutant_label = parts[0].split(/\_/)[0].lstrip

                        tests = parts[1].split /,/
                        
                        tests.each do |test|
                            results = test.lstrip.split /\=/
                            passed = (results[1] == "pass") ? true : false
                            live = false if passed != run_map[results[0]]
                        end

                        if live
                            total_live2 += 1
                        else
                            total_killed2 += 1
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
                write_line << total_live                
                write_line << total_killed                
                mutant_score = ((total_killed.to_f) / (total_killed + total_live))
                write_line << "%.2f" % mutant_score
                out_file.puts write_line.join ","
                run_count += 1
            end
        end
    rescue EOFError
        #print "next File!\n"
    ensure 
        out_file.close
    end

end

def parse_dir(dir)
    print dir
    Dir.foreach(dir) do |file|
        parse_file File.join(dir, file) unless ((file == ".") or (file == ".."))
    end
end

system("./trunc.sh")

here = File.dirname(__FILE__)

dirs = Dir.entries(here).select do |entry| 
	File.directory? File.join(here, entry) and !(entry =='.' || entry == '..') 
end

dirs.each do |directory|
    parse_dir directory
end

#parse_file File.join(here, "aggregate", "MethodCollection2.add_values")

