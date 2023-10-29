package starter.user.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateNewOrder {
    private static final String url = "https://altashop-api.fly.dev/api/";

    @Step ("I set API endpoint valid for create new order")
    public String setAPIEndpointValidCreateNewOrder() {
        return url + "orders";
    }

    @Step("I set the type \"Bearer Token\" on the authorization tab")
    public void setTheTypeBearerTokenOnTheAuthorizationCreateNewOrder() {
    }

    @Step("I enter a valid token new order")
    public void enterValidTokenNewOrder() {
    }

    @Step("I filling a valid body request new order")
    public void fillingValidBodyRequestNewOrder() {
    }

    @Step("I send request to create new order")
    public void sendRequestCreateNewOrder() {
//        String data = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        JSONArray order = new JSONArray();
        requestBody.put("product_id",85525);
        requestBody.put("quantity",1);
        order.put(0, requestBody);
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik1pYSBBcHJpbGlhIFNhdHlhIiwiRW1haWwiOiJtaWFhcHJpbGlhMjgwM0BnbWFpbC5jb20ifQ.TPBmPPvDadWplwIqkNwOsAqIY4hw6bk4zis8XxHQ_jk";
        System.out.println(order);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(order.toString())
                .post(setAPIEndpointValidCreateNewOrder());
    }

    @Step("I received status code of 200 OK for a new order")
    public void receivedStatusCode200OKNewOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I successfully added a new order")
    public void successfullyAddedNewOrder() {
    }

    @Step("I received new order data that was successfully added")
    public void receivedNewOrderDataSuccessfullyAdded() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Order_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'data'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'Fullname'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'Email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'Password'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Quantity'", notNullValue()));
    }

    @Step("I set API endpoint for create new order with an invalid path")
    public String setAPIEndpointCreateNewOrderWithInvalidPath() {
        return url; }

    @Step("I send request to create new order with an invalid path")
    public void sendRequestCreateNewOrderWithInvalidPath() {
        SerenityRest.given()
                .post(setAPIEndpointCreateNewOrderWithInvalidPath());
    }

    @Step(" received status code 404 Not Found in request to create new order")
    public void receivedStatusCode404NotFoundRequestCreateNewOrder() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" create new order response")
    public void receivedMessageErrorNotFoundCreateNewOrderResponse() {
    }

    @Step("I blank the create new order request")
    public void blankCreateNewOrderRequest() {
    }

    @Step("I send request to create new order with blank request")
    public void sendRequestCreateNewOrderWithBlankRequest() {
        String data = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        JSONArray order = new JSONArray();
        requestBody.put("product_id","");
        requestBody.put("quantity","");
        order.put(0, requestBody);
        System.out.println(order);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(order.toString())
                .post(setAPIEndpointValidCreateNewOrder());
    }

    @Step("I received status code 400 Bad Request in request to create new order")
    public void receivedStatusCode400BadRequestNewOrder() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received message error \"invalid character\" create new order response")
    public void receivedMessageErrorInvalidCharacterCreateNewOrderResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Order_Blank_Request_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
