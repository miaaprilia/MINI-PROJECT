package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.CreateCommentProduct;

public class CreateCommentProductSteps {
    @Steps
    CreateCommentProduct createCommentProduct;

    @Given ("I set API endpoint valid for create comment product")
    public void setAPIEndpointValidCreateCommentProduct() {
        createCommentProduct.setAPIEndpointValidCreateCommentProduct();
    }

    @When ("I set the type \"Bearer Token\" on the authorization tab create comment product")
    public void setTheTypeBearerTokenOnTheAuthorizationCreateCommentProduct() {
        createCommentProduct.setTheTypeBearerTokenOnTheAuthorizationCreateCommentProduct();
    }

    @And ("I enter a valid token comment product")
    public void enterValidTokenCommentProduct() {
        createCommentProduct.enterValidTokenCommentProduct();
    }

    @And ("I filling a valid body request comment product")
    public void fillingValidBodyRequestCommentProduct() {
        createCommentProduct.fillingValidBodyRequestCommentProduct();
    }

    @And ("I send request to create comment product")
    public void sendRequestCreateCommentProduct() {
        createCommentProduct.sendRequestCreateCommentProduct();
    }

    @Then ("I received status code of 200 OK for a comment product")
    public void receivedStatusCode200OKCommentProduct() {
        createCommentProduct.receivedStatusCode200OKCommentProduct();
    }

    @And ("I successfully create comment product")
    public void successfullyCreateCommentProduct() {
        createCommentProduct.successfullyCreateCommentProduct();
    }

    @And ("I received product comment data that was successfully added")
    public void receivedProductCommentDataWasSuccessfullyAdded() {
        createCommentProduct.receivedProductCommentDataWasSuccessfullyAdded();
    }

    @Given("I set API endpoint for create comment product with an invalid path")
    public void setAPIEndpointCreateCommentProductWithInvalidPath() { createCommentProduct.setAPIEndpointCreateCommentProductWithInvalidPath();}

    @And("I send request to create comment product with an invalid path")
    public void sendRequestCreateCommentProductWithInvalidPath() { createCommentProduct.sendRequestCreateCommentProductWithInvalidPath();}

    @Then("I received status code 404 Not Found in request to comment product")
    public void receivedStatusCode404NotFoundRequestCommentProduct() { createCommentProduct.receivedStatusCode404NotFoundRequestCommentProduct();}

    @And("I received message error \"not found\" create comment product response")
    public void receivedMessageErrorNotFoundCreateCommentProductResponse() {
        createCommentProduct.receivedMessageErrorNotFoundCreateCommentProductResponse();
    }

    @Given("I set API endpoint for create comment product without the path")
    public void setAPIEndpointCreateCommentProductWithoutPath () { createCommentProduct.setAPIEndpointCreateCommentProductWithoutPath();}

    @And("I left the content column blank")
    public void leftContentColumnBlank() { createCommentProduct.leftContentColumnBlank();}

    @And("I send request to create comment product without the path")
    public void sendRequestCreateCommentProductWithoutPath() {
        createCommentProduct.sendRequestCreateCommentProductWithoutPath();
    }

    @Then("I received status code 500 Internal Server Error in request to comment product")
    public void receivedStatusCode500InternalServerErrorRequestCommentProduct() { createCommentProduct.receivedStatusCode500InternalServerErrorRequestCommentProduct();}

    @And("I received error SQLSTATE 23514 create comment product response")
    public void receivedErrorSQLSTATECreateCommentProductResponse() {
        createCommentProduct.receivedErrorSQLSTATECreateCommentProductResponse();
    }
}
