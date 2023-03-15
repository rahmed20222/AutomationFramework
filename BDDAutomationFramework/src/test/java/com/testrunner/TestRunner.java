package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features ="AutomatedTCFolder" ,
					tags = "@test", 
					plugin= {"json:target/cucumber-reports/cucumber.json", 
							"pretty", "html:target/html-report/cucumber-html-reports.html",
							"junit:target/cucumber-reports/cucumber.xml", "timeline:test-output-thread/"}
                   ,glue={"com.AmazonStepdefs"})

public class TestRunner {

}
