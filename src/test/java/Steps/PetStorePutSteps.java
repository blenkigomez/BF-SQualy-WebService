package Steps;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class PetStorePutSteps {
    private static RequestSpecification request;
    private Response response;
    private ValidatableResponse json;

@Given("^I send a PUT request with a valid body to the (.+)$")
public void sendPutRequest (String endpoint){
    File requestBody = new File("src/test/resources/Payloads/RequestBodyPut.json");

    response = request.when().body(requestBody).post(endpoint).prettyPeek();
}

}

