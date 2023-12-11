#!/bin/bash



cd Tests/Black_Box/Random
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest0
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest1
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest2
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest3



