package dbs11marketplacetest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue= {"stepdefinition"},
		plugin= {"Pretty"})


public class TestRunner {

}
