package com.demowebshop.GenericUtilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	//Navigate to application
	public void openApplication(String appURL) {
		driver.get(appURL);
	}
	//Fetch Title
	public String fetchTitle() {
		return driver.getTitle();
	}
	//Fetch Url
	public String fetchUrl() {
	return driver.getCurrentUrl();
	}
	//GetwindowHandle
	public String fetchWindowHandle() {
	return driver.getWindowHandle();
	}
	//GetwindowHandles
	public Set<String> fetchWindowHandles() {
	return driver.getWindowHandles();
	}
	//switch to Child Window
	public void switchControlToWindow(String title) {
		for (String handle :fetchWindowHandles()) {
			driver.switchTo().window(handle);
			if (fetchTitle().contains(title)) {
				break;
			}	
		}
	}
	//Open new Tab
	public void openNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	//Switch to Alert
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void typeAndAcceptTheAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	
	//Quit
	public void termianteBrowser() {
		driver.quit();
	}
	//Switch to Frame
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	//Maximize the Browser
	public void MaximizeBrowser()  {
		driver.manage().window().maximize();
	}
	
	
}

