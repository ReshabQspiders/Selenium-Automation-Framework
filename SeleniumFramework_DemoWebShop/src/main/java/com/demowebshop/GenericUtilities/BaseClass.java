package com.demowebshop.GenericUtilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility wdu;
	public String browser;
	public String url;
	public String email;
	public String password;

	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("----Executing Before Suite----",true);
	}
	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("----Executing After Suite----",true);
	}
	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("----Executing Before Test----",true);
		}
	@AfterTest
	public void configAfterTest() {
		Reporter.log("----Executing After Test----",true);	

	}
	@BeforeClass
	public void configBeforeClass() throws FileNotFoundException, IOException {
		Reporter.log("----Executing Before Class----",true);
		//Crating fileUtility
		FileUtility fu=new FileUtility();
		browser=fu.readKeyValueFromPropertyFile("browser");
	    url=fu.readKeyValueFromPropertyFile("applictionUrl");
	    email=fu.readKeyValueFromPropertyFile("vaildEmail");
	    password=fu.readKeyValueFromPropertyFile("vaildPassword");
	}
	@AfterClass
	public void configAfterClass() {
		Reporter.log("----Executing After Class----",true);
	}
	@Parameters("browser")
	@BeforeMethod                 //String browser//
	public void configBeforeMethod() {
		Reporter.log("----Executing Before Method----",true);	
		//Launching the browser 
		    if (browser.contains("Chrome")) {
				driver=new ChromeDriver();
			} else if (browser.contains("Edge")) {
				driver=new EdgeDriver();
			} else if (browser.contains("Firefox")) {
				driver=new FirefoxDriver();
			} else {
	             System.out.println("Enter vaild Browser");
			}

		//Maximize 
		    WebDriverUtility wdu=new WebDriverUtility(driver);
		    wdu.MaximizeBrowser();
		//Wait
		    WaitUtility wu=new WaitUtility(driver);
		    wu.waitForAllLocatedElements(10);
		//Navigate to Applcation
		   wdu.openApplication(url); 
		
	}
	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("----Executing After Method----",true);
		//Quit browser
		//wdu.termianteBrowser();
		driver.quit();
	}

}
