require 'csv'
require 'pp'

funcs = {}

types = ["AO", "RO", "CO", "LO", "SO", "AS", "SD", "VD", "CD", "OD"]

CSV.foreach("SAXSResultsOnly.csv") do |row|
    if row.length == 0 then break end 

    if !funcs.has_key? row[0]
        newmap = {}
        newmap["good"] = 0
        newmap["seen"] = []
        types.each { |type| newmap[type] = 0 }
        funcs[row[0]] = newmap
    end

    thismap = funcs[row[0]]
    (2...row.length).each do |index|
        entry = row[index]
        type = types[types.index entry[0..1]]
        if type.nil? then puts "Type not parsed for #{entry}" end
        if row[1] == "good"
            thismap["good"] +=1
        else
            thismap[type] += 1 unless thismap["seen"].include? entry
            thismap["seen"] << entry
        end
    end

end

#pp funcs

funcs.keys.each do |func|
    good = funcs[func]["good"]
    funcs[func].keys.each do |type|
        if type != "good" and type != "seen"
            val = funcs[func][type]
            puts "#{func}-#{type}: #{funcs[func][type].to_f / good}" unless val == 0
        end
    end
end
