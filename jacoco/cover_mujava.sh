cat /dev/null > /Users/anders/mu_case_studies/jacoco/jacoco.exec;
cd /Users/anders/mu_case_studies;
java -cp "openjava.jar:bin/" -javaagent:/Users/anders/mu_case_studies/jacoco/lib/jacocoagent.jar=append=false,dumponexit=true,classdumpdir=/Users/anders/mu_case_studies/jacoco/class_dump_dir,destfile=/Users/anders/mu_case_studies/jacoco/jacoco.exec mujava.gui.RunTestMain;
cd /Users/anders/mu_case_studies/jacoco;
ant;
