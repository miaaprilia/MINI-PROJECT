package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductByID;

public class GetProductByIDSteps {
    @Steps
    GetProductByID getProductByID;

    @Given("I set API endpoint valid for get a single product data")
    public void setAPIEndpointValidGetProductByID() {
        getProductByID.setAPIEndpointValidGetProductByID();
    }

    @When("I send request to get a single product data")
    public void sendRequestGetProductByID() {
        getProductByID.sendRequestGetProductByID();
    }

    @Then("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetProductByID() {
        getProductByID.receivedStatusCode200OKGetProductByID();
    }

    @And("I received detail single product data response")
    public void receivedDetailSingleProductDataResponse() {
        getProductByID.receivedDetailSingleProductDataResponse();
    }

    @Given("I set API endpoint invalid for get a single product data the path")
    public void setAPIEndpointInvalidGetProductByID() { getProductByID.setAPIEndpointInvalidGetProductByID();}

    @When("I send request to get a single product data invalid ID")
    public void sendRequestGetProductByIDDatInvalidID() { getProductByID.sendRequestGetProductByIDDatInvalidID();}

    @Then("I received status code 400 Bad Request in request to get product by ID")
    public void receivedStatusCode400BadRequestGetProductByID() { getProductByID.receivedStatusCode400BadRequestGetProductByID();}

    @And("I received error message \"400 Bad Request\" response")
    public void receivedMessageError400BadRequestResponse() {
        getProductByID.receivedMessageError400BadRequestResponse();
    }

    @Then("I received status code 404 Not Found in request to get product by ID")
    public void receivedStatusCode404NotFoundGetProductByID() { getProductByID.receivedStatusCode404NotFoundGetProductByID();}

    @And("I received message error \"record not found\" response")
    public void receivedMessageErrorRecordNotFoundResponse() {
        getProductByID.receivedMessageErrorRecordNotFoundResponse();
    }

}

