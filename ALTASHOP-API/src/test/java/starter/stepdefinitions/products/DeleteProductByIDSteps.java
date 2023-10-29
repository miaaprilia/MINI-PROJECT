package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.DeleteProductByID;

public class DeleteProductByIDSteps {
    @Steps
    DeleteProductByID deleteProductByID;

    @Given ("I set API endpoint valid for delete product by ID")
    public void setAPIEndpointValidDeleteProductByID() {
        deleteProductByID.setAPIEndpointValidDeleteProductByID();
    }

    @When ("I send request to delete product by ID")
    public void sendRequestDeleteProductByID() {
        deleteProductByID.sendRequestDeleteProductByID();
    }

    @Then ("I received status code of 200 OK for a delete product")
    public void receivedStatusCode200OKDeleteProductByID() {
        deleteProductByID.receivedStatusCode200OKDeleteProductByID();
    }

    @And ("I received data message \"null\" delete product by ID response")
    public void receivedDataMessageNullDeleteProductByIDResponse() {
        deleteProductByID.receivedDataMessageNullDeleteProductByIDResponse();
    }

    @Given("I set API endpoint for delete product by ID with an invalid path")
    public void setAPIEndpointDeleteProoductByIDWithInvalidPath() { deleteProductByID.setAPIEndpointDeleteProoductByIDWithInvalidPath();}

    @When("I send request to delete product by ID with an invalid path")
    public void sendRequestDeleteProductByIDWithInvalidPath() { deleteProductByID.sendRequestDeleteProductByIDWithInvalidPath();}

    @Then("I received status code 405 Method Not Allowed in request to delete product")
    public void receivedStatusCode405MethodNotAllowedRequestDeleteProduct() { deleteProductByID.receivedStatusCode405MethodNotAllowedRequestDeleteProduct();}

    @And("I received message error \"method not allowed\" delete product by ID response")
    public void receivedMessageErrorMethodNotAllowedDeleteProductByIDResponse() {
        deleteProductByID.receivedMessageErrorMethodNotAllowedDeleteProductByIDResponse();
    }
}
