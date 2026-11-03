package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class UsingFindBys {
	static WebDriver driver;
	UsingFindBys(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	///Using @FindBys
	@FindBys({@FindBy(id = "ti6dpd"),@FindBy(name="q"),
		@FindBy(className = "gLFyf")})
	WebElement searchTextfield;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		UsingFindBys ufb=new UsingFindBys(driver);
		ufb.searchTextfield.sendKeys("Selenium");
	}
	
	
	

}
