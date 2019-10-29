package features.steps.operations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.BusinessException;
import features.steps.Steps;

public class DivideNumbersSteps extends Steps {

    @When("i make a division")
    public void i_make_a_division() {
        try {
            calculator.divide();
        } catch (ArithmeticException e) {
            addException(new BusinessException("ERR_DIVIDE_BY_ZERO"));
        }
    }

    @Then("i expect a ERR_DIVIDE_BY_ZERO exception")
    public void i_expect_a_ERR_DIVIDE_BY_ZERO_exception() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
