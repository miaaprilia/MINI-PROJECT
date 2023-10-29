package starter.stepdefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.GetUserInformation;

public class GetUserInformationSteps {
    @Steps
    GetUserInformation getUserInformation;

    //Scenario Positive
    @Given("I set a valid API endpoint to get user information")
    public void setAPIEndpointValidGetUserInformation() {
        getUserInformation.setAPIEndpointValidGetUserInformation();
    }

    @When("I set the type \"Bearer Token\" on the authorization tab in user information")
    public void setTypeBearerTokenOnTheAuthorizationInUserInformation() {
        getUserInformation.setTypeBearerTokenOnTheAuthorizationInUserInformation();
    }

    @And("I enter a valid token user information")
    public void enterValidTokenUserInformation() {
        getUserInformation.enterValidTokenUserInformation();
    }

    @And("I send a request to get user information")
    public void sendRequestToGetUserInformation() { getUserInformation.sendRequestToGetUserInformation();
    }

    @Then("I received status code of 200 OK get user information")
    public void receivedStatusCode200OKGetUserInformation() {
        getUserInformation.receivedStatusCode200OKGetUserInformation();
    }

    @And("I received user information data response")
    public void receivedUserInformationDataResponse() { getUserInformation.receivedUserInformationDataResponse();}

    //Scenario Negative
    @Given("I set API endpoint invalid for get user information user without the path")
    public void setAPIEndpointInvalidGetUserInformation() { getUserInformation.setAPIEndpointInvalidGetUserInformation();}

    @When("I send a request without path to get user information")
    public void sendRequestWithoutPathToGetUserInformation() { getUserInformation.sendRequestWithoutPathToGetUserInformation();}

    @Then("I received status code 404 Not Found in request to get user information")
    public void receiveStatusCode404NotFoundGetUserInformation() { getUserInformation.receiveStatusCode404NotFoundGetUserInformation();}

    @And("I received error message \"not found\" response")
    public void receivedErrorMessageNotFoundResponseUserInformation() { getUserInformation.receivedErrorMessageNotFoundResponseUserInformation();}

    @And("I blank the token request Get User Information")
    public void blankTokenRequestGetUserInformation() { getUserInformation.blankTokenRequestGetUserInformation();}

    @And("I send a request without token to get user information")
    public void sendRequestWithoutTokenToGetUserInformation() { getUserInformation.sendRequestWithoutTokenToGetUserInformation();}

    @Then("I received status code 401 Unauthorized in request to get user information")
    public void receivedStatusCode401UnauthorizedGetUserInformation() { getUserInformation.receivedStatusCode401UnauthorizedGetUserInformation();}

    @And("I received the error message \"unauthorized\" response")
    public void receivedErrorMessageUnauthorized() { getUserInformation.receivedErrorMessageUnauthorized();}

    @And("I enter invalid token")
    public void enterInvalidToken() { getUserInformation.enterInvalidToken();}

    @And("I send a request invalid token to get user information")
    public void sendRequestInvalidTokenToGetUserInformation() { getUserInformation.sendRequestInvalidTokenToGetUserInformation();}

    @And("I received the error message \"signature is invalid\" response")
    public void receivedErrorMessageSignatureIsInvalid() { getUserInformation.receivedErrorMessageSignatureIsInvalid();}

    @When("I set a type other than \"Bearer Token\" on the authorization tab")
    public void setTypeOtherThanBearerTokenOnTheAuthorization() { getUserInformation.setTypeOtherThanBearerTokenOnTheAuthorization();}

    @And("I send a request type other than \"Bearer Token\" to get user information")
    public void sendRequestTypeOtherThanToGetUserInformation() { getUserInformation.sendRequestTypeOtherThanToGetUserInformation();}

}
