
def parse_file(filename)
    input_file = File.open(filename, "r")
    output_file = File.open("#{filename}_out", "w")
    counts = {}
    for line in input_file.readlines()
        parts = line.split /[\[\]]/
        funcs = parts[1].split /,/
        flags = parts[3].split /,/
        if funcs.size != flags.size then puts "PANIC!\n" end
        #puts "LINE: #{line}"
        #puts "Functions: #{funcs}"
        #puts "flags: #{flags}"
        for index in (0..funcs.size)
            #puts "PAIR: #{funcs[index]}, #{flags[index]}"
            func_name = funcs[index]
            if (counts.has_key? func_name)
                if flags[index] == "1"
                    counts[func_name] += 1
                end
            elsif flags[index] == "1"
                counts[func_name] = 1
            end
        end
    end

    for key in counts.keys
        if counts[key].to_i >= 5
            output_file.puts "#{key}: #{counts[key]}"
        end
    end

end

parse_file "addPreds"
parse_file "excPreds"
parse_file "incPreds"
parse_file "invPreds"
parse_file "mulPreds"
parse_file "perPreds"
