package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


    @CucumberOptions(
            features = {"src\\test\\java\\Feature\\FormAuthentication.feature"},
            glue = {"stepDefinitions"},
            dryRun = false,
            monochrome = true,
            tags = {""},
            plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
    )

    public class TestRunner extends AbstractTestNGCucumberTests {
    }


