package cucumber.junit5.gradle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleSteps {
    private int op1;
    private int op2;

    @Given("operands {int} and {int}")
    public void setOperands(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Then("their sum is {int}")
    public void checkSum(int sum) {
        assertEquals(sum, op1 + op2);
    }
}
