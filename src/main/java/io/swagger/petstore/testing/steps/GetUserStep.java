package io.swagger.petstore.testing.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static io.swagger.petstore.testing.utils.URLSwagger.*;
import static io.swagger.petstore.testing.utils.UserEnum.*;

public class GetUserStep {
private Response response;

    public GetUserStep(Response response) {
        this.response = response;
    }

    public GetUserStep() {
    }

    @Step
    public void getUser(){
       response = SerenityRest.given().baseUri(URI_BASE.getValue()).basePath(URI_SUFFIX_USERNAME_USER.getValue()).log().all().get();
       System.out.println(response);
    }

    @Step
    public void validateResponseFirstname(){
        String firstname = response.body().jsonPath().get("firstName");
        Assert.assertThat(FIRSTNAME_USER.getValue(), Matchers.is(firstname));
        System.out.println(firstname);
    }
    @Step
    public void validateResponseLastname(){
        String lastname= response.body().jsonPath().get("lastName");
        Assert.assertThat(LASTNAME_USER.getValue(), Matchers.is(lastname));
        System.out.println(lastname);
    }
    @Step
    public void validateResponseEmail(){
        String email = response.body().jsonPath().get("email");
        Assert.assertThat(EMAIL_USER.getValue(), Matchers.is(email));
        System.out.println(email);
    }
}
