package Endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import Utilities.RequestSpec;
import io.restassured.response.Response;

public class createUser {

	
	
	public static Response create_user() {
		String file="D:\\abiraj\\com.api.restassured\\src\\test\\resources\\data.json";
		
		return given()
				.spec(RequestSpec.getRequestSpec())
				.body(file)
				.when()
				.post("/create");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
