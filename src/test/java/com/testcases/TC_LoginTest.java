package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.LoginPage;

public class TC_LoginTest extends BaseClass {

	
	@Test(priority = 1, description = "Login Successfull!")
	public void loginTest() {

		driver.get(baseURL);
		
		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);

		lp.loginButton();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);
	}

}
