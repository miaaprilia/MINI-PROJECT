package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductRatings;

public class GetProductRatingsSteps {
    @Steps
    GetProductRatings getProductRatings;

    @Given ("I set API endpoint valid for get product ratings")
    public void setAPIEndpointValidGetProductRatings() {
        getProductRatings.setAPIEndpointValidGetProductRatings();
    }

    @When ("I send request to get product ratings")
    public void sendRequestGetProductRatings() {
        getProductRatings.sendRequestGetProductRatings();
    }

    @Then ("I received status code 200 OK get product ratings")
    public void receivedStatusCode200OKGetProductRatings() {
        getProductRatings.receivedStatusCode200OKGetProductRatings();
    }

    @And ("I received data rating product")
    public void receivedDataRatingProduct() {
        getProductRatings.receivedDataRatingProduct();
    }

    @Given("I set API endpoint for get product ratings without the path")
    public void setAPIEndpointGetProductRatingWithoutPath() { getProductRatings.setAPIEndpointGetProductRatingWithoutPath();}

    @When("I send request to get product ratings no path")
    public void sendRequestGetProductRatingsNoPath() { getProductRatings.sendRequestGetProductRatingsNoPath();}

    @Then("I received status code 404 Not Found in request to get product ratings")
    public void receivedStatusCode404NotFoundGetProductRatings() { getProductRatings.receivedStatusCode404NotFoundGetProductRatings();}

    @And("I received message error \"record not found\" get product ratings response")
    public void receivedMessageErrorRecordNotFoundGetProductRatingsResponse() {
        getProductRatings.receivedMessageErrorRecordNotFoundGetProductRatingsResponse();
    }
}
