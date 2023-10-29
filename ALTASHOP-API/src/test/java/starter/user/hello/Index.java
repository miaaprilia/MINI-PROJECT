package starter.user.hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Index {
    private static final String url = "https://altashop-api.fly.dev/api";

    @Step ("I set API endpoint valid for index")
    public String setAPIEndpointValidIndex() {
        return url + "/hello";
    }

    @Step("I send request to index")
    public void sendRequestIndex() {
        SerenityRest.given()
                .get(setAPIEndpointValidIndex());
    }

    @Step("I received status code of 200 OK for a index")
    public void receivedStatusCode200OKIndex() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data message \"hello\" index response")
    public void receivedDataMessageHelloIndexResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Index_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for index with an invalid path")
    public String setAPIEndpointIndexWithInvalidPath() {
        return url; }

    @Step("I send request to index with an invalid path")
    public void sendRequestIndexWithInvalidPath() {
        SerenityRest.given()
                .get(setAPIEndpointIndexWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to index")
    public void receivedStatusCode404NotFoundInRequestIndex() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"not found\" index response")
    public void receivedMessageErrorNotFoundIndexResponse() {
    }
}
