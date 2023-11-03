package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.orders.CreateNewOrder;

public class CreateNewOrderSteps {
    @Steps
    CreateNewOrder createNewOrder;

    @Given ("I set API endpoint valid for create new order")
    public void setAPIEndpointValidCreateNewOrder() {
        createNewOrder.setAPIEndpointValidCreateNewOrder();
    }

    @When ("I set the type \"Bearer Token\" on the authorization tab")
    public void setTheTypeBearerTokenOnTheAuthorizationCreateNewOrder() {
        createNewOrder.setTheTypeBearerTokenOnTheAuthorizationCreateNewOrder();
    }

    @And ("I enter a valid token new order")
    public void enterValidTokenNewOrder() {
        createNewOrder.enterValidTokenNewOrder();
    }

    @And ("I filling a valid body request new order")
    public void fillingValidBodyRequestNewOrder() {
        createNewOrder.fillingValidBodyRequestNewOrder();
    }

    @And ("I send request to create new order")
    public void sendRequestCreateNewOrder() {
        createNewOrder.sendRequestCreateNewOrder();
    }

    @Then ("I received status code of 200 OK for a new order")
    public void receivedStatusCode200OKNewOrder() {
        createNewOrder.receivedStatusCode200OKNewOrder();
    }

    @And ("I successfully added a new order")
    public void successfullyAddedNewOrder() {
        createNewOrder.successfullyAddedNewOrder();
    }

    @And ("I received new order data that was successfully added")
    public void receivedNewOrderDataSuccessfullyAdded() {
        createNewOrder.receivedNewOrderDataSuccessfullyAdded();
    }

    @Given("I set API endpoint for create new order with an invalid path")
    public void setAPIEndpointCreateNewOrderWithInvalidPath() { createNewOrder.setAPIEndpointCreateNewOrderWithInvalidPath();}

    @And("I send request to create new order with an invalid path")
    public void sendRequestCreateNewOrderWithInvalidPath() { createNewOrder.sendRequestCreateNewOrderWithInvalidPath();}

    @Then("I received status code 404 Not Found in request to create new order")
    public void receivedStatusCode404NotFoundRequestCreateNewOrder() { createNewOrder.receivedStatusCode404NotFoundRequestCreateNewOrder();}

    @And("I received message error \"not found\" create new order response")
    public void receivedMessageErrorNotFoundCreateNewOrderResponse() {
        createNewOrder.receivedMessageErrorNotFoundCreateNewOrderResponse();
    }

    @And("I blank the create new order request")
    public void blankCreateNewOrderRequest() { createNewOrder.blankCreateNewOrderRequest();}

    @And("I send request to create new order with blank request")
    public void sendRequestCreateNewOrderWithBlankRequest() { createNewOrder.sendRequestCreateNewOrderWithBlankRequest();}

    @Then("I received status code 400 Bad Request in request to create new order")
    public void receivedStatusCode400BadRequestNewOrder() { createNewOrder.receivedStatusCode400BadRequestNewOrder();}

    @And("I received message error \"invalid character\" create new order response")
    public void receivedMessageErrorInvalidCharacterCreateNewOrderResponse() {
        createNewOrder.receivedMessageErrorInvalidCharacterCreateNewOrderResponse();
    }
}
