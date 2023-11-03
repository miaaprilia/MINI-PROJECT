package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetProductByID {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step("I set API endpoint valid for get a single product data")
    public String setAPIEndpointValidGetProductByID() {
        return url + "/products/85858";
    }

    @Step("I send request to get a single product data")
    public void sendRequestGetProductByID() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetProductByID());
    }

    @Step("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetProductByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail single product data response")
    public void receivedDetailSingleProductDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_By_ID_Response_Schema);

        restAssuredThat(response -> response.body("'data'. 'ID'", equalTo(85858)));
        restAssuredThat(response -> response.body("'data'. 'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'. 'Description'", notNullValue()));
        restAssuredThat(response -> response.body("'data'. 'Price'", notNullValue()));
        restAssuredThat(response -> response.body("'data'. 'Categories'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single product data the path")
    public String setAPIEndpointInvalidGetProductByID() {
        return url; }

    @Step("I send request to get a single product data invalid ID")
    public void sendRequestGetProductByIDDatInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetProductByID());
    }

    @Step("I received status code 400 Bad Request in request to get product by ID")
    public void receivedStatusCode400BadRequestGetProductByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"400 Bad Request\" response")
    public void receivedMessageError400BadRequestResponse() {
    }

    @Step("I received status code 404 Not Found in request to get product by ID")
    public void receivedStatusCode404NotFoundGetProductByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"record not found\" response")
    public void receivedMessageErrorRecordNotFoundResponse() {
    }
}


