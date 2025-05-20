package selflearn.selflearn;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssureAutomation2 {	
	

	    public static void main(String[] args) {
	        // Base URI setup
//	        RestAssured.baseURI = "http://rest-assured.io/api";

	        // GET Request Automation
//	        Response response = 
	            given()
	                .header("Accept", "application/json")  // Request header
	            .when()
	                .get("http://rest-assured.io/api")  // Sending GET request
	            .then()
	                .statusCode(404)  // Validating HTTP 200 status
	                .body("message", notNullValue())  // Ensuring response has a 'message' field
	                .extract()
	                .response(); // Extracting full response
	            System.out.println("API Call was successful");
	        
	        // Printing response body
//	        System.out.println("Response Body: " + response.asString());
	    }
	

}
