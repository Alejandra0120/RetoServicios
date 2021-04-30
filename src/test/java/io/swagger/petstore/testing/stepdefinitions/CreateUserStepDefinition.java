package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.testing.models.UserModel;
import io.swagger.petstore.testing.steps.CreateUserStep;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CreateUserStepDefinition {
    @Steps
    private CreateUserStep createUserStep;

    @Given("^the user verify internet connection$")
    public void theUserVerifyInternetConnection() {
    createUserStep.checkStatusConnection();
    }

    @When("^the user creates a new user$")
    public void theUserCreatesANewUser(List<UserModel> userModelList) {
    createUserStep.createUser(userModelList.get(0).get_id(),
            userModelList.get(0).get_username(),
            userModelList.get(0).get_firstName(),
            userModelList.get(0).get_lastName(),
            userModelList.get(0).get_email(),
            userModelList.get(0).get_password(),
            userModelList.get(0).get_phone(),
            userModelList.get(0).get_userStatus()
            );
    }

    @Then("^verify status code (\\d+)$")
    public void verifyStatusCode(int statusCode) {
    createUserStep.verifyStatusCode(statusCode);
    }
}
