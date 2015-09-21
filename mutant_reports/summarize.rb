@mr = "aggregate"

@header = [
    "class", "method", "mr", "run", "mutant_score", 
    "total_live", "total_killed",
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
    "ODL_live", "ODL_killed"]

def parse_file(file)
    print "Parsing #{file}\n"
    file_name = File.split(file)[1]
    class_name = file_name.split(".")[0]
    method_name = file_name.split(".")[1]

    print "Class: #{class_name}\n"
    print "Method: #{method_name}\n"

    in_file= File.open(file, "r")
    out_file = File.open( "#{class_name}_#{@mr}", "w")

    out_file.puts(@header.join ",")

    begin
        loop do 
            line = in_file.readline
            if (line.include? "Executing Mutants")
                live_map = {}
                killed_map = {}
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
                            if results[1] != "pass"
                                live = false
                            end
                            #print "#{results}\n"
                        end

                        update_map = live ? live_map : killed_map
                        if update_map.has_key? mutant_label
                            update_map[mutant_label] += 1
                        else
                            update_map[mutant_label] = 1
                        end
                    end
                    #this run done
                    
                end
            end
        end
    rescue EOFError
        #print "next File!\n"
    end

end

def parse_dir(dir)
    print dir
    Dir.foreach(dir) do |file|
        parse_file File.join(dir, file) unless ((file == ".") or (file == ".."))
    end
end

here = File.dirname(__FILE__)
=begin
dirs = Dir.entries(here).select do |entry| 
	File.directory? File.join(here, entry) and !(entry =='.' || entry == '..') 
end

dirs.each do |directory|
    parse_dir directory
end
=end

parse_file File.join(here, "aggregate", "MethodCollection2.add_values")

