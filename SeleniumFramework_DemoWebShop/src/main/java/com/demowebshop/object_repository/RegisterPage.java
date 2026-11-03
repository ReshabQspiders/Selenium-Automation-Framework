package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	@FindBy(id = "Email")
	private WebElement emailTextField;
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmpasswordTextField;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	//Getters
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFristNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;	
	}
	public WebElement getConfirmPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getRegisterButton() {
	return registerButton;
	}
	
	//Business Logic
	public void registerAsNewUser(String gender, String firstName,
			String lastName, String emailA, int randomNo,String emailB, String password) {
		if (gender.contains("male")) {
			maleRadioButton.click();
		} else {
			femaleRadioButton.click();
		}
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		emailTextField.sendKeys(emailA+randomNo+emailB);
		passwordTextField.sendKeys(password);
		ConfirmpasswordTextField.sendKeys(password);
		registerButton.click();
		
	}
}
