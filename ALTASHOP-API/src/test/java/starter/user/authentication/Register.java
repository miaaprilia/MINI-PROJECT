package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.FileUtils;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Register {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step("I set API endpoint valid for register new user")
    public String setAPIEndpointValidRegisterUser() {
        return url + "/auth/register";
    }

    @Step("I enter a valid email format")
    public void enterValidEmailFormat() {
    }

    @Step("I enter password")
    public void enterPassword() {
    }

    @Step("I enter fullname")
    public void enterFullname() {
    }

    @Step ("I send request to register user")
    public void sendRequestRegisterUser() {
        JSONObject requestBody = FileUtils.getUser();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointValidRegisterUser());
    }

    @Step("I received status code 200 OK register user")
    public void receivedStatusCode200OKRegisterUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received register user data response")
    public void receivedRegisterUserDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Register_Response_Schema);
        restAssuredThat(response -> response.body("'data'.'Email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Password'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Fullname'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for register user without the path")
    public String setAPIEndpointInvalidRegisterUser() { return url;
    }

    @Step("I received status code 404 Not Found in request to register user")
    public void receiveStatusCode404NotFoundRegisterUser() {
    }

    @Step("I received error message \"not found\" response Register")
    public void receivedErrorMessageNotFoundResponseRegister() {
    }

    @Step("I blank the register request Register")
    public void blankRegisterRequest() {
    }

    @Step("I received status code 400 Bad Request in request to register user")
    public void receivedStatusCode400BadRequestRegisterUser() {
    }

    @Step("I received the error message \"email is required\" register response")
    public void receivedErrorMessageEmailIsRequiredRegister() {
    }

    @Step("I blank the email request Register\"")
    public void blankEmailRequestRegister() {
    }

    @Step("I blank the password request Register")
    public void blankPasswordRequestRegister() {
    }

    @Step("I received the error message \"email is required\" register response")
    public void receivedErrorMessagePasswordIsRequiredRegister() {
    }

    @Step("I blank the fullname request")
    public void blankFullnameRequest() {
    }

    @Step("I received the error message \"fullname is required\" register response")
    public void receivedErrorMessageFullnameIsRequired() {
    }

    @Step("I enter email invalid format")
    public void enterEmailInvalidFormat() {
    }

    @Step("I received the error message \"unknown email format\" response")
    public void receivedErrorMessageUnknownEmailFormat() {
    }
}
