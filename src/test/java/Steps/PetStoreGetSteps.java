package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PetStoreGetSteps {

    private static RequestSpecification request;
    private Response response;
    private ValidatableResponse json;

    @Then("^I get a (\\d+) status code$")
    public void expectedStatusCode(int expectedStatusCode) {
        response = request
                .when()
                .post("/v2/pet");

        json = response.then().statusCode(expectedStatusCode);
    }

    @Given("^I send a GET request to the (.+) endpoint$")
    public void validateValue(int id, String endpoint) {
        response = request
                .when()
                .get(endpoint + "/v2/pet/" + id);
    }
    
}
