package com.neotech.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		//we specify the path to the feature files
		features="src/test/resources/features/",
		
		
		// we specify the path to the step definitions
		glue = "com.neotech.steps",
		
		dryRun = false, // if true, it will not run the tests, just check for issues (syntax, unglued
						// steps etc.)
		
		// we can use monochrome true for better readability in the console
		monochrome = true, 
		
		//with tags, we can specify which scenarios to run
		tags = "@dataTable"
		
		)


public class TestRunner {

}
