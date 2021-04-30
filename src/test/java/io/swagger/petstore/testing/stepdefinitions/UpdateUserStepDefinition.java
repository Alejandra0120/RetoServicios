package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.testing.models.UserModel;
import io.swagger.petstore.testing.steps.UpdateUserStep;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class UpdateUserStepDefinition {

    @Steps
    UpdateUserStep updateUserStep;

    @When("^the user updates an user$")
    public void theUserUpdatesAnUser(List<UserModel> userModelList) {
    updateUserStep.updateUser(userModelList.get(0).get_id(),
            userModelList.get(0).get_username(),
            userModelList.get(0).get_firstName(),
            userModelList.get(0).get_lastName(),
            userModelList.get(0).get_email(),
            userModelList.get(0).get_password(),
            userModelList.get(0).get_phone(),
            userModelList.get(0).get_userStatus());
    }

    @Then("^verify firstname is changed$")
    public void verifyFirstnameIsChanged() {
    updateUserStep.validateResponseFirstnameUpdated();
    }
}
