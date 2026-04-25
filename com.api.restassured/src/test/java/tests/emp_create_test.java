package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import Endpoints.createUser;
import Utilities.APIreporter;
import Utilities.ResponseSpec;
import base.basetest;
import io.restassured.response.Response;

public class emp_create_test extends basetest{

	
	
	@Test
	public void create_emp() throws JsonProcessingException {
		
		Response response=createUser.create_user();
		response.then().log().all()
		.spec(ResponseSpec.getResponseSpec());
		APIreporter.logResponse(response);
	Assert.assertEquals(response.statusCode(), 200);	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
