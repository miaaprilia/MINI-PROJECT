package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CategoryPage;

public class CategorySteps {
    @Steps
    CategoryPage categoryPage;


    // Scenario Positive
    @When ( "I select the category" )
    public void selectCategoryThatContainsProductItems() {
        categoryPage.selectCategoryThatContainsProductItems();
    }

    @And ( "I tap that contains product items on the home page" )
    public void tapCategoryThatContainsProductItems(){
        categoryPage.KucingOrenIsDisplayed();
    }

    @Then ( "I view products based on the selected category" )
    public void viewProductsBasedOnTheSelectedCategory() {
        Assertions.assertTrue(categoryPage.validateOnCategoryPage());
    }

    @And ( "I tap that does not contain product items on the home page" )
    public void tapCategoryThatDoesNotContainsProductItems() {
        categoryPage.tapCategoryThatDoesNotContainsProductItems();
    }

    @Then ( "I see the message appear {string} in order page" )
    public void seeErrorMessageAppearProductAreEmpty(String message) {
        Assertions.assertTrue(categoryPage.validateInformationMessage(message));
        Assertions.assertTrue(categoryPage.validationErrorMessage());
    }

    @And ( "I don't see products based on the selected category" )
    public void dontSeeProductsBasedOnTheSelectedCategory() {
    }
}

