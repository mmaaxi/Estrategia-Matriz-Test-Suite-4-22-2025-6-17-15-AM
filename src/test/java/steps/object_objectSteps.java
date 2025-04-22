package steps;

import pages.object_objectPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class object_objectSteps {
    object_objectPage objectPage = new object_objectPage();

    @Given("I am on the object Object page")
    public void i_am_on_object_object_page() {
        objectPage.navigateToObjectPage();
    }

    @When("object Object")
    public void object_Object_action1() {
        objectPage.performObjectAction1();
    }

    @Then("object Object")
    public void object_Object_result1() {
        objectPage.verifyObjectResult1();
    }

    // Repeat for other actions/results

    @When("object Object")
    public void object_Object_action2() {
        objectPage.performObjectAction2();
    }

    @Then("object Object")
    public void object_Object_result2() {
        objectPage.verifyObjectResult2();
    }

    // Additional action and result methods here...

}