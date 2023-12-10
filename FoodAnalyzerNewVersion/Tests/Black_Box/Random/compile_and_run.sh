#!/bin/bash

[Desktop Entry]
Name=RandomScript
Exec=./compile_and_run.sh
Type=Application
Terminal=true



cd Tests/Black_Box/Random
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest0
java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore RegressionTest1




