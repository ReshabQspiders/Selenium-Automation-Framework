package com.Practiece;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UsingFindBy {
	static WebDriver driver;
	UsingFindBy(WebDriver driver){
		PageFactory.initElements(driver, this);

	}
	@FindBy(id = "ti6dpd")
	WebElement searchTextField;
	
	//Test Script
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		UsingFindBy ufb=new UsingFindBy(driver);
		ufb.searchTextField.sendKeys("selenium");
		
	}

}
