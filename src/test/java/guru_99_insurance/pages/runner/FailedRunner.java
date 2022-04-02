package guru_99_insurance.pages.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources",
        glue = "guru_99_insurance/pages/step_definitions")

public class FailedRunner {
}
