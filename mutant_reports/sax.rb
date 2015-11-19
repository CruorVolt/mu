require 'csv'
require 'pp'

funcs = {}

types = ["AO", "RO", "CO", "LO", "SO", "AS", "SD", "VD", "CD", "OD"]

CSV.foreach("SAXSResultsOnly.csv") do |row|
    if row.length == 0 then break end 

    if !funcs.has_key? row[0]
        newmap = {}
        newmap["good"] = []
        types.each { |type| newmap[type] = [] }
        funcs[row[0]] = newmap
    end

    thismap = funcs[row[0]]
    (2...row.length).each do |index|
        entry = row[index]
        type = types[types.index entry[0..1]]
        if type.nil? then puts "Type not parsed for #{entry}" end
        if row[1] == "good"
            thismap["good"] << entry
        else
            thismap[type] << entry unless thismap[type].include? entry
        end
    end

end

pp funcs

funcs.keys.each do |func|
    good = funcs[func]["good"]
    funcs[func].keys.each do |type|
        if type != "good"
            val = funcs[func][type]
            good_examples = 0
            good.each do |thisone|
                good_examples += 1 unless (types[types.index thisone[0..1]] != type)
            end
            puts "#{func}-#{type}: #{funcs[func][type].size.to_f / good_examples.to_f}" unless good_examples == 0
        end
    end
end
