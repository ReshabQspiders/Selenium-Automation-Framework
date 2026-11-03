package com.demowebshop.login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.GenericUtilities.*;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.WelComePage;



@Listeners(ListnersImplementation.class)
public class Login_Test extends BaseClass {

	@Test(groups = {"Smoke","Regression"})
	public void loginAsVaildUser() throws IOException {
		//Welcome page 
		WelComePage wp=new WelComePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		//Click on Login Link
		wp.clickOnLogin();
		//Click on Email,Password(Login)
		lp.loginAsValidUser(email, password);
		
		//Verify user is able to Login 
	   Assert.assertEquals(wp.getRegisteredEmailText().getText(),email);
	//wp.getRegisteredEmailText().getText().contains(email)
   }
}
  