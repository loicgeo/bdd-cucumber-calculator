package features.steps.operations;

import com.loicgeo.katas.service.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.BusinessException;
import features.steps.Steps;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddNumbersSteps extends Steps {

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Given("two numbers {int} and {int}")
    public void two_numbers_and(Integer number1, Integer number2) {
        calculator.addNumber(number1);
        calculator.addNumber(number2);
    }

    @Given("several numbers {string}")
    public void severalNumbers(String givenNumbers) {
        try {
            Stream.of(givenNumbers.split(","))
                    .forEach(n -> calculator.getNumbers().add(Integer.valueOf(n.trim())));
        } catch (NumberFormatException e) {
            addException(new BusinessException("NumberFormatException"));
        }
    }

    @When("i make an addition")
    public void i_make_an_addition() {
        calculator.addition();
    }

    @Then("result is equal to {int}")
    public void result_is_equal_to(Integer expected) {
        assertEquals(expected, calculator.getResult());
    }

    @Then("i expect a {string} exception")
    public void i_expect_a_exception_name(String exceptionName) {
        assertThat(getExceptions().stream().map(e -> e.getName()))
                .anyMatch(s -> s.contains(exceptionName));
    }

}
