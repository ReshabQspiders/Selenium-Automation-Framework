package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstnameTextfield;
	@FindBy(id = "LastName")
	private WebElement lastnameTextfield;
	@FindBy(id = "Email")
	private WebElement emailTextfield;
	@FindBy(id = "Password")
	private WebElement passwordTextfield;	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextfield;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getConfirmPasswordTextfield() {
		return confirmPasswordTextfield;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void registerAsNewUser(String gender,String firstName,String lastName,
			String emailA,int randomNo,String emailB,String password) {
		if (gender.contains("Male")) {
			maleRadioButton.click();
		} else {
			femaleRadioButton.click();
		}
		firstnameTextfield.sendKeys(firstName);
		lastnameTextfield.sendKeys(lastName);
		emailTextfield.sendKeys(emailA+randomNo+emailB);
		passwordTextfield.sendKeys(password);
		confirmPasswordTextfield.sendKeys(password);
		registerButton.click();
	}
}
