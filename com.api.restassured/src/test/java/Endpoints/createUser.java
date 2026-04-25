package Endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.request_pojo;
import Utilities.RequestSpec;
import io.restassured.response.Response;

public class createUser {

	
	
	public static Response create_user() throws JsonProcessingException {
		request_pojo payload=new request_pojo();
		payload.setName("abiraj");
		payload.setSalary("1000");
		payload.setAge("28");
		
		
	ObjectMapper mapper=new ObjectMapper();
	String json=mapper.writeValueAsString(payload);
	System.out.println(json);	
	
		return given()
				.spec(RequestSpec.getRequestSpec())
				.body(json)
				.when()
				.post("/create");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
