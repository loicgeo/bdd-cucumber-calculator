package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/bdd-test-results"
        }

        // if true, make fail tests if scenario are not completely implemented
        // (there still are expressions to be included in steps)
        , strict = true

        // allow to run or not tests according your own tags
//        ,tags = {"@fail"} // only tagged @fail (+ not tagged)
        , tags = {"not @wip"} // exclude tagged @wip (+ not tagged)
//        ,tags = {"@fail", "@wip"} // only tagged @fail && @wip (+ not tagged)
//        ,tags = {"@fail, @wip"} // only tagged @fail || @wip (+ not tagged)
//        ,tags = {"@fail, @wip", "@whouhouhou"} // only tagged (@fail || @wip) && @whouhouhou (+ not tagged)
)
public class CucumberTests {

}