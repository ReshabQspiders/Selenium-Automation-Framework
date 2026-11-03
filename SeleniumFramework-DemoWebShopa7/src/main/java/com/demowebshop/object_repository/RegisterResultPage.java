package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterResultPage {
	WebDriver driver;
	public RegisterResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "[class='result']")
	private WebElement successMessage;
	
	public WebElement getSuccessMessage() {
		return this.successMessage;
	}

}
