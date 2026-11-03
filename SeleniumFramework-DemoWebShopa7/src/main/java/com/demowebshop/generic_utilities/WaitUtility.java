package com.demowebshop.generic_utilities;

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
	//Wait for Elements to load
	public void waitForAllLocatedElements(long secondsToWait) {
		driver.manage().timeouts().implicitlyWait
		(Duration.ofSeconds(secondsToWait));
	}
	//Wait for page to load
	public void waitForWebPageToLoad(long secondsToWait) {
		driver.manage().timeouts().pageLoadTimeout(Duration.
				ofSeconds(secondsToWait));
	}
	//Wait for Element to be clickable
	public void waitForElementToBeClickable(long secondsToWait,
			WebElement target) {
		WebDriverWait wait=new WebDriverWait(driver,
				Duration.ofSeconds(secondsToWait));
		wait.until(ExpectedConditions.elementToBeClickable(target));	
	}
	//Wait for element to visisble
	public void waitForElementToBeVisible(long secondsToWait,
			WebElement target) {
		WebDriverWait wait=new WebDriverWait(driver,
				Duration.ofSeconds(secondsToWait));
		wait.until(ExpectedConditions.visibilityOf(target));	
	}
	

}
