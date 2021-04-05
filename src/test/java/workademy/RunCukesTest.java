package workademy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * RunCukesTest
 * Class for running tests.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "workademy",
        strict = true,
        tags = "@positive_sign_in"
)
public class RunCukesTest {
}
