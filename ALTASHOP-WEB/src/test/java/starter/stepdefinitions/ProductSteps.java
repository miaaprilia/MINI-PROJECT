package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductPage;

public class ProductSteps {
    @Steps
    ProductPage productPage;

    LoginPage loginPage;

    @Given ("I set the endpoint on the home page without login")
    public void setEndpointOnTheHomePageWithoutLogin() {
        productPage.openUrl("https://alta-shop.vercel.app/");
        productPage.validateOnProductPage();
    }

    // Scenario Positive
    @When ("I select 1 or more products on the home page")
    public void select1OrMoreProductsOnTheHomePage() { productPage.select1OrMoreProductsOnTheHomePage();
    }

    @And ("I tap the buy button")
    public void tapTheBuyButton() {
        productPage.tapTheBuyButton();
    }

    @And("I tap the cart button at the top right of the page")
    public void tapCartButtonAtTheTopRightPage() {
        productPage.tapCartButtonAtTheTopRightPage();
    }

    @And("I tap the pay button")
    public void tapPayButton() {
        productPage.tapPayButton();
    }

    @And ("I was directed to the login page")
    public void userRedirectLoginPage() {
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @And("I enter valid credentials")
    public void enterValidCredentials() { loginPage.inputForm("miaaprilia2803@gmail.com", "test");
    }

    @And("I tap the login button")
    public void tapLoginButton() { loginPage.tapLoginButton();
    }

    @And("I was directed to the transaction page")
    public void userRedirectTransactionPage() { Assertions.assertTrue(productPage.validateOnProfilePage());
    }

    @When("I tap the detail button")
    public void tapDetailButton() {
        productPage.tapDetailButton();
    }

    @Then("I was directed to the product detail page")
    public void userRedirectProductDetailPage() {
        Assertions.assertTrue(productPage.validateOnProductPage());
    }

    @And("I rating in arrange 1 star symbol")
    public void ratingInArrange1StarSymbol() {
        productPage.ratingInArrange1StarSymbol(); }

    @And("I rating in arrange 2 star symbol")
    public void ratingInArrange2StarSymbol() {
        productPage.ratingInArrange2StarSymbol(); }

    @And("I rating in arrange 3 star symbol")
    public void ratingInArrange3StarSymbol() {
        productPage.ratingInArrange3StarSymbol(); }

    @And("I rating in arrange 4 star symbol")
    public void ratingInArrange4StarSymbol() {
        productPage.ratingInArrange4StarSymbol(); }

    @And("I rating in arrange 5 star symbol")
    public void ratingInArrange5StarSymbol() {
        productPage.ratingInArrange5StarSymbol(); }

    @Then("I can see the submitted ratings")
    public void canSeeSubmittedRatings() {
            Assertions.assertTrue(productPage.validateOnProductPage());
        }
    }
