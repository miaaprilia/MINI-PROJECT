package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.FileUtils;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserInformation {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step("I set a valid API endpoint to get user information")
    public String setAPIEndpointValidGetUserInformation() {
        return url + "/auth/info";
    }

    @Step("I set the type \"Bearer Token\" on the authorization tab in user information")
    public void setTypeBearerTokenOnTheAuthorizationInUserInformation() {
    }

    @Step("I enter a valid token user information")
    public void enterValidTokenUserInformation() {
    }

    @Step ("I send a request to get user information")
    public void sendRequestToGetUserInformation() {
        JSONObject requestBody = FileUtils.getUser();
        String data = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserInformation());
    }

    @Step("I received status code of 200 OK get user information")
    public void receivedStatusCode200OKGetUserInformation() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received user information data response")
    public void receivedUserInformationDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_Information_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
    }

    @Step("I set API endpoint invalid for get user information user without the path")
    public String setAPIEndpointInvalidGetUserInformation() {
        return url;
    }

    @Step ("I send a request without path to get user information")
    public void sendRequestWithoutPathToGetUserInformation() {
        JSONObject requestBody = FileUtils.getUser();
        String data = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .get(setAPIEndpointInvalidGetUserInformation());
    }

    @Step("I received status code 404 Not Found in request to get user information")
    public void receiveStatusCode404NotFoundGetUserInformation() { restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"not found\" response")
    public void receivedErrorMessageNotFoundResponseUserInformation() {
    }

    @Step("I blank the token request Get User Information")
    public void blankTokenRequestGetUserInformation() {
    }

    @Step ("I send a request without token to get user information")
    public void sendRequestWithoutTokenToGetUserInformation() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserInformation());
    }

    @Step("I received status code 401 Unauthorized in request to get user information")
    public void receivedStatusCode401UnauthorizedGetUserInformation() { restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I received the error message \"unauthorized\" response")
    public void receivedErrorMessageUnauthorized() {
    }

    @Step("I enter invalid token")
    public void enterInvalidToken() {
    }

    @Step ("I send a request invalid token to get user information")
    public void sendRequestInvalidTokenToGetUserInformation() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserInformation());
    }

    @Step("I received the error message \"signature is invalid\" response")
    public void receivedErrorMessageSignatureIsInvalid() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_Information_Invalid_Token_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'error'", notNullValue()));
    }

    @Step("I set a type other than \"Bearer Token\" on the authorization tab")
    public void setTypeOtherThanBearerTokenOnTheAuthorization() {
    }

    @Step ("I send a request type other than \"Bearer Token\" to get user information")
    public void sendRequestTypeOtherThanToGetUserInformation() {
        JSONObject requestBody = FileUtils.getUser();
        String data = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "JWT Bearer " + data)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetUserInformation());
    }


}
