package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "D:/automation_workspace/MyAmazonCucumber/src/main/java/com/qa/feature/Amazon.feature" //path of the feature file
		,glue= {"com/qa/stepDefination"}, // path of the stepdefination file.
		 monochrome= true, //display the console output in more reable format
	     format = {"pretty","html:test-output", "junit:junit_output/output.xml"},
	     strict = true, // it will check if any step is not defined(write fun) in stepDefination file
		 dryRun= false // to check mapping is proper between feature file and stepDefination file
		
        )

public class TestRunner {

}
