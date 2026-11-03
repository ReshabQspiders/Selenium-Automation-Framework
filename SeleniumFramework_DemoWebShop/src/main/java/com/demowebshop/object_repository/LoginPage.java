package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locators
    @FindBy(id = "Email")
    private WebElement emailTextField;
    @FindBy(id = "Password")
    private WebElement passwordTextField;
    @FindBy(css = "[value='Log in']")
    private WebElement logInButton;
    
    //Getters
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLogInButton() {
		return logInButton;
	}
    
	//Business Logic
	public void loginAsValidUser(String validUserName, String validPassword) {
		emailTextField.sendKeys(validUserName);
		passwordTextField.sendKeys(validPassword);
		logInButton.click();
	}   
}
