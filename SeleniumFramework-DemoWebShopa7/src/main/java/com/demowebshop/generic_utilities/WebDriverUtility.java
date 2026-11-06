package com.demowebshop.generic_utilities;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	//navigate to application
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
	//GetWindowHandle
	public String fetchWindowId() {
		return driver.getWindowHandle();
	}
	//GetWindowHandles
	public Set<String> fetchAllWindowIds() {
		return driver.getWindowHandles();
	}
	//Switch to Child window
	public void switchControlToAWindow(String title) {
		for (String handle : fetchAllWindowIds()) {
			driver.switchTo().window(handle);
			if (fetchTitle().contains(title)) {
				break;
			}
		}
	}
	//Open a new tab
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
	//Switch to frame
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	

}
