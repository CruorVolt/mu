@CLASS = "stream.SamLine"

def b_join(*args)
    File.join(@base_dir, *args)
end

@base_dir = File.join("/Users","anders","mu_case_studies")
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
    Dir.foreach(dir) do |method_folder|
        method_path = File.join(dir, method_folder)
        if (!([".", ".."].include? method_folder) and File.directory?(method_path))
            Dir.foreach(method_path) do |mutant_folder|
                classpath = File.join(method_path, mutant_folder) #this appears to be the classpath for the mutant
                puts classpath
            
                #now we need to run the test...... let's build the command
                agent_args = [
                    "append=false", 
                    "dumponexit=true", 
                    "classdumpdir=#{b_join("mu_case_studies", "jacoco", "class_dump_dir")}",
                    "destfile=#{b_join("jacoco", "jacoco.exec")}"
                ]
                #priority is argument ordered for classpath
                invoke = "java -cp \"#{@test_location}:#{classpath}:#{@src_location}\" -javaagent:#{b_join("jacoco","lib","jacocoagent.jar")}=append=false,dumponexit=true,classdumpdir=/Users/anders/mu_case_studies/jacoco/class_dump_dir,destfile=/Users/anders/mu_case_studies/jacoco/jacoco.exec org.junit.runner.JUnitCore $1;"
            end
        end
    end
end

parse_dir(b_join("result", "MethodCollection2", "traditional_mutants"))
