require 'csv'

out = CSV.open("TYPES.csv", "w")
rows = 0

CSV.foreach("agg_combined.csv") do |row|
    if rows == 0 
        out << [ "Class", "MR", "MutantType", "Live", "Killed", "Score" ]
        rows += 1 
    else
        print "#{row}\n"
        out << [ row[1], row[2], "arithmetic", row[4], row[5], row[5].to_f / (row[4].to_f + row[5].to_f) ]
        out << [ row[1], row[2], "relational", row[6], row[7], row[7].to_f / (row[6].to_f + row[7].to_f)]
        out << [ row[1], row[2], "conditional", row[8], row[9], row[9].to_f / (row[8].to_f + row[9].to_f) ]
        out << [ row[1], row[2], "shift", row[10], row[11], row[11].to_f / (row[10].to_f + row[11].to_f) ]
        out << [ row[1], row[2], "logical", row[12], row[13], row[13].to_f / (row[12].to_f + row[13].to_f) ]
        out << [ row[1], row[2], "assignment", row[14], row[15], row[15].to_f / (row[14].to_f + row[15].to_f) ]
        out << [ row[1], row[2], "deletion", row[16], row[17], row[17].to_f / (row[16].to_f + row[17].to_f) ]
    end
end

out.close
