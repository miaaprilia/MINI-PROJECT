package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductComments;

public class GetProductCommentsSteps {
    @Steps
    GetProductComments getProductComments;

    @Given ("I set API endpoint valid for get product comments")
    public void setAPIEndpointValidGetProductComments() {
        getProductComments.setAPIEndpointValidGetProductComments();
    }

    @When ("I send request to get product comments")
    public void sendRequestGetProductComments() {
        getProductComments.sendRequestGetProductComments();
    }

    @Then ("I received status code 200 OK get product comments")
    public void receivedStatusCode200OKGetProductComments() {
        getProductComments.receivedStatusCode200OKGetProductComments();
    }

    @And ("I received data comment product")
    public void receivedDataCommentProduct() {
        getProductComments.receivedDataCommentProduct();
    }

    @Given("I set API endpoint for get product comments without the path")
    public void setAPIEndpointGetProductCommentWithoutPath() { getProductComments.setAPIEndpointGetProductCommentWithoutPath();}

    @When("I send request to get product comments no path")
    public void sendRequestGetProductCommentsNoPath() { getProductComments.sendRequestGetProductCommentsNoPath();}

    @Then("I received status code 404 Not Found in request to get product comments")
    public void receivedStatusCode404NotFoundGetProductComments() { getProductComments.receivedStatusCode404NotFoundGetProductComments();}

    @And("I received message error \"record not found\" get product comments response")
    public void receivedMessageErrorRecordNotFoundGetProductCommentsResponse() {
        getProductComments.receivedMessageErrorRecordNotFoundGetProductCommentsResponse();
    }
}

