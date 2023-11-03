package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {

    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given ("I set the endpoint on the register page")
    public void setEndpointOnTheRegisterPage() {
        registerPage.openUrl("https://alta-shop.vercel.app/auth/register");
        registerPage.validateOnRegisterPage();
    }

    // Scenario Positive
    @When ("I enter fullname")
    public void enterFullname() {
        registerPage.inputFullname("Mia Aprilia Satya");
    }

    @And ("I enter a valid email format")
    public void enterValidEmailFormat() {
        registerPage.inputEmail("testeraltashop_web9@gmail.com");
    }

    @And("I enter password")
    public void enterPassword() {
        registerPage.inputPassword("test");
    }

    @And("I tap register button")
    public void tapRegisterButton() {
        registerPage.tapRegisterButton();
    }

    @Then ("User redirect to login page")
    public void userRedirectLoginpage() {
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    // Scenario Positive
    @When("I blank form register")
    public void blankFormRegister() { registerPage.inputForm("", "", "");
    }

    @Then("I see error message appear \"email is required\" in register page")
    public void seeErrorMessageAppearEmailIsRequiredInRegisterPage() { registerPage.validateOnRegisterPage(); }

    @When("I blank fullname in register page")
    public void blankFullnameInRegisterPage() {
        registerPage.inputFullname("");
    }

    @Then("I see error message appear \"fullname is required\" in register page")
    public void seeErrorMessageAppearFullnameIsRequired() { registerPage.validateOnRegisterPage(); }

    @And("I blank email in register page")
    public void blankEmailInRegisterPage() {
        registerPage.inputEmail("");
    }

    @Then("I see error message appear \"name is required\" in register page")
    public void seeErrorMessageAppearNameIsRequired() { registerPage.validateOnRegisterPage(); }

    @And("I blank password in register page")
    public void blankPasswordInRegisterPage() {
        registerPage.inputPassword("");
    }

    @Then("I see error message appear \"password is required\" in register page")
    public void seeErrorMessageAppearPasswordIsRequiredInRegisterPage() { registerPage.validateOnRegisterPage(); }

    @And("I enter email invalid format")
    public void enterEmailInvalidFormat() {
        registerPage.inputEmail("testeraltashop_1.com");
    }

    @Then("I see error message appear \"unknown email format\" in register page")
    public void seeErrorMessageAppearUnknownEmailFormat() { registerPage.validateOnRegisterPage(); }
}
