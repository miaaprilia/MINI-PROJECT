package starter.user.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for get all categories")
    public String setAPIEndpointValidGetAllCategories() {
        return url + "/categories";
    }

    @Step("I send request to get all categories")
    public void sendRequestGetAllCategories() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllCategories());
    }

    @Step("I received status code of 200 OK for a get all categories")
    public void receivedStatusCode200OKGetAllCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list data category response")
    public void receivedListDataCategoryResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Categories_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all categories with an invalid path")
    public String setAPIEndpointInvalidGetAllCategoriesWithInvalidPath() {
        return url; }

    @Step("I send request to get all categories with an invalid path")
    public void sendRequestGetAllCategoriesNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetAllCategoriesWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to get all categories")
    public void receivedStatusCode404NotFoundInRequestGetAllCategories() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" get all categories response")
    public void receivedMessageErrorNotFoundGetAllCategoriesResponse() {
    }
}
