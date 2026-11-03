package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Loactors
	@FindBy(id = "Email")
	private WebElement emailTextfield;
	@FindBy(id = "Password")
	private WebElement passwordTextfield;
	@FindBy(css = "[value='Log in']")
	private WebElement logInButton;
	//Getters
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getLogInButton() {
		return logInButton;
	}
	//Bussiness logic
	public void loginAsValidUser(String validEmail,String validPassword) {
		emailTextfield.sendKeys(validEmail);
		passwordTextfield.sendKeys(validPassword);
		logInButton.click();
	}
	

}
