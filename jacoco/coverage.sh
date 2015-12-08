cat /dev/null > jacoco.exec;
java -cp "/Users/anders/mu_case_studies/src/:/Users/anders/mu_case_studies/testset/" -javaagent:/Users/anders/mu_case_studies/jacoco-0.7.6-20151116.213627-34/lib/jacocoagent.jar=append=true org.junit.runner.JUnitCore MethodCollection2Tests;
java -cp "/Users/anders/mu_case_studies/src/:/Users/anders/mu_case_studies/testset/" -javaagent:/Users/anders/mu_case_studies/jacoco-0.7.6-20151116.213627-34/lib/jacocoagent.jar=append=true org.junit.runner.JUnitCore MethodsFromApacheMathTests;
java -cp "/Users/anders/mu_case_studies/src/:/Users/anders/mu_case_studies/testset/" -javaagent:/Users/anders/mu_case_studies/jacoco-0.7.6-20151116.213627-34/lib/jacocoagent.jar=append=true org.junit.runner.JUnitCore MethodsFromColtTests;
java -cp "/Users/anders/mu_case_studies/src/:/Users/anders/mu_case_studies/testset/" -javaagent:/Users/anders/mu_case_studies/jacoco-0.7.6-20151116.213627-34/lib/jacocoagent.jar=append=true org.junit.runner.JUnitCore MethodsFromMahoutTests;
ant;
