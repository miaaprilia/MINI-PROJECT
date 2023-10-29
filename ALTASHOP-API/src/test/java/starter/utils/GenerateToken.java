package starter.utils;
import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
public class GenerateToken {
    public static String generateToken() {
    JSONObject userData = FileUtils.getUser();
    JSONObject requestBody = new JSONObject();
    requestBody.put("email", userData.get("email"));
    requestBody.put("password", userData.get("password"));
    ResponseBody loginResponse = SerenityRest.given()
            .header("Content-Type", "application/json")
            .body(requestBody.toString())
            .post("https://altashop-api.fly.dev/api/auth/login")
            .body();
    System.out.println("the token: " + loginResponse.asString());
    JSONObject loginResponseBody = new JSONObject(loginResponse.asString());
    return loginResponseBody.getString("data");    }
}