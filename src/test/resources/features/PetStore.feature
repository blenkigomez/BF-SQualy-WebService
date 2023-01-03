@PetStore
Feature: PetStore API scenarios

Scenario: Prueba POST
Given I send a POST request with a valid body to the https://petstore.swagger.io endpoint
Then I get a 200 status code

Scenario: Prueba GET al endpoint con ID
Given I send a GET request to thehttps://petstore.swagger.io endpoint
Then I validate there are 1 ID on the /ID endpoint

Scenario: Prueba PUT
Given I send a PUT request with a valid body to the https://petstore.swagger.io endpoint
Then I get a 200 status code