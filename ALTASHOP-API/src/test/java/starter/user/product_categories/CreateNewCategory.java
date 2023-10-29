package starter.user.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateNewCategory {
    private static final String url = "https://altashop-api.fly.dev/api/";

    @Step ("I set API endpoint valid for create new category")
    public String setAPIEndpointValidCreateNewCategory() {
        return url + "categories";
    }

    @Step("I filling a valid body request new category")
    public void fillingValidBodyRequestNewCategory() {
    }

    @Step("I send request to create new category")
    public void sendRequestCreateNewCategory() {
        JSONObject product = new JSONObject();
        JSONArray categories = new JSONArray();
        JSONObject data = new JSONObject();
        data.put("data", product);

        product.put("id", categories);
        product.put("name", "test");
        product.put("description", "for gaming purposes");

        System.out.println(data.toString(1));
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(product.toString())
                .post(setAPIEndpointValidCreateNewCategory());
    }

    @Step("I received status code of 200 OK for a create new category")
    public void receivedStatusCode200OKNewCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I successfully added a new category")
    public void successfullyAddedNewCategory() {
    }

    @Step("I received new category data that was successfully added")
    public void receivedNewCategoryDataSuccessfullyAdded() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Category_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
    }

    @Step("I set API endpoint for create new category with an invalid path")
    public String setAPIEndpointCreateNewCategoryWithInvalidPath() {
        return url; }

    @Step("I send request to create new category with an invalid path")
    public void sendRequestCreateNewCategoryWithInvalidPath() {
        SerenityRest.given()
                .post(setAPIEndpointCreateNewCategoryWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to create new category")
    public void receivedStatusCode404NotFoundRequestCreateNewCategory() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" create new category response")
    public void receivedMessageErrorNotFoundCreateNewCategoryResponse() {
    }

    @Step("I blank the create new category request")
    public void blankCreateNewCategoryRequest() {
    }

    @Step("I send request to create new category with blank request")
    public void sendRequestCreateNewCategoryWithBlankRequest() {
        SerenityRest.given()
                .post(setAPIEndpointValidCreateNewCategory());
    }

    @Step("I received status code 500 Internal Server Error in request to create new category")
    public void receivedStatusCode500InternalServerErrorNewCategory() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received message \\(SQLSTATE 23514) create new category response")
    public void receivedMessageSQLSTATECreateNewCategoryResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Category_Blank_Request_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
