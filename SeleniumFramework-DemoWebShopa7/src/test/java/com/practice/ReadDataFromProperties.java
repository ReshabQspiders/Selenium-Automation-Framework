package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		//1 Create Object of File Class and handle FileInputStreamException
		File file=new 
        File("C:\\Users\\qspiders wakad\\Documents\\sample.properties");
		//2 Create Object of FileInputStream and Handle IOException
		FileInputStream fis=new FileInputStream(file);
		//3 Create object of Properties Class 
		Properties property=new Properties();
		//4 Call Load() to load the FIS in the Properties Object
		property.load(fis);
		//5 Read the values using Key from the properties file
		String writtenbrowser = property.getProperty("browser");
		String url = property.getProperty("applicationUrl");
		System.out.println(writtenbrowser);
		System.out.println(url);

	}

}
