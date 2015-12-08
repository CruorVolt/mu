require 'nokogiri'
require 'shellwords'

xml_out = File.open("ref.xml", "r") { |ref| Nokogiri::XML(ref) }

#struct = xml_out.xpath "//structure" #struct[0] is the Element we want?
classfiles = (xml_out.xpath "//classfiles")[0]
sourcefiles = (xml_out.xpath "//sourcefiles")[0]

p classfiles
p sourcefiles

base_dir = "/Users/anders/mu_case_studies/result/"
Dir.foreach(base_dir) do |class_dir|
    mutants_folder = File.join(base_dir, class_dir, "traditional_mutants")
    if !([".", ".."].include? class_dir) and (File.directory? mutants_folder)
        puts "Class dir: #{class_dir}"
        Dir.foreach(mutants_folder) do |method_dir|
            method_folder = File.join(mutants_folder, method_dir)
            if !([".", ".."].include? method_dir) and (File.directory? method_folder)
                puts "Method dir: #{method_dir}"
                Dir.foreach(method_folder) do |mutant_dir|
                    final_path = File.join(method_folder, mutant_dir)
                    if !([".", ".."].include? mutant_dir) and (File.directory? final_path)
                        puts "Final path: #{final_path}"
                        classfiles.add_child "<fileset dir=\"#{final_path}\" />\n"
                        sourcefiles.add_child "<fileset dir=\"#{final_path}\" />\n"
                    end
                end
            end
        end
    end
end

File.write("build.xml", xml_out.to_xml)
