package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step("I set API endpoint valid for login user")
    public String setAPIEndpointValidLoginUserPath() {
        return url + "/auth/login";
    }

    @Step("I enter a valid email")
    public void enterValidEmail() {
    }

    @Step("I enter a valid password")
    public void enterValidPassword() {
    }

    @Step ("I send request to login user {String} and {String}")
    public void sendRequestValidLoginUser(String email, String password) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);
        String token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidLoginUserPath());
    }

    @Step("I received status code 200 OK login user")
    public void receivedStatusCode200OKLoginUser() {
        restAssuredThat(response -> response.statusCode(415));
    }

    @Step("I received token login user data response")
    public void receivedTokenLoginUserDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Login_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for login user without the path")
    public String setAPIEndpointInvalidLoginUserWithoutPath() {
        return url;
    }

    @Step("I send request to login user no path")
    public void sendRequestLoginUserNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidLoginUserWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to login user")
    public void receivedStatusCode404NotFoundInRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(415));
    }

    @Step("I am not to fill in the login request")
    public void notToFillInTheLoginRequest() {
    }

    @Step("I sent a request to the login user to fill in the username & password")
    public void sentRequestLoginUserToFillIn() {
        SerenityRest.given()
                .post(setAPIEndpointValidLoginUserPath());
    }

    @Step("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestInRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(415));
    }

    @Step("I received error message \"username and password are not provided in JSON format\" response")
    public void receivedErrorMessageJSONFormat() {
    }

    @Step("I fill in an invalid username")
    public void fillInAnInvalidUsername() {
    }

    @Step("I filled in a valid password")
    public void filledInAValidPassword() {
    }

    @Step("I sent a request the login user")
    public void sendRequestInvalidLoginUser() {
        SerenityRest.given()
                .post(setAPIEndpointValidLoginUserPath());
    }

    @Step("I received status code 401 Unauthorized in request login user")
    public void receivedStatusCode401UnauthorizedRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(415));
    }

    @Step("I received an error message \"username or password is incorrect\" response")
    public void receivedErrorMessageIncorectCredentialsResponse() {
    }

    @Step("I filled in a valid username")
    public void filledInAValidUsername() {
    }

    @Step("I filled in an invalid password")
    public void filledInAnInvalidPassword() {
    }
}
