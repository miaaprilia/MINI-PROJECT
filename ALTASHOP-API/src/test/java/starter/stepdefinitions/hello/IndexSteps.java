package starter.stepdefinitions.hello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.hello.Index;

public class IndexSteps {
    @Steps
    Index index;

    @Given ("I set API endpoint valid for index")
    public void setAPIEndpointValidIndex() {
        index.setAPIEndpointValidIndex();
    }

    @When ("I send request to index")
    public void sendRequestIndex() {
        index.sendRequestIndex();
    }

    @Then ("I received status code of 200 OK for a index")
    public void receivedStatusCode200OKIndex() {
        index.receivedStatusCode200OKIndex();
    }

    @And ("I received data message \"hello\" index response")
    public void receivedDataMessageHelloIndexResponse() {
        index.receivedDataMessageHelloIndexResponse();
    }

    @Given("I set API endpoint for index with an invalid path")
    public void setAPIEndpointIndexWithInvalidPath() { index.setAPIEndpointIndexWithInvalidPath();}

    @When("I send request to index with an invalid path")
    public void sendRequestIndexWithInvalidPath() { index.sendRequestIndexWithInvalidPath();}

    @Then("I received status code 404 Not Found in request to index")
    public void receivedStatusCode404NotFoundInRequestIndex() { index.receivedStatusCode404NotFoundInRequestIndex();}

    @And("I received message error \"not found\" index response")
    public void receivedMessageErrorNotFoundIndexResponse() {
        index.receivedMessageErrorNotFoundIndexResponse();
    }

}
