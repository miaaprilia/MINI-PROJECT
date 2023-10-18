package starter.hook;

import io.cucumber.java.Before;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class BeforeHookLogin {
    @Before(value = "@Login")

    public static void beforeTest() {
        String email = "someone@mail.com";
        String password = "123123";
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", email);
        requestBody.put("password", password);
        String filePath = "src/test/resources/sample/User.json";
        try {
            String jsonString = requestBody.toString();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
