package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateCommentProduct {
    private static final String url = "https://altashop-api.fly.dev/api/";

    @Step ("I set API endpoint valid for create comment product")
    public String setAPIEndpointValidCreateCommentProduct() {
        return url + "products/86818/comments";
    }

    @Step("I set the type \"Bearer Token\" on the authorization tab create comment product")
    public void setTheTypeBearerTokenOnTheAuthorizationCreateCommentProduct() {
    }

    @Step("I enter a valid token comment product")
    public void enterValidTokenCommentProduct() {
    }

    @Step("I filling a valid body request comment product")
    public void fillingValidBodyRequestCommentProduct() {
    }

    @Step("I send request to create comment product")
    public void sendRequestCreateCommentProduct() {
        String data = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        requestBody.put("content","recommended");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .post(setAPIEndpointValidCreateCommentProduct());
    }

    @Step("I received status code of 200 OK for a comment product")
    public void receivedStatusCode200OKCommentProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I successfully create comment product")
    public void successfullyCreateCommentProduct() {
    }

    @Step("I received product comment data that was successfully added")
    public void receivedProductCommentDataWasSuccessfullyAdded() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_Comment_Product_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
    }

    @Step("I set API endpoint for create comment product with an invalid path")
    public String setAPIEndpointCreateCommentProductWithInvalidPath() {
        return url; }

    @Step("I send request to create comment product with an invalid path")
    public void sendRequestCreateCommentProductWithInvalidPath() {
        SerenityRest.given()
                .post(setAPIEndpointCreateCommentProductWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to comment product")
    public void receivedStatusCode404NotFoundRequestCommentProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" create comment product response")
    public void receivedMessageErrorNotFoundCreateCommentProductResponse() {
    }

    @Step("I set API endpoint for create comment product without the path")
    public String setAPIEndpointCreateCommentProductWithoutPath() {
        return url; }

    @Step("I left the content column blank")
    public void leftContentColumnBlank() {
    }

    @Step("I send request to create comment product without path")
    public void sendRequestCreateCommentProductWithoutPath() {
        JSONObject data = new JSONObject();

        data.put("content", "");
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik1pYSBBcHJpbGlhIFNhdHlhIiwiRW1haWwiOiJtaWFhcHJpbGlhMjgwM0BnbWFpbC5jb20ifQ.TPBmPPvDadWplwIqkNwOsAqIY4hw6bk4zis8XxHQ_jk";
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(data.toString())
                .post(setAPIEndpointCreateCommentProductWithoutPath());
    }

    @Step("I received status code 500 Internal Server Error in request to comment product")
    public void receivedStatusCode500InternalServerErrorRequestCommentProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error SQLSTATE 23514 create comment product response")
    public void receivedErrorSQLSTATECreateCommentProductResponse() {

    }
}
