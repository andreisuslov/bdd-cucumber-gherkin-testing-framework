package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions {

    Calculator  calculator;
    Integer result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator  = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer a, Integer b) {
        result = calculator.add(a,b);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer expectedResult) {
        assertThat(result).isEqualTo(expectedResult);
    }

}
