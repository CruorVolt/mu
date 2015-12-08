require 'csv'
require 'pp'

funcs = {}

#types = ["AO", "RO", "CO", "LO", "SO", "AS", "SD", "VD", "CD", "OD"]
mrs = ["mul", "inc","per","exc","inv"]

CSV.foreach("SAXSResultsOnly.csv") do |row|
    if row.length == 0 then break end 

    if !funcs.has_key? row[0]
        newmap = {}
        newmap["good"] = []
        #types.each { |type| newmap[type] = [] }
        mrs.each { |mr| newmap[mr] = [] }
        funcs[row[0]] = newmap
    end

    thismap = funcs[row[0]]
    (2...row.length).each do |index|
        entry = row[index]
        #type = types[types.index entry[0..1]]
        #if type.nil? then puts "Mr not parsed for #{entry}" end
        mr = row[1]
        if row[1] == "good"
            thismap["good"] << entry
        else
            thismap[mr] << entry unless thismap[mr].include? entry
        end
    end

end

#pp funcs

funcs.keys.each do |func|
    good = funcs[func]["good"]
    funcs[func].keys.each do |mr|
        if mr != "good"
            #val = funcs[func][mr]
            these_mutants = []
            print mrs[0..(mrs.index mr)]
            (0..(mrs.index mr)).each do |index|
                unless funcs[func][mrs[index]].nil?
                    these_mutants = these_mutants + funcs[func][mrs[index]] unless funcs[func][mrs[index]].nil?
                    print "HEY!: #{these_mutants.size}\n"
                end
            end
            val = these_mutants.uniq.size.to_f
            good_examples = 0
            good.each do |thisone|
                good_examples += 1 #unless (types[types.index thisone[0..1]] != type)
            end
            puts "#{func}-#{mr}: #{val / good_examples.to_f}" unless good_examples == 0
        end
    end
end
