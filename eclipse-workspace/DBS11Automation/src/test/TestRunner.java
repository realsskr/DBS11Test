package test;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= {"stepdefinition"},
		tags= {"@SmokeTest"})


public class TestRunner {

}
