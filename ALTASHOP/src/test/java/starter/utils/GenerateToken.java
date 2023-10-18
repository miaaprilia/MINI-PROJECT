package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class GenerateToken {
    public static String generateToken() {
    JSONObject login = FileUtils.login();
    JSONObject requestBody = new JSONObject();
    requestBody.put("email", login.get("email"));
    requestBody.put("password", login.get("password"));
    ResponseBody loginResponse = SerenityRest.given()
            .header("Content-Type", "application/json")
            .body(requestBody.toString())
            .post("https://altashop-api.fly.dev/api/auth/login")
            .body();
    JSONObject loginResponseBody = new JSONObject(loginResponse.asString());
    return loginResponseBody.get("token").toString();    }
}
