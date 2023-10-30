package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.AssignProductRating;

public class AssignProductRatingSteps {
    @Steps
    AssignProductRating assignProductRating;

    @Given ("I set API endpoint valid for assign product rating")
    public void setAPIEndpointValidAssignProductRating() {
        assignProductRating.setAPIEndpointValidAssignProductRating();
    }

    @When ("I set the type \"Bearer Token\" on the authorization tab in assign product rating")
    public void setTypeBearerTokenOnAuthorizationTabInAssignProductRating() {
        assignProductRating.setTypeBearerTokenOnAuthorizationTabInAssignProductRating();
    }

    @And ("I enter a valid token product rating")
    public void enterValidTokenProductRating() {
        assignProductRating.enterValidTokenProductRating();
    }

    @And ("I filling a valid body Assign Product Rating request")
    public void fillingValidBodyAssignProductRatingRequest() {
        assignProductRating.fillingValidBodyAssignProductRatingRequest();
    }

    @And ("I send request to assign product rating")
    public void sendRequestAssignProductRating() {
        assignProductRating.sendRequestAssignProductRating();
    }

    @Then ("I received status code of 200 OK for a product rating")
    public void receivedStatusCode200OKProductRating() {
        assignProductRating.receivedStatusCode200OKProductRating();
    }

    @And ("I successfully assign product rating")
    public void successfullyAssignProductRating() {
        assignProductRating.successfullyAssignProductRating();
    }

    @And ("I received product rating data that was successfully added")
    public void receivedProductRatingDataSuccessfullyAdded() {
        assignProductRating.receivedProductRatingDataSuccessfullyAdded();
    }

    @Given("I set API endpoint for assign product ratings with an invalid path")
    public void setAPIEndpointAssignProductRatingsWithInvalidPath() { assignProductRating.setAPIEndpointAssignProductRatingsWithInvalidPath();}

    @And("I send request to assign product ratings with an invalid path")
    public void sendRequestAssignProductRatingsWithInvalidPath() { assignProductRating.sendRequestAssignProductRatingsWithInvalidPath();}

    @Then("I received status code 404 Not Found in request to rating product")
    public void receivedStatusCode404NotFoundRequestRatingProduct() { assignProductRating.receivedStatusCode404NotFoundRequestRatingProduct();}

    @And("I received message error \"not found\" assign product ratings response")
    public void receivedMessageErrorNotFoundAssignProductRatingsResponse() {
        assignProductRating.receivedMessageErrorNotFoundAssignProductRatingsResponse();
    }

    @Given("I set API endpoint for assign product ratings without the path")
    public void setAPIEndpointAssignProductWithoutPath() { assignProductRating.setAPIEndpointAssignProductWithoutPath();}

    @And("I send request to assign product ratings no path")
    public void sendRequestAssignProductRatingNoPath() { assignProductRating.sendRequestAssignProductRatingNoPath();}

    @Then("I received status code 405 Method Not Allowed in request to rating product")
    public void receivedStatusCode405MethodNotAllowedRequestRatingProduct() { assignProductRating.receivedStatusCode405MethodNotAllowedRequestRatingProduct();}

    @And("I received message error \"method not allowed\" assign product ratings response")
    public void receivedMessageErrorMethodNotAllowedAssignProductRatingsResponse() {
        assignProductRating.receivedMessageErrorMethodNotAllowedAssignProductRatingsResponse();
    }

    @And("I enter product rating data with a request for the number of ratings exceeding > 5")
    public void enterProductRatingDataWithRequestNumberRatingExceeding() { assignProductRating.enterProductRatingDataWithRequestNumberRatingExceeding();}

    @And ("I send request to assign product with more than 5 rating")
    public void sendRequestAssignProductWithMOreThan5Rating() {
        assignProductRating.sendRequestAssignProductWithMOreThan5Rating();
    }

    @Then("I received status code 500 Internal Server Error in request to rating product")
    public void receivedStatusCode500InternalServerErrorRatingProduct() { assignProductRating.receivedStatusCode500InternalServerErrorRatingProduct();}

    @And("I received error SQLSTATE 23514 assign product ratings response")
    public void receivedErrorSQLSTATEAssignProductRatingsResponse() {
        assignProductRating.receivedErrorSQLSTATEAssignProductRatingsResponse();
    }

}
