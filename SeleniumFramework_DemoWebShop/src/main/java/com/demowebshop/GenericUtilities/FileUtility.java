package com.demowebshop.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String readKeyValueFromPropertyFile(String Key) throws FileNotFoundException, IOException {
		Properties property = new Properties();
		property.load(new FileInputStream(FrameworkConstants.propertyFilePath));
		return property.getProperty(Key);
	}

}
