package com.demowebshop.register;


import java.io.FileNotFoundException;
import java.io.IOException;



import org.testng.Assert;

import org.testng.annotations.Test;

import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ExcelUtility;
import com.demowebshop.generic_utilities.JavaUtility;

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
