package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProductPage productPage;

    @Given("I set the endpoint on the login page")
    public void setEndpointOnTheLoginPage() {
        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        loginPage.validateOnLoginPage();
    }

    // Scenario Positive
    @When("I enter valid email")
    public void enterValidEmail() {
        loginPage.inputEmail("miaaprilia2803@gmail.com");
    }

    @And("I enter valid password")
    public void enterValidPassword() {
        loginPage.inputPassword("test");
    }

    @And("I tap login button")
    public void tapLoginButton() {
        loginPage.tapLoginButton();
    }

    @Then("User redirect to home page")
    public void userRedirectHomepage() {
        Assertions.assertTrue(productPage.validateOnProductPage());
    }

    // Scenario Positive
    @When("I blank form login")
    public void blankFormLogin() { loginPage.inputForm("", "");
    }

    @Then("I see error message appear \"email is required\" in login page")
    public void seeErrorMessageAppearEmailIsRequiredInLoginPage() { loginPage.validateOnLoginPage(); }

    @When("I blank email in login page")
    public void blankEmailInLoginPage() {
        loginPage.inputEmail("");
    }

    @When("I blank password in login")
    public void blankPasswordInLoginPage() {
        loginPage.inputPassword("");
    }

    @Then("I see error message appear \"password is required\" in login page")
    public void seeErrorMessageAppearPasswordIsRequiredInLoginPage() { loginPage.validateOnLoginPage(); }

    @When("I enter invalid email")
    public void enterInvalidEmail() {
        loginPage.inputEmail("miaaprilia28@gmail.com");
    }

    @Then("I see error message appear \"record not found\" in login page")
    public void seeErrorMessageAppearRecordNotFound() { loginPage.validateOnLoginPage(); }

    @And("I enter invalid password")
    public void enterInvalidPassword() {
        loginPage.inputPassword("tes");
    }

    @Then("I see error message appear \"email or password is invalid\" in login page")
    public void seeErrorMessageAppearEmailOrPasswordIsInvalid() { loginPage.validateOnLoginPage(); }

    @When("I enter unregistered email")
    public void enterUnregisteredEmail() {
        loginPage.inputEmail("testcredentialsunresgist@gmail.com");
    }

    @And("I enter a password that has not been registered")
    public void enterPasswordThatHasNotBeenRegistered() {
        loginPage.inputPassword("test");
    }
}
