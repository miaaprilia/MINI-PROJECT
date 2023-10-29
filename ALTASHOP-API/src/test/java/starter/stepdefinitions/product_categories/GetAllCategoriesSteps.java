package starter.stepdefinitions.product_categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product_categories.GetAllCategories;

public class GetAllCategoriesSteps {
    @Steps
    GetAllCategories getAllCategories;

    @Given ("I set API endpoint valid for get all categories")
    public void setAPIEndpointValidGetAllCategories() {
        getAllCategories.setAPIEndpointValidGetAllCategories();
    }

    @When ("I send request to get all categories")
    public void sendRequestGetAllCategories() {
        getAllCategories.sendRequestGetAllCategories();
    }

    @Then ("I received status code of 200 OK for a get all categories")
    public void receivedStatusCode200OKGetAllCategories() {
        getAllCategories.receivedStatusCode200OKGetAllCategories();
    }

    @And ("I received list data category response")
    public void receivedListDataCategoryResponse() {
        getAllCategories.receivedListDataCategoryResponse();
    }

    @Given("I set API endpoint for get all categories with an invalid path")
    public void setAPIEndpointInvalidGetAllCategoriesWithInvalidPath() { getAllCategories.setAPIEndpointInvalidGetAllCategoriesWithInvalidPath();}

    @When("I send request to get all categories with an invalid path")
    public void sendRequestGetAllCategoriesNoPath() { getAllCategories.sendRequestGetAllCategoriesNoPath();}

    @Then("I received status code 404 Not Found in request to get all categories")
    public void receivedStatusCode404NotFoundInRequestGetAllCategories() { getAllCategories.receivedStatusCode404NotFoundInRequestGetAllCategories();}

    @And("I received message error \"not found\" get all categories response")
    public void receivedMessageErrorNotFoundGetAllCategoriesResponse() {
        getAllCategories.receivedMessageErrorNotFoundGetAllCategoriesResponse();
    }

}
