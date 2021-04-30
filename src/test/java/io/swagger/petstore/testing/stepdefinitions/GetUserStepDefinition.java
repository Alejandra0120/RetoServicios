package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.testing.steps.GetUserStep;
import net.thucydides.core.annotations.Steps;

public class GetUserStepDefinition {

    @Steps
    GetUserStep getUserStep;

    @When("^the user request to get user$")
    public void theUserRequestToGetUser() {
        getUserStep.getUser();
    }

    @Then("^validate information$")
    public void validateInformation() {
        getUserStep.validateResponseFirstname();
        getUserStep.validateResponseLastname();
        getUserStep.validateResponseEmail();

    }

}
