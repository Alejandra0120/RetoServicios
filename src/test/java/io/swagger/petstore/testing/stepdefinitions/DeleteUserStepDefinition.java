package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.testing.steps.DeleteUserStep;
import net.thucydides.core.annotations.Steps;

public class DeleteUserStepDefinition {

    @Steps
    DeleteUserStep deleteUserStep;

    @When("^the user request to delete user$")
    public void theUserRequestToDeleteUser() {
    deleteUserStep.DeleteUser();
    }

    @Then("^validate status code (\\d+)$")
    public void validateStatusCode(int statusCode) {
    deleteUserStep.validateStatusCode(statusCode);
    }
}
