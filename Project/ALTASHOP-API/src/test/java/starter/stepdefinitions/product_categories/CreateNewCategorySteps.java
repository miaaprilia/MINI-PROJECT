package starter.stepdefinitions.product_categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product_categories.CreateNewCategory;

public class CreateNewCategorySteps {
    @Steps
    CreateNewCategory createNewCategory;

    @Given ("I set API endpoint valid for create new category")
    public void setAPIEndpointValidCreateNewCategory() {
        createNewCategory.setAPIEndpointValidCreateNewCategory();
    }

    @When ("I filling a valid body request new category")
    public void fillingValidBodyRequestNewCategory() {
        createNewCategory.fillingValidBodyRequestNewCategory();
    }

    @And ("I send request to create new category")
    public void sendRequestCreateNewCategory() {
        createNewCategory.sendRequestCreateNewCategory();
    }

    @Then ("I received status code of 200 OK for a create new category")
    public void receivedStatusCode200OKNewCategory() {
        createNewCategory.receivedStatusCode200OKNewCategory();
    }

    @And ("I successfully added a new category")
    public void successfullyAddedNewCategory() {
        createNewCategory.successfullyAddedNewCategory();
    }

    @And ("I received new category data that was successfully added")
    public void receivedNewCategoryDataSuccessfullyAdded() {
        createNewCategory.receivedNewCategoryDataSuccessfullyAdded();
    }

    @Given ("I set API endpoint for create new category with an invalid path")
    public void setAPIEndpointCreateNewCategoryWithInvalidPath() {
        createNewCategory.setAPIEndpointCreateNewCategoryWithInvalidPath();
    }

    @And ("I send request to create new category with an invalid path")
    public void receivedNewOrderDataSuccessfullyAdded() {
        createNewCategory.sendRequestCreateNewCategoryWithInvalidPath();
    }

    @Then("I received status code 404 Not Found in request to create new category")
    public void receivedStatusCode404NotFoundRequestCreateNewCategory() { createNewCategory.receivedStatusCode404NotFoundRequestCreateNewCategory();}

    @And("I received message error \"not found\" create new category response")
    public void receivedMessageErrorNotFoundCreateNewCategoryResponse() { createNewCategory.receivedMessageErrorNotFoundCreateNewCategoryResponse();}

    @When("I blank the create new category request")
    public void blankCreateNewCategoryRequest() { createNewCategory.blankCreateNewCategoryRequest();}

    @And("I send request to create new category with blank request")
    public void sendRequestCreateNewCategoryWithBlankRequest() {
        createNewCategory.sendRequestCreateNewCategoryWithBlankRequest();
    }

    @Then("I received status code 500 Internal Server Error in request to create new category")
    public void receivedStatusCode500InternalServerErrorNewCategory() { createNewCategory.receivedStatusCode500InternalServerErrorNewCategory();}

    @And("I received message \\(SQLSTATE 23514) create new category response")
    public void receivedMessageSQLSTATECreateNewCategoryResponse() { createNewCategory.receivedMessageSQLSTATECreateNewCategoryResponse();}
    }


