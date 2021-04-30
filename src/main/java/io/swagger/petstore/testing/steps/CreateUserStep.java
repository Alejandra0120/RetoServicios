package io.swagger.petstore.testing.steps;

import io.restassured.response.Response;
import io.swagger.petstore.testing.utils.InternetConnection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;
import static io.swagger.petstore.testing.utils.URLSwagger.URI_BASE;
import static io.swagger.petstore.testing.utils.URLSwagger.URI_SUFFIX_USER;

public class CreateUserStep {

    private Map<String, Object> jsonMap = new HashMap<>();
    private Response response;

    @Step
    public void checkStatusConnection() {
        InternetConnection internetConnection = new InternetConnection();
        internetConnection.checkInternetConnection();
    }
    @Step
    public void createUser(String id,String username, String firstName,
                           String lastName, String email, String password, String phone,String userStatus){
        jsonMap.put("id", id);
        jsonMap.put("username", username);
        jsonMap.put("firstName", firstName);
        jsonMap.put("lastName",lastName);
        jsonMap.put("email",email);
        jsonMap.put("password",password);
        jsonMap.put("phone",phone);
        jsonMap.put("userStatus",userStatus);

        response = SerenityRest.given().contentType("application/json").baseUri(URI_BASE.getValue()).
                basePath(URI_SUFFIX_USER.getValue()).content(jsonMap).log().body().when().post();

    }
    @Step
            public void verifyStatusCode(int statusCode) {
        SerenityRest.lastResponse().then().assertThat().statusCode(statusCode);
    }
}
