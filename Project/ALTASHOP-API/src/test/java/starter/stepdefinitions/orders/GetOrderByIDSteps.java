package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.orders.GetOrderByID;

public class GetOrderByIDSteps {
    @Steps
    GetOrderByID getOrderByID;

    @Given ("I set API endpoint valid for get order by ID")
    public void setAPIEndpointValidGetOrderByID() {
        getOrderByID.setAPIEndpointValidGetOrderByID();
    }

    @When ("I set the type \"Bearer Token\" on the authorization tab in get order by ID")
    public void setTheTypeBearerTokenOnTheAuthorizationGetOrderByID() {
        getOrderByID.setTheTypeBearerTokenOnTheAuthorizationGetOrderByID();
    }

    @And ("I enter a valid token order by ID")
    public void enterValidTokenOrderByID() {
        getOrderByID.enterValidTokenOrderByID();
    }

    @And ("I send request to get order by ID")
    public void sendRequestGetOrderByID() {
        getOrderByID.sendRequestGetOrderByID();
    }

    @Then("I received status code of 200 OK for a get order by ID")
    public void receivedStatuscODE200OKGetOrderByID() { getOrderByID.receivedStatuscODE200OKGetOrderByID();}

    @And("I received data get order by ID response")
    public void receivedDataGetOrderByIDResponse() { getOrderByID.receivedDataGetOrderByIDResponse();}

    @Given("I set API endpoint invalid for get a single order data the path")
    public void setAPIEndpointInvalidGetSingleOrderDataPath() { getOrderByID.setAPIEndpointInvalidGetSingleOrderDataPath();}

    @And("I send request to get a single order data invalid ID")
    public void sendRequestGetSingleOrderDataInvalidID() {
        getOrderByID.sendRequestGetSingleOrderDataInvalidID();
    }

    @Then("I received status code 404 Not Request in request to get order by ID")
    public void receivedStatusCode404NotRequestGetOrderByID() { getOrderByID.receivedStatusCode404NotRequestGetOrderByID();}

    @And("I received error message \"not found\" get order by ID response")
    public void receivedErrorMessageNotFoundGetOrderByIDResponse() {
        getOrderByID.receivedErrorMessageNotFoundGetOrderByIDResponse();
    }

    @And("I received error message \"record not found\" get order by ID response")
    public void receivedErrorMessageRecordNotFoundGetOrderByIDResponse() {
        getOrderByID.receivedErrorMessageRecordNotFoundGetOrderByIDResponse();
    }

}
