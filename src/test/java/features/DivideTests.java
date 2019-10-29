package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/bdd-test-results"},
        strict = true,
        features = {"src/test/resources/features/operations/divide.feature"}
)
public class DivideTests {

}