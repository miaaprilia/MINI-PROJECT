package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatings {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for get product ratings")
    public String setAPIEndpointValidGetProductRatings() {
        return url + "/products/1/ratings";
    }

    @Step("I send request to get product ratings")
    public void sendRequestGetProductRatings() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetProductRatings());
    }

    @Step("I received status code 200 OK get product ratings")
    public void receivedStatusCode200OKGetProductRatings() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data rating product")
    public void receivedDataRatingProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_Ratings_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get product ratings without the path")
    public String setAPIEndpointGetProductRatingWithoutPath() {
        return url; }

    @Step("I send request to get product ratings no path")
    public void sendRequestGetProductRatingsNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointGetProductRatingWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to get product ratings")
    public void receivedStatusCode404NotFoundGetProductRatings() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"record not found\" get product ratings response")
    public void receivedMessageErrorRecordNotFoundGetProductRatingsResponse() {
    }
}
