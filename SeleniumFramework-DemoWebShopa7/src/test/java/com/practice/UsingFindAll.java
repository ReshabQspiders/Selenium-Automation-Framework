package com.practice;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingFindAll {
	static String oHRMUser="Admin";
	static String slUser="standard_user";
	static String oHRMPwd="admin123";
	static String slPwd="secret_sauce";
	static String oHRMUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String slUrl="https://www.saucedemo.com/";

	static WebDriver driver;
	UsingFindAll(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//Username
	@FindAll({@FindBy(id="user-name"),@FindBy(name="username")})
	WebElement user;
	//Password
	@FindAll({@FindBy(id="password"),@FindBy(name="password")})
	WebElement password;
	//Test Script
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(slUrl);
		UsingFindAll ufa=new UsingFindAll(driver);
		ufa.user.sendKeys(slUser);
		ufa.password.sendKeys(slPwd,Keys.ENTER);
		driver.quit();

	}

}
