package io.swagger.petstore.testing.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.swagger.petstore.testing.utils.URLSwagger.*;
import static io.swagger.petstore.testing.utils.UserEnum.FIRSTNAME_UPDATE_USER;
import static io.swagger.petstore.testing.utils.UserEnum.FIRSTNAME_USER;

public class UpdateUserStep {
    private Map<String, Object> jsonMap = new HashMap<>();
    private Response response;

    @Step
    public void updateUser(String id,String username, String firstName,
                           String lastName, String email, String password, String phone,String userStatus){
        jsonMap.put("id", id);
        jsonMap.put("username", username);
        jsonMap.put("firstName", firstName);
        jsonMap.put("lastName",lastName);
        jsonMap.put("email",email);
        jsonMap.put("password",password);
        jsonMap.put("phone",phone);
        jsonMap.put("userStatus",userStatus);

       SerenityRest.given().contentType("application/json").baseUri(URI_BASE.getValue()).
                basePath(URI_SUFFIX_USERNAME_USER.getValue()).content(jsonMap).log().body().when().put();

        response = SerenityRest.given().baseUri(URI_BASE.getValue()).basePath(URI_SUFFIX_USERNAME_USER.getValue()).log().all().get();

    }

    @Step
    public void validateResponseFirstnameUpdated(){
        String firstname = response.body().jsonPath().get("firstName");
        Assert.assertThat(FIRSTNAME_USER.getValue(), Matchers.is(firstname));
        System.out.println(firstname);

    }
}
