package io.swagger.petstore.testing.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static io.swagger.petstore.testing.utils.URLSwagger.URI_BASE;
import static io.swagger.petstore.testing.utils.URLSwagger.URI_SUFFIX_USERNAME_USER;
import static io.swagger.petstore.testing.utils.UserEnum.FIRSTNAME_USER;
import static io.swagger.petstore.testing.utils.UserEnum.USERNAME;

public class DeleteUserStep {
    private Response response;

    public DeleteUserStep(Response response) {
        this.response = response;
    }

    public DeleteUserStep() {
    }

    @Step
    public void DeleteUser(){
        response = SerenityRest.given().contentType("application/json").baseUri(URI_BASE.getValue()).
                basePath(URI_SUFFIX_USERNAME_USER.getValue()).when().delete();
        System.out.println(response);
    }
    @Step
    public void validateStatusCode(int statusCode){
        SerenityRest.lastResponse().then().assertThat().statusCode(statusCode);
        String message= response.body().jsonPath().get("message");
        Assert.assertThat(USERNAME.getValue(), Matchers.is(message));
        System.out.println(message);
    }

}
