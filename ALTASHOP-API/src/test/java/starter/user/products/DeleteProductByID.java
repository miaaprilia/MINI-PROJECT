package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductByID {
    private static final String url = "https://altashop-api.fly.dev/api/";

    @Step ("I set API endpoint valid for delete product by ID")
    public String setAPIEndpointValidDeleteProductByID() {
        return url + "products/1";
    }

    @Step("I send request to delete product by ID")
    public void sendRequestDeleteProductByID() {
        SerenityRest.given()
                .delete(setAPIEndpointValidDeleteProductByID());
    }

    @Step("I received status code of 200 OK for a delete product")
    public void receivedStatusCode200OKDeleteProductByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data message \"null\" delete product by ID response")
    public void receivedDataMessageNullDeleteProductByIDResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Delete_Product_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for delete product by ID with an invalid path")
    public String setAPIEndpointDeleteProoductByIDWithInvalidPath() {
        return url; }

    @Step("I send request to delete product by ID with an invalid path")
    public void sendRequestDeleteProductByIDWithInvalidPath() {
        SerenityRest.given()
                .delete(setAPIEndpointDeleteProoductByIDWithInvalidPath());
    }

    @Step("I received status code 405 Method Not Allowed in request to delete product")
    public void receivedStatusCode405MethodNotAllowedRequestDeleteProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"method not allowed\" delete product by ID response")
    public void receivedMessageErrorMethodNotAllowedDeleteProductByIDResponse() {
    }
}
