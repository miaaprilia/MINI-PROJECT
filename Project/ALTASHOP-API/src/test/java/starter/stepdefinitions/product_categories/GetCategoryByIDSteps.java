package starter.stepdefinitions.product_categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product_categories.GetCategoryByID;

public class GetCategoryByIDSteps {
    @Steps
    GetCategoryByID getCategoryByID;

    @Given ("I set API endpoint valid for get category by ID")
    public void setAPIEndpointValidGetCategoryByID() {
        getCategoryByID.setAPIEndpointValidGetCategoryByID();
    }

    @When ("I send request to get category by ID")
    public void sendRequestGetCategoryByID() {
        getCategoryByID.sendRequestGetCategoryByID();
    }

    @Then ("I received status code of 200 OK for a get category by ID")
    public void receivedStatusCode200OKGetCategoryByID() {
        getCategoryByID.receivedStatusCode200OKGetCategoryByID();
    }

    @And ("I received data category by ID response")
    public void receivedDataCategoryByIDResponse() {
        getCategoryByID.receivedDataCategoryByIDResponse();
    }

    @Given("I set API endpoint invalid for get a single category data the path")
    public void setAPIEndpointInvalidGetCategoryDataThePath() { getCategoryByID.setAPIEndpointInvalidGetCategoryDataThePath();}

    @When("I send request to get a single category data invalid ID")
    public void sendRequestGetCategoryDataInvalidID() { getCategoryByID.sendRequestGetCategoryDataInvalidID();}

    @Then("I received status code 404 Not Found in request to get category by ID")
    public void receivedStatusCode404NotFoundRequestGetCategoryByID() { getCategoryByID.receivedStatusCode404NotFoundRequestGetCategoryByID();}

    @And("I received error message \"not found\" get category by ID response")
    public void receivedErrorMessageNotFoundGetCategoryByIDResponse() {
        getCategoryByID.receivedErrorMessageNotFoundGetCategoryByIDResponse();
    }

    @And("I received message error \"record not found\" get category by ID response")
    public void receivedMessageErrorRecordNotFoundGetCategoryByIDResponse() {
        getCategoryByID.receivedMessageErrorRecordNotFoundGetCategoryByIDResponse();
    }

}
