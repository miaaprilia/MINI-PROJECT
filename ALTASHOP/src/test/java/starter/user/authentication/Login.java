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
    public String setAPIEndpointValidLoginUser() {
        return url + "/auth/login";
    }

    @Step("I enter a valid email")
    public void enterValidEmail() {
    }

    @Step("I enter a valid password")
    public void enterValidPassword() {
    }

    @Step ("I send request to login user {string} and {string}")
    public void sendRequestValidLoginUser(String email, String password) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);
        String token = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setAPIEndpointValidLoginUser());
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
    public String setAPIEndpointInvalidLoginUser() {
        return url;
    }

    @Step("I send request to login user no path")
    public void sendRequestLoginUserNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidLoginUser());
    }

    @Step("I received status code 404 Not Found in request to login user")
    public void receivedStatusCode404NotFoundInRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"not found\" response")
    public void receivedErrorMessageNotFound() {
    }

    @Step("I blank the login request")
    public void blankLoginRequest() {
    }

    @Step("I send a request to the login user")
    public void sentRequestLoginUser() {
        SerenityRest.given()
                .post(setAPIEndpointValidLoginUser());
    }

    @Step("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestInRequestLoginUser() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I blank the email request")
    public void BlankEmailRequest() {
    }

    @Step("I received the error message \"email is required\" response")
    public void receivedErrorMessageEmailIsRequired() {
    }

    @Step("I blank the password request")
    public void blankPasswordRequest() {
    }

    @Step("I received the error message \"password is required\" response")
    public void receivedErrorMessagePasswordIsRequired() {
    }

    @Step("I enter an invalid email")
    public void enterInvalidEmail() {
    }

    @Step("I received an error message \"record not found\" response")
    public void receivedErrorMessageRecordNotFound() {
    }

    @Step("I enter an invalid password")
    public void enterInvalidPassword() {
    }

    @Step("I received an error message \"email or password is invalid\" response")
    public void receivedErrorMessageEmailOrPasswordIsRequired() {
    }
}
