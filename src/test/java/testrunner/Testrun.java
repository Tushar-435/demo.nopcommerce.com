package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/register.feature"},
glue ="stepdef",
dryRun = false , monochrome = false ,
plugin = {
		"pretty", "html:target/Cucumber-report/report.html"},

		tags="@regression"
		)


public class Testrun {

}
