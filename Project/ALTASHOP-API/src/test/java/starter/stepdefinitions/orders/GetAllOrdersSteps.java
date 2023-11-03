package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.orders.GetAllOrders;

public class GetAllOrdersSteps {
    @Steps
    GetAllOrders getAllOrders;

    @Given ("I set API endpoint valid for get all orders")
    public void setAPIEndpointValidGetAllOrders() {
        getAllOrders.setAPIEndpointValidGetAllOrders();
    }

    @When ("I set the type \"Bearer Token\" on the authorization tab in get all order")
    public void setTheTypeBearerTokenOnTheAuthorizationGetAllOrder() {
        getAllOrders.setTheTypeBearerTokenOnTheAuthorizationGetAllOrder();
    }

    @And ("I enter a valid token")
    public void enterValidToken() {
        getAllOrders.enterValidToken();
    }

    @And ("I send request to get all orders")
    public void sendRequestGetAllOrders() {
        getAllOrders.sendRequestGetAllOrders();
    }

    @Then ("I received status code of 200 OK for a get all orders")
    public void receivedStatusCode200OKGetAllOrders() {
        getAllOrders.receivedStatusCode200OKGetAllOrders();
    }

    @And ("I received list data get all orders response")
    public void receivedListDataGetAllOrdersResponse() {
        getAllOrders.receivedListDataGetAllOrdersResponse();
    }

    @Given("I set API endpoint for get all orders with an invalid path")
    public void setAPIEndpointGetAllOrdersWithInvalidPath() { getAllOrders.setAPIEndpointGetAllOrdersWithInvalidPath();}

    @And("I send request to get all orders with an invalid path")
    public void sendRequestGetAllOrdersWithInvalidPath() { getAllOrders.sendRequestGetAllOrdersWithInvalidPath();}

    @Then("I received status code 404 Not Found in request to get all orders")
    public void receivedStatusCode404NotFoundRequestGetAllOrders() {
        getAllOrders.receivedStatusCode404NotFoundRequestGetAllOrders();
    }

    @And("I received message error \"not found\" get all orders response")
    public void receivedMessageErrorNotFoundGetAllOrdersResponse() {
        getAllOrders.receivedMessageErrorNotFoundGetAllOrdersResponse();
    }

}
