#!/usr/bin/env bash
#java -cp ".:/Users/anders/mu_case_studies/src" -javaagent:/Users/anders/mu_case_studies/jacoco/lib/jacocoagent.jar=append=false,dumponexit=true,classdumpdir=/Users/anders/mu_case_studies/jacoco/class_dump_dir,destfile=/Users/anders/mu_case_studies/jacoco/jacoco.exec org.junit.runner.JUnitCore $1;
java -Dtest=$2 -cp ".:/Users/anders/mu_case_studies/result/MethodCollection2/traditional_mutants/double_average(int)/AOIS_335/" -javaagent:/Users/anders/mu_case_studies/jacoco/lib/jacocoagent.jar=append=false,dumponexit=true,classdumpdir=/Users/anders/mu_case_studies/jacoco/class_dump_dir,destfile=/Users/anders/mu_case_studies/jacoco/jacoco.exec org.junit.runner.JUnitCore $1;
#cd /Users/anders/mu_case_studies/jacoco;
#ant;
#cd /Users/anders/mu_case_studies/testset;
