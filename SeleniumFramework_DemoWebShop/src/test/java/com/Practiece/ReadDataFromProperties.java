package com.Practiece;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException  {
		//1 Create object of file Class And Handle FileInputStreamException
		File file=new File("C:\\Users\\shreyash padole\\OneDrive\\Documents\\Com.SampalFile.txt");
		//2 Create object of FileInputStrem and Handle IOException
		FileInputStream fis = new FileInputStream(file);
		//3 Create object of Properties Class
		Properties property=new Properties();
		//4 Call Load() to Load the FIS in the Properties Object 
		property.load(fis);
		//5 Read the values using Key from the Properties File
		String WrittenBrowser = property.getProperty("Browser");
		String URL = property.getProperty("ApplicatinURL");
		System.out.println(WrittenBrowser);
		System.out.println(URL);
		

	}

}
