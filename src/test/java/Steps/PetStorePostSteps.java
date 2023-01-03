package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.io.File;


public class PetStorePostSteps {
    private static RequestSpecification request;
    private Response response;
    private ValidatableResponse json;

    @Given("^I send a POST request with a valid body to the (.+) URI$")
    public void sendPOSTRequest(String endpoint) {
        File requestBody = new File("src/test/resources/Payloads/RequestBody.json");

        response = request.when().body(requestBody).post(endpoint).prettyPeek();
    }
}
