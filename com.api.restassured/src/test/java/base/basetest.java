package base;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;

import Utilities.Extentreport;
import Utilities.configreader;
import io.restassured.RestAssured;

public class basetest extends Extentreport {

	@BeforeClass
	
	public  void setup() throws FileNotFoundException {
		RestAssured.baseURI=configreader.getProperty("base_url");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
