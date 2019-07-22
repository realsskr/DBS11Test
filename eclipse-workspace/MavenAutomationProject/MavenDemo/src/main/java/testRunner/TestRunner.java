package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ADMIN\\eclipse-workspace\\MavenAutomationProject\\MavenDemo\\src\\main\\java\\AllFeatures",
		glue={"stepDef"},
		plugin= {"pretty"},
		tags= {}
		)


public class TestRunner {

}
