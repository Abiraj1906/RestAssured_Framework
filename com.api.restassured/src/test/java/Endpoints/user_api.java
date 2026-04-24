package Endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import javax.swing.text.Utilities;

import Utilities.RequestSpec;
import Utilities.ResponseSpec;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;




public class user_api {

	public static Response getuser() {
		
	return given()
		.spec(RequestSpec.getRequestSpec())
		.when()
		.get("/employees");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
