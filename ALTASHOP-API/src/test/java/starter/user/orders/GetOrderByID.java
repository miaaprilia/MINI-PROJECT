package starter.user.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetOrderByID {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for get order by ID")
    public String setAPIEndpointValidGetOrderByID() {
        return url + "/orders/12420";
    }

    @Step ("I set the type \"Bearer Token\" on the authorization tab in get order by ID")
    public void setTheTypeBearerTokenOnTheAuthorizationGetOrderByID() {
    }

    @Step("I enter a valid token order by ID")
    public void enterValidTokenOrderByID() {
    }

    @Step("I send request to get order by ID")
    public void sendRequestGetOrderByID() {
        String data = GenerateToken.generateToken();
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetOrderByID());
    }

    @Step("I received status code of 200 OK for a get order by ID")
    public void receivedStatuscODE200OKGetOrderByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data get order by ID response")
    public void receivedDataGetOrderByIDResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Order_By_ID_Response_Schema);

        restAssuredThat(response -> response.body("'data'. 'ID'", equalTo(12420)));
        restAssuredThat(response -> response.body("'data'. 'User'", notNullValue()));
        restAssuredThat(response -> response.body("'data'. 'Product'", notNullValue()));
        restAssuredThat(response -> response.body("'data'. 'Quantity'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single order data the path")
    public String setAPIEndpointInvalidGetSingleOrderDataPath() {
        return url; }

    @Step("I send request to get a single order data invalid ID")
    public void sendRequestGetSingleOrderDataInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetSingleOrderDataPath());
    }

    @Step("I received status code 404 Not Request in request to get order by ID")
    public void receivedStatusCode404NotRequestGetOrderByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"not found\" get order by ID response")
    public void receivedErrorMessageNotFoundGetOrderByIDResponse() {
    }

    @Step("II received error message \"record not found\" get order by ID respons")
    public void receivedErrorMessageRecordNotFoundGetOrderByIDResponse() {
    }
}



