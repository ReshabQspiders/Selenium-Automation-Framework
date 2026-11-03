package com.demowebshop.generic_utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility {
	
	public String getTimeStamp() {
	   return LocalDateTime.now().
				format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
	}
	
	public int getRandomNumber() {
		return new Random().nextInt(100000);
	}

}
