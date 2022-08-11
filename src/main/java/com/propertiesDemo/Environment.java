package com.propertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Environment {
public String getApplyUrl() throws FileNotFoundException {
	String baseDir=System.getProperty("user.dir");
	FileInputStream fis= new FileInputStream("");
	Properties prop=new Properties();
	String value="";
	try {
		prop.load(fis);
		value.prop.getProperty("app_url");
		
	}catch(IOException e){
		e.printStackTrace();
		
	}
return value;
}

}
