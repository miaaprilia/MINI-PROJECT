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
    public void setAPIEndpointValidLoginUserPath() {
        login.setAPIEndpointValidLoginUserPath();
    }

    @When("I enter a valid email")
    public void enterValidEmail() {
        login.enterValidEmail();
    }

    @And("I enter a valid password")
    public void enterValidPassword() {
        login.enterValidPassword();
    }

    @And("I send request to login user {String} and {String}")
    public void sendRequestValidLoginUser(String email, String password) {
        login.sendRequestValidLoginUser(email, password);
    }

    @Then("I received status code 200 OK login user")
    public void receivedStatusCode200OKLoginUser() { login.receivedStatusCode200OKLoginUser();}

    @And("I received token login user data response")
    public void receivedTokenLoginUserDataResponse() { login.receivedTokenLoginUserDataResponse();}

    @Given("I set API endpoint invalid for login user without the path")
    public void setAPIEndpointInvalidLoginUserWithoutPath() { login.setAPIEndpointInvalidLoginUserWithoutPath();}

    @When("I send request to login user no path")
    public void sendRequestLoginUserNoPath() { login.sendRequestLoginUserNoPath();}

    @Then("I received status code 404 Not Found in request to login user")
    public void receivedStatusCode404NotFoundInRequestLoginUser() { login.receivedStatusCode404NotFoundInRequestLoginUser();}

    @When("I am not to fill in the login request")
    public void notToFillInTheLoginRequest() { login.notToFillInTheLoginRequest();}

    @And("I sent a request to the login user to fill in the username & password")
    public void sentRequestLoginUserToFillIn() { login.sentRequestLoginUserToFillIn();}

    @Then("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestInRequestLoginUser() { login.receivedStatusCode400BadRequestInRequestLoginUser();}

    @And("I received error message \"username and password are not provided in JSON format\" response")
    public void receivedErrorMessageJSONFormat() { login.receivedErrorMessageJSONFormat();}

    @When("I fill in an invalid username")
    public void fillInAnInvalidUsername() { login.fillInAnInvalidUsername();}

    @And("I filled in a valid password")
    public void filledInAValidPassword() { login.filledInAValidPassword();}

    @And("I sent a request the login user")
    public void sendRequestInvalidLoginUser() { login.sendRequestInvalidLoginUser();}

    @Then("I received status code 401 Unauthorized in request login user")
    public void receivedStatusCode401UnauthorizedRequestLoginUser() { login.receivedStatusCode401UnauthorizedRequestLoginUser();}

    @And("I received an error message \"username or password is incorrect\" response")
    public void receivedErrorMessageIncorectCredentialsResponse() { login.receivedErrorMessageIncorectCredentialsResponse();}

    @When("I filled in a valid username")
    public void filledInAValidUsername() { login.filledInAValidUsername();}

    @And("I filled in an invalid password")
    public void filledInAnInvalidPassword() { login.filledInAnInvalidPassword();}
}
