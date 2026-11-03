package com.demowebshop.GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriver driver;
		public WaitUtility(WebDriver driver) {
		this.driver=driver;
	}
	//Wait for Element to load
	public void waitForAllLocatedElements(long secondsTowait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsTowait));	
	}
	//wait for page to load
	public void waitForWebPageToLoad(long secondsTowait) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(secondsTowait));
		
	}
	//wait for Element to be Click able
	public void waitForElementToBeClickable(long secondsTowait, WebElement target) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(secondsTowait));
		wait.until(ExpectedConditions.elementToBeClickable(target));
	}

	//wait for Element to visible
	public void waitForElementToBeVisible(long secondsTowait, WebElement target) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(secondsTowait));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
}
