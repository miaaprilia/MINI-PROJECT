package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComments {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for get product comments")
    public String setAPIEndpointValidGetProductComments() {
        return url + "/products/1/comments";
    }

    @Step("I send request to get product comments")
    public void sendRequestGetProductComments() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetProductComments());
    }

    @Step("I received status code 200 OK get product comments")
    public void receivedStatusCode200OKGetProductComments() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data comment product")
    public void receivedDataCommentProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_Comments_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get product comments without the path")
    public String setAPIEndpointGetProductCommentWithoutPath() {
        return url; }

    @Step("I send request to get product comments no path")
    public void sendRequestGetProductCommentsNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointGetProductCommentWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to get product comments")
    public void receivedStatusCode404NotFoundGetProductComments() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"record not found\" get product comments response")
    public void receivedMessageErrorRecordNotFoundGetProductCommentsResponse() {
    }
}

