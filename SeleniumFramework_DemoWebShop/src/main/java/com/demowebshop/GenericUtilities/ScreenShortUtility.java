package com.demowebshop.GenericUtilities;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShortUtility {
	public void captureWebPage(WebDriver driver) throws IOException {
		JavaUtility ju=new JavaUtility();
		//TakesScreenShot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File
        		(FrameworkConstants.screenshortpath+"/dwsFailure" +ju.getTimeStame()+".png");
        FileHandler.copy(src, trg);
		
	}

}
