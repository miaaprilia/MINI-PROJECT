package starter.stepdefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.Register;

public class RegisterSteps {
    @Steps
    Register register;

    @Given("I set API endpoint valid for register new user")
    public void setAPIEndpointValidRegisterUser() {
        register.setAPIEndpointValidRegisterUser();
    }

    @When("I enter a valid email format")
    public void enterValidEmailFormat() {
        register.enterValidEmailFormat();
    }

    @And("I enter password")
    public void enterPassword() {
        register.enterPassword();
    }

    @And("I enter fullname")
    public void enterFullname() { register.enterFullname();
    }

    @And("I send request to register user")
    public void sendRequestRegisterUser() {
        register.sendRequestRegisterUser();
    }

    @Then("I received status code 200 OK register user")
    public void receivedStatusCode200OKRegisterUser() { register.receivedStatusCode200OKRegisterUser();}

    @And("I received register user data response")
    public void receivedRegisterUserDataResponse() { register.receivedRegisterUserDataResponse();}

    @Given("I set API endpoint invalid for register user without the path")
    public void setAPIEndpointInvalidRegisterUser() { register.setAPIEndpointInvalidRegisterUser();}

    @Then("I received status code 404 Not Found in request to register user")
    public void receiveStatusCode404NotFoundRegisterUser() { register.receiveStatusCode404NotFoundRegisterUser();}

    @And("I received error message \"not found\" response Register")
    public void receivedErrorMessageNotFoundResponseRegister() { register.receivedErrorMessageNotFoundResponseRegister();}

    @When("I blank the register request Register")
    public void blankRegisterRequest() { register.blankRegisterRequest();}

    @Then("I received status code 400 Bad Request in request to register user")
    public void receivedStatusCode400BadRequestRegisterUser() { register.receivedStatusCode400BadRequestRegisterUser();}

    @And("I blank the email request Register")
    public void blankEmailRequestRegister() { register.blankEmailRequestRegister();}

    @And("I received the error message \"email is required\" register response")
    public void receivedErrorMessageEmailIsRequiredRegister() { register.receivedErrorMessageEmailIsRequiredRegister();}

    @And("I blank the password request Register")
    public void blankPasswordRequestRegister() { register.blankPasswordRequestRegister();}

    @And("I received the error message \"password is required\" register response")
    public void receivedErrorMessagePasswordIsRequiredRegister() { register.receivedErrorMessagePasswordIsRequiredRegister();}

    @And("I blank the fullname request Register")
    public void blankFullnameRequest() { register.blankFullnameRequest();}

    @And("I received the error message \"fullname is required\" register response")
    public void receivedErrorMessageFullnameIsRequired() { register.receivedErrorMessageFullnameIsRequired();}

    @When("I enter email invalid format")
    public void enterEmailInvalidFormat() { register.enterEmailInvalidFormat();}

    @And("I received the error message \"unknown email format\" response")
    public void receivedErrorMessageUnknownEmailFormat() { register.receivedErrorMessageUnknownEmailFormat();}
}
