package com.demowebshop.register;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ExcelUtility;
import com.demowebshop.generic_utilities.FileUtility;
import com.demowebshop.generic_utilities.FrameworkConstants;
import com.demowebshop.generic_utilities.JavaUtility;
import com.demowebshop.generic_utilities.ListnersImplementation;
import com.demowebshop.generic_utilities.ScreenshotUtility;
import com.demowebshop.generic_utilities.WaitUtility;
import com.demowebshop.generic_utilities.WebDriverUtility;
import com.demowebshop.object_repository.RegisterPage;
import com.demowebshop.object_repository.RegisterResultPage;
import com.demowebshop.object_repository.WelcomePage;
//@Listeners(ListnersImplementation.class)
public class RegisterTest extends BaseClass {
	@Test(groups = "Regression",dataProvider = "RegisterDetails", 
			dataProviderClass = ExcelUtility.class )
	public void registerAsNewUser(String firstName,
			String lastName,String gender,String emailA,
			String emailB,String password) throws FileNotFoundException, IOException {
		//Read the data from Excel file
//		ExcelUtility eu=new ExcelUtility();
//		String firstName=eu.readDataFromSpecificCell("RegisterUser", 1, 1);
//		String lastName=eu.readDataFromSpecificCell("RegisterUser", 1, 2);
//		String gender=eu.readDataFromSpecificCell("RegisterUser", 1, 3);
//		String emailA=eu.readDataFromSpecificCell("RegisterUser", 1, 4);
//		String emailB=eu.readDataFromSpecificCell("RegisterUser", 1, 5);
//		String password=eu.readDataFromSpecificCell("RegisterUser", 1, 6);
		WelcomePage wp=new WelcomePage(driver);
		RegisterPage rp=new RegisterPage(driver);
		JavaUtility ju=new JavaUtility();
		RegisterResultPage rrp=new RegisterResultPage(driver);
		//Click on Register link
		wp.clickOnRegister();
		 //Registration
		rp.registerAsNewUser(gender, firstName, lastName,emailA,
				ju.getRandomNumber(),emailB , password);
		//Verify if registeration is successfull
		Assert.assertTrue(rrp.getSuccessMessage().isDisplayed());
	}

}
