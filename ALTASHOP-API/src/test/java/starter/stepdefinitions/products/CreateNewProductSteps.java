package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.CreateNewProduct;

public class CreateNewProductSteps {
    @Steps
    CreateNewProduct createNewProduct;

    @Given ("I set API endpoint valid for create new product")
    public void setAPIEndpointValidCreateNewProduct() {
        createNewProduct.setAPIEndpointValidCreateNewProduct();
    }

    @When ("I filling a valid body request")
    public void fillingValidBodyRequest() {
        createNewProduct.fillingValidBodyRequest();
    }

    @And ("I send request to create new product valid request")
    public void sendRequestCreateNewProductValidRequest() {
        createNewProduct.sendRequestCreateNewProductValidRequest();
    }

    @Then ("I received status code of 200 OK for a new product")
    public void receivedStatusCode200OKNewProduct() {
        createNewProduct.receivedStatusCode200OKNewProduct();
    }

    @And ("I successfully added a new product")
    public void successfullyAddedNewProduct() {
        createNewProduct.successfullyAddedNewProduct();
    }

    @And ("I received new product data that was successfully added")
    public void receivedNewProductDataSuccessfullyAdded() {
        createNewProduct.receivedNewProductDataSuccessfullyAdded();
    }

    @Given("I set API endpoint for create new product without the path")
    public void setAPIEndpointCreateNewProductWithoutPath() { createNewProduct.setAPIEndpointCreateNewProductWithoutPath();}

    @When("I send request to create new product no path")
    public void sendRequestCreateNewProductNoPath() { createNewProduct.sendRequestCreateNewProductNoPath();}

    @Then("I received status code 404 Not Found in request to create new product")
    public void receivedStatusCode404NotFoundRequestCreateNewProduct() { createNewProduct.receivedStatusCode404NotFoundRequestCreateNewProduct();}

    @And("I received message error \"not found\" create new product response")
    public void receivedMessageErrorNotFoundCreateNewProductResponse() {
        createNewProduct.receivedMessageErrorNotFoundCreateNewProductResponse();
    }

    @When("I filled in all valid fill requests but only the name column blank")
    public void fillingAllValidFillRequestButOnlyNameColumnBlank() { createNewProduct.fillingAllValidFillRequestButOnlyNameColumnBlank();}

    @And ("I send request to create new product with name blank")
    public void sendRequestCreateNewProductWithNameBlank() {
        createNewProduct.sendRequestCreateNewProductWithNameBlank();
    }

    @Then("I received status code of 500 Internal Server Error for a new product")
    public void receivedStatusCode500InternalServerErrorNewProduct() { createNewProduct.receivedStatusCode500InternalServerErrorNewProduct();}

    @And("I received error SQLSTATE 23514 response")
    public void receivedErrorSQLSTATEResponse() {
        createNewProduct.receivedErrorSQLSTATEResponse();
    }

    @When("I filled in all valid fill requests but only the price column blank")
    public void fillingAllValidFillRequestButOnlyPriceColumnBlank() { createNewProduct.fillingAllValidFillRequestButOnlyPriceColumnBlank();}

    @And ("I send request to create new product with price blank")
    public void sendRequestCreateNewProductWithPriceBlank() {
        createNewProduct.sendRequestCreateNewProductWithPriceBlank();
    }

    @Then("I received status code of 400 Bad Request for a new product")
    public void receivedStatusCode400BadRequestNewProduct() { createNewProduct.receivedStatusCode400BadRequestNewProduct();}

    @And("I received message error \"invalid character\" response")
    public void receivedMessageErrorInvalidCharacterResponse() {
        createNewProduct.receivedMessageErrorInvalidCharacterResponse();
    }
}