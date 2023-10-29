package starter.stepdefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set API endpoint valid for login user")
    public void setAPIEndpointValidLoginUser() {
        login.setAPIEndpointValidLoginUser();
    }

    @When("I enter a valid email")
    public void enterValidEmail() {
        login.enterValidEmail();
    }

    @And("I enter a valid password")
    public void enterValidPassword() {
        login.enterValidPassword();
    }

    @And("I send request to login user with valid {string} and valid {string}")
    public void sendRequestValidLoginUser(String email, String password) {
        login.sendRequestValidLoginUser(email, password);
    }

    @Then("I received status code 200 OK login user")
    public void receivedStatusCode200OKLoginUser() { login.receivedStatusCode200OKLoginUser();}

    @And("I received token login user data response")
    public void receivedTokenLoginUserDataResponse() { login.receivedTokenLoginUserDataResponse();}

    @Given("I set API endpoint invalid for login user without the path")
    public void setAPIEndpointInvalidLoginUser() { login.setAPIEndpointInvalidLoginUser();}

    @When("I send request to login user no path")
    public void sendRequestLoginUserNoPath() { login.sendRequestLoginUserNoPath();}

    @Then("I received status code 404 Not Found in request to login user")
    public void receivedStatusCode404NotFoundInRequestLoginUser() { login.receivedStatusCode404NotFoundInRequestLoginUser();}

    @And("I received error message \"not found\" response Login")
    public void receivedErrorMessageNotFoundLogin() { login.receivedErrorMessageNotFoundLogin();}

    @When("I blank the login request")
    public void blankLoginRequest() { login.blankLoginRequest();}

    @And("I send a request to the login user")
    public void sentRequestLoginUser() { login.sentRequestLoginUser();}

    @Then("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestInRequestLoginUser() { login.receivedStatusCode400BadRequestInRequestLoginUser();}

    @When("I blank the email request Login")
    public void BlankEmailRequest() { login.BlankEmailRequest();}

    @And("I received the error message \"email is required\" login response")
    public void receivedErrorMessageEmailIsRequiredLogin() { login.receivedErrorMessageEmailIsRequiredLogin();}

    @And("I blank the password request Login")
    public void blankPasswordRequestLogin() { login.blankPasswordRequestLogin();}

    @And("I received the error message \"password is required\" response Login")
    public void receivedErrorMessagePasswordIsRequiredLogin() { login.receivedErrorMessagePasswordIsRequiredLogin();}

    @When("I enter an invalid email")
    public void enterInvalidEmail() { login.enterInvalidEmail();}

    @And("I send request to login user with invalid {string} and valid {string}")
    public void sendRequestInvalidEmail(String email, String password) {
        login.sendRequestInvalidEmail(email, password);
    }

    @And("I received an error message \"record not found\" response")
    public void receivedErrorMessageRecordNotFound() { login.receivedErrorMessageRecordNotFound();}

    @And("I enter an invalid password")
    public void enterInvalidPassword() { login.enterInvalidPassword();}

    @And("I send request to login user with valid {string} and invalid {string}")
    public void sendRequestInvalidPassword(String email, String password) {
        login.sendRequestInvalidPassword(email, password);
    }

    @And("I received message error \"email or password is invalid\" response")
    public void receivedErrorMessageEmailOrPasswordIsRequired() { login.receivedErrorMessageEmailOrPasswordIsRequired();}
}
