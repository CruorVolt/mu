require 'nokogiri'
require 'timeout'

@CLASS = "MethodCollection2"
@TEST = "pre" #options are "mr", "pre", "post"
@base_dir = File.join("/Users","anders","mu_case_studies")

def b_join(*args)
    File.join(@base_dir, *args)
end

@test_location = b_join("testset")
@src_location = b_join("src")

=begin
Get a master list of the mutants
For each mutant:
    Run the test with jacoco instrumentation and the correct classpath for this mutant inserted into the JVM:
    >> Either move the files to the right place or write the new location to build.xml (maybe dumping is good idea...)
        Run the initial test in one JVM
            save this coverage
        Run the followup test in a second JVM
            save this coverage
    Get the actual MR results for the mutant
=end

#get all the mutants - actually, we just need the classpath
def parse_dir(dir)
    output_file = File.open(b_join("jacoco", "report_#{@CLASS}_#{@TEST}.csv"), "w")
    Dir.foreach(dir) do |method_folder|
        method_path = File.join(dir, method_folder)
        if (!([".", ".."].include? method_folder) and File.directory?(method_path))
            Dir.foreach(method_path) do |mutant_folder|
                classpath = File.join(method_path, mutant_folder) #this appears to be the classpath for the mutant
                if (!([".", ".."].include? mutant_folder) and File.directory?(classpath))
                    puts "MUTANT_FOLER: #{mutant_folder}"
            
                    #now we need to run the test...... let's build the command
                    invoke_arr = ["java"]
                    invoke_arr << "-Dtest=#{@TEST}"
                    invoke_arr << "-cp \"#{@test_location}:#{classpath}\""
                    agent_args = [
                        "append=false", 
                        "dumponexit=true", 
                        "classdumpdir=#{b_join("jacoco", "class_dump_dir")}",
                        "destfile=#{b_join("jacoco", "jacoco.exec")}"
                    ]
                    invoke_arr << "-javaagent:#{b_join("jacoco","lib","jacocoagent.jar")}=#{agent_args.join ','}"
                    invoke_arr << "org.junit.runner.JUnitCore"
                    invoke_arr << "#{@CLASS}Tests"

                    #now modify build.xml to report on these sources
                    reference_build_xml = File.open("ref.xml", "r") { |ref| Nokogiri::XML(ref) }
                    classfiles = (reference_build_xml.xpath "//classfiles")[0]
                    sourcefiles = (reference_build_xml.xpath "//sourcefiles")[0]
                    classfiles.add_child "<fileset dir=\"#{classpath}\" />\n"
                    sourcefiles.add_child "<fileset dir=\"#{classpath}\" />\n"
                    File.write("build.xml", reference_build_xml.to_xml)

                    puts invoke_arr.join(' ')
                    pid = Process.spawn(invoke_arr.join(' '))
                    begin
                        Timeout.timeout(5) do 
                            puts "Waiting for #{mutant_folder}"
                            Process.wait(pid)
                            puts "#{mutant_folder} finished"
                        end
                        system "ant -buildfile #{b_join('jacoco')}"
                        File.open(b_join("jacoco", "report.csv"), "r") do |report|
                            output_file.puts([mutant_folder,report.readlines[-1]].join ',')
                        end
                    rescue Timeout::Error
                        puts "Mutant #{mutant_folder} timed out"
                        Process.kill("SIGTERM", pid)
                        File.open(b_join("jacoco", "report.csv"), "r") do |report|
                            output_file.puts([mutant_folder,"timeout"].join ',')
                        end
                    end

                end
            end
        end
    end
    output_file.close
end

parse_dir(b_join("result", @CLASS, "traditional_mutants"))
