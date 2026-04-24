package Utilities;

import io.restassured.response.Response;

public class APIreporter extends Extentreport{

	
	 public static void logResponse(Response response) {
	        try {
				test.info("Status Code: " + response.getStatusCode());
		        test.info("Response Body: " + response.asPrettyString());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
