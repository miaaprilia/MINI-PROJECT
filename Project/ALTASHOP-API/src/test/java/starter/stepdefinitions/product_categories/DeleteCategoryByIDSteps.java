package starter.stepdefinitions.product_categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product_categories.DeleteCategoryByID;

public class DeleteCategoryByIDSteps {
    @Steps
    DeleteCategoryByID deleteCategoryByID;

    @Given ("I set API endpoint valid for delete category by ID")
    public void setAPIEndpointValidDeleteCategoryByID() {
        deleteCategoryByID.setAPIEndpointValidDeleteCategoryByID();
    }

    @When ("I send request to delete category by ID")
    public void sendRequestDeleteCategoryByID() {
        deleteCategoryByID.sendRequestDeleteCategoryByID();
    }

    @Then ("I received status code of 200 OK for a delete category")
    public void receivedStatusCode200OKDeleteCategoryByID() {
        deleteCategoryByID.receivedStatusCode200OKDeleteCategoryByID();
    }

    @Given("I set API endpoint for delete category by ID with an invalid path")
    public void setAPIEndpointDeleteCategoryByIDWithInvalidPath() { deleteCategoryByID.setAPIEndpointDeleteCategoryByIDWithInvalidPath();}

    @When("I send request to delete category by ID with an invalid path")
    public void sendRequestDeleteCategoryByIDWithInvalidPath() { deleteCategoryByID.sendRequestDeleteCategoryByIDWithInvalidPath();}

    @Then("I received status code 405 Method Not Allowed in request to delete category by ID")
    public void receivedStatusCode405MethodNotAllowedRequestDeleteCategory() { deleteCategoryByID.receivedStatusCode405MethodNotAllowedRequestDeleteCategory();}

    @And("I received message error \"method not allowed\" delete category by ID response")
    public void receivedMessageErrorMethodNotAllowedDeleteCategoryByIDResponse() {
        deleteCategoryByID.receivedMessageErrorMethodNotAllowedDeleteCategoryByIDResponse();
    }
}

