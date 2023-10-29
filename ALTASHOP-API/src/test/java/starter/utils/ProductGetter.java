package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProductGetter {
    public static int getProductID() {
        ResponseBody productResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .get("https://altashop-api.fly.dev/api/products")
                .body();

        JSONObject productsResponseBody = new JSONObject(productResponse.asString());
        JSONArray products = productsResponseBody.getJSONArray("data");
        JSONObject firstProduct = products.getJSONObject(0);
        return firstProduct.getInt("ID");
    }
}