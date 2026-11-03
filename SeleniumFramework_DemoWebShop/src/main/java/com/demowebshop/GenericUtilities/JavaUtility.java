package com.demowebshop.GenericUtilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility {
	public String getTimeStame() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
	}

	public int getRandomNumber() {
		//Random random=new Random();
		//return random.nextInt(1000);
	     return new Random().nextInt(10000);
	}
	
}
