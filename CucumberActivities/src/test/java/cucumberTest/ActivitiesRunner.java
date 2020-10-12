package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity1_3",
    dryRun = false,
    monochrome = true,
    stepNotifications = true,
    plugin = "pretty"
)

public class ActivitiesRunner {

}
