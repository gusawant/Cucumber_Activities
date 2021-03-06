package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"stepDefinitions"},
		tags = "@activity1_5",
		dryRun = false,
		monochrome = true,
		stepNotifications = true,
		plugin = {"pretty", 
				"html:target/cucumber-reports/report.html",
				"json:target/cucumber-reports/report.json",}
		)

public class ActivitiesRunner {

}
