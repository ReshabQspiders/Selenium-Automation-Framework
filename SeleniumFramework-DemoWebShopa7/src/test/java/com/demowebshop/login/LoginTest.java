package com.demowebshop.login;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ListnersImplementation;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.WelcomePage;

@Listeners(ListnersImplementation.class)
public class LoginTest extends BaseClass {

	@Test(groups = {"Smoke","Regression"})
	public void loginAsValidUser() throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		LoginPage lp=new LoginPage(driver);
		//Click on Login link
		wp.clickOnLogin();
		//Login
		lp.loginAsValidUser(email, password);
		//Verify user is able to login
		Assert.assertEquals(wp.getRegisteredEmailText().getText() ,email );
	
	}	

}
