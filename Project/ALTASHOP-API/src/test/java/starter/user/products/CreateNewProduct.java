package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateNewProduct {
    private static final String url = "https://altashop-api.fly.dev/api/";

    @Step ("I set API endpoint valid for create new product")
    public String setAPIEndpointValidCreateNewProduct() {
        return url + "products";
    }

    @Step("I filling a valid body request")
    public void fillingValidBodyRequest() {
    }

    @Step("I send request to create new product")
    public void sendRequestCreateNewProductValidRequest() {
        JSONObject product = new JSONObject();
        JSONArray categories = new JSONArray();
        JSONObject data = new JSONObject();
        data.put("data", product);

        product.put("name", "Tere Liye Book");
        product.put("description", "play has no limits");
        product.put("price", 100000);
        product.put("categories", categories);

        System.out.println(data.toString(1));
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(product.toString())
                .post(setAPIEndpointValidCreateNewProduct());
    }

    @Step("I received status code of 200 OK for a new product")
    public void receivedStatusCode200OKNewProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I successfully added a new product")
    public void successfullyAddedNewProduct() {
    }

    @Step("I received new product data that was successfully added")
    public void receivedNewProductDataSuccessfullyAdded() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Product_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
        restAssuredThat(response -> response.body("'data'", notNullValue()));
    }

    @Step("I set API endpoint for create new product without the path")
    public String setAPIEndpointCreateNewProductWithoutPath() {
        return url; }

    @Step("I send request to create new product no path")
    public void sendRequestCreateNewProductNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointCreateNewProductWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to create new product")
    public void receivedStatusCode404NotFoundRequestCreateNewProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" create new product response")
    public void receivedMessageErrorNotFoundCreateNewProductResponse() {
    }

    @Step("I filled in all valid fill requests but only the name column blank")
    public void fillingAllValidFillRequestButOnlyNameColumnBlank() {
    }

    @Step("I send request to create new product with name blank")
    public void sendRequestCreateNewProductWithNameBlank() {
        JSONObject product = new JSONObject();
        JSONArray categories = new JSONArray();
        JSONObject data = new JSONObject();
        data.put("data", product);

        product.put("name", "");
        product.put("description", "play has no limits");
        product.put("price", 100000);
        product.put("categories", categories);

        System.out.println(data.toString(1));
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(product.toString())
                .post(setAPIEndpointValidCreateNewProduct());
    }

    @Step("I received status code of 500 Internal Server Error for a new product")
    public void receivedStatusCode500InternalServerErrorNewProduct() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I received error SQLSTATE 23514 response")
    public void receivedErrorSQLSTATEResponse() {
    }

    @Step("I filled in all valid fill requests but only the price column blank")
    public void fillingAllValidFillRequestButOnlyPriceColumnBlank() {
    }

    @Step("I send request to create new product with price blank")
    public void sendRequestCreateNewProductWithPriceBlank() {
        JSONObject product = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("data", product);

        product.put("name", "Tere Liye Book");
        product.put("description", "play has no limits");
        product.put("price", "");
        product.put("categories", 30693);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(product.toString())
                .post(setAPIEndpointValidCreateNewProduct());
    }

    @Step("I received status code of 400 Bad Request for a new product")
    public void receivedStatusCode400BadRequestNewProduct() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received message error \"invalid character\" response")
    public void receivedMessageErrorInvalidCharacterResponse() {
    }
}

