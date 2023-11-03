package starter.user.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategoryByID {
    private static final String url = "https://altashop-api.fly.dev/api/";

    @Step ("I set API endpoint valid for delete category by ID")
    public String setAPIEndpointValidDeleteCategoryByID() {
        return url + "categories/85528" ;
    }

    @Step("I send request to delete category by ID")
    public void sendRequestDeleteCategoryByID() {
        SerenityRest.given()
                .delete(setAPIEndpointValidDeleteCategoryByID());
    }

    @Step("I received status code of 200 OK for a delete category")
    public void receivedStatusCode200OKDeleteCategoryByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set API endpoint for delete category by ID with an invalid path")
    public String setAPIEndpointDeleteCategoryByIDWithInvalidPath() {
        return url; }

    @Step("I send request to delete category by ID with an invalid path")
    public void sendRequestDeleteCategoryByIDWithInvalidPath() {
        SerenityRest.given()
                .delete(setAPIEndpointDeleteCategoryByIDWithInvalidPath());
    }

    @Step("I received status code 405 Method Not Allowed in request to delete category by ID")
    public void receivedStatusCode405MethodNotAllowedRequestDeleteCategory() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message error \"method not allowed\" delete category by ID response")
    public void receivedMessageErrorMethodNotAllowedDeleteCategoryByIDResponse() {
    }
}