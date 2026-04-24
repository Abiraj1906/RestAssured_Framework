package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.user_api;
import Utilities.APIreporter;
import Utilities.ResponseSpec;
import base.basetest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class employeetest extends basetest{

	
	@Test
	public void test_employee() {
		
		Response response=user_api.getuser();
		response.then().log().all()
		.spec(ResponseSpec.getResponseSpec());
		
		APIreporter.logResponse(response);
 int id=response.jsonPath().getInt("data[0].id");		
 String emp_name=response.jsonPath().getString("data[0].employee_name");
 
		System.out.println("id of the first element"+id);
		System.out.println("employee_name"+emp_name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
