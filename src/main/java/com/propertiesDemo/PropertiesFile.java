package com.propertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public void getValue(String key) {
		String baseDir=System.getProperty("user.dir");
		String value="";
		try {
			FileInputStream fis = new FileInputStream(baseDir+"//src//main//resources//compropertiesDemo");
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
