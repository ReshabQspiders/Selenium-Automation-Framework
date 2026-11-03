package com.demowebshop.generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readKeyValueFromPropertyfile(String key) 
			throws FileNotFoundException, IOException {
		Properties property=new Properties();
		property.load(new FileInputStream(FrameworkConstants.propertyFilePath));
		return property.getProperty(key);
	}
}
