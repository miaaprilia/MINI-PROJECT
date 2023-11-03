package starter.user.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetCategoryByID {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for get category by ID")
    public String setAPIEndpointValidGetCategoryByID() {
        return url + "/categories/30104";
    }

    @Step("I send request to get category by ID")
    public void sendRequestGetCategoryByID() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .get(setAPIEndpointValidGetCategoryByID());
    }

    @Step("I received status code of 200 OK for a get category by ID")
    public void receivedStatusCode200OKGetCategoryByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data category by ID response")
    public void receivedDataCategoryByIDResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Category_By_ID_Response_Schema);

        restAssuredThat(response -> response.body("'data'. 'ID'", equalTo(30104)));
        restAssuredThat(response -> response.body("'data'. 'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'. 'Description'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single category data the path")
    public String setAPIEndpointInvalidGetCategoryDataThePath() {
        return url; }

    @Step("I send request to get a single category data invalid ID")
    public void sendRequestGetCategoryDataInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetCategoryDataThePath());
    }

    @Step("I received status code 404 Not Found in request to get category by ID")
    public void receivedStatusCode404NotFoundRequestGetCategoryByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"not found\" get category by ID response")
    public void receivedErrorMessageNotFoundGetCategoryByIDResponse() {
    }

    @Step("I received message error \"record not found\" get category by ID response")
    public void receivedMessageErrorRecordNotFoundGetCategoryByIDResponse() {
    }
}



