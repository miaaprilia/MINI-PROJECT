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

public class AssignProductRating {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for assign product rating")
    public String setAPIEndpointValidAssignProductRating() {
        return url + "/products/87164/ratings";
    }

    @Step("I set the type \"Bearer Token\" on the authorization tab in assign product rating")
    public void setTypeBearerTokenOnAuthorizationTabInAssignProductRating() {
    }

    @Step("I enter a valid token product rating")
    public void enterValidTokenProductRating() {
    }

    @Step("I filling a valid body Assign Product Rating request")
    public void fillingValidBodyAssignProductRatingRequest() {
    }

    @Step("I send request to assign product rating")
    public void sendRequestAssignProductRating() {
        String data = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .post(setAPIEndpointValidAssignProductRating());
    }

    @Step("I received status code of 200 OK for a product rating")
    public void receivedStatusCode200OKProductRating() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I successfully assign product rating")
    public void successfullyAssignProductRating() {
    }

    @Step("I received product rating data that was successfully added")
    public void receivedProductRatingDataSuccessfullyAdded() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Assign_Product_Rating_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
    }

    @Step("I set API endpoint for assign product ratings with an invalid path")
    public String setAPIEndpointAssignProductRatingsWithInvalidPath() {
        return url; }

    @Step("I send request to assign product ratings with an invalid path")
    public void sendRequestAssignProductRatingsWithInvalidPath() {
        SerenityRest.given()
                .post(setAPIEndpointAssignProductRatingsWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to rating product")
    public void receivedStatusCode404NotFoundRequestRatingProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" assign product ratings response")
    public void receivedMessageErrorNotFoundAssignProductRatingsResponse() {
    }

    @Step("I set API endpoint for assign product ratings without the path")
    public String setAPIEndpointAssignProductWithoutPath() {
        return url; }

    @Step("I send request to assign product ratings no path")
    public void sendRequestAssignProductRatingNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointAssignProductWithoutPath());
    }

    @Step("I received status code 405 Method Not Allowed in request to rating product")
    public void receivedStatusCode405MethodNotAllowedRequestRatingProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"method not allowed\" assign product ratings response")
    public void receivedMessageErrorMethodNotAllowedAssignProductRatingsResponse() {
    }

    @Step("I enter product rating data with a request for the number of ratings exceeding > 5")
    public void enterProductRatingDataWithRequestNumberRatingExceeding() {
    }

    @Step("I send request to assign product with more than 5 rating")
    public void sendRequestAssignProductWithMOreThan5Rating() {
        String data = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 6);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .post(setAPIEndpointValidAssignProductRating());
    }

    @Step("I received status code 500 Internal Server Error in request to rating product")
    public void receivedStatusCode500InternalServerErrorRatingProduct() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I received error SQLSTATE 23514 assign product ratings response")
    public void receivedErrorSQLSTATEAssignProductRatingsResponse() {
    }
}
