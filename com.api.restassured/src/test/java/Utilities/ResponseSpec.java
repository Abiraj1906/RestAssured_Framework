package Utilities;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static  org.hamcrest.Matchers.*;
public class ResponseSpec {

	
	
	
	public static ResponseSpecification getResponseSpec() {
		
	return	new ResponseSpecBuilder()		
		.expectStatusCode(200)
		.expectStatusLine("HTTP/1.1 200 OK")
		.expectResponseTime(lessThan(5000L))
		.build();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
