package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configreader {

	static Properties conpro;
	
	public static String getProperty(String key) throws FileNotFoundException {
		
		FileInputStream fi=new FileInputStream("D:\\abiraj\\com.api.restassured\\src\\test\\resources\\config.properties");
		
		try {
			conpro=new Properties();
			conpro.load(fi);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return conpro.getProperty(key);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
