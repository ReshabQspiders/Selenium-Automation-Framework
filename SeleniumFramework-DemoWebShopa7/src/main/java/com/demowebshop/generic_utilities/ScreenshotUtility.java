package com.demowebshop.generic_utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	public void captureWebPage(WebDriver driver) throws IOException {
		JavaUtility ju=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(FrameworkConstants.screenshotPath
				+"/dwsFailure"+ju.getTimeStamp()+".png");
		FileHandler.copy(src, trg);
	}

}
