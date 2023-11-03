package starter.user.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrders {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for get all orders")
    public String setAPIEndpointValidGetAllOrders() {
        return url + "/orders";
    }

    @Step ("I set the type \"Bearer Token\" on the authorization tab in get all order")
    public void setTheTypeBearerTokenOnTheAuthorizationGetAllOrder() {
    }

    @Step ("I enter a valid token")
    public void enterValidToken() {
    }

    @Step("I send request to get all orders")
    public void sendRequestGetAllOrders() {
        String data = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + data)
                .get(setAPIEndpointValidGetAllOrders());
    }

    @Step("I received status code of 200 OK for a get all orders")
    public void receivedStatusCode200OKGetAllOrders() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list data get all orders response")
    public void receivedListDataGetAllOrdersResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Orders_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all orders with an invalid path")
    public String setAPIEndpointGetAllOrdersWithInvalidPath() {
        return url; }

    @Step("I send request to get all orders with an invalid path")
    public void sendRequestGetAllOrdersWithInvalidPath() {
        SerenityRest.given()
                .get(setAPIEndpointGetAllOrdersWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to get all orders")
    public void receivedStatusCode404NotFoundRequestGetAllOrders() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" get all orders response")
    public void receivedMessageErrorNotFoundGetAllOrdersResponse() {
    }
}
