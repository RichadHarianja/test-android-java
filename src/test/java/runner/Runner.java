package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin = {
				"pretty",
				"html:/Users/richadharianja/PRIVATE/Project/Automation/android-java-appium-cucumber/report/report.html",
				"json:/Users/richadharianja/PRIVATE/Project/Automation/android-java-appium-cucumber/report/cucumber-report.json"
		},
		features = {"src/test/resources" },
		glue = "stepDefinitions",
		tags = "@test")

public class Runner {

}
