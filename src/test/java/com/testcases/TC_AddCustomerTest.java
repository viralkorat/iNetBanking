package com.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.AddCustomerPage;
import com.pageobject.LoginPage;

public class TC_AddCustomerTest extends BaseClass {

	@Test
	public void addNewCustomer() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.loginButton();
		
		AddCustomerPage addcustinfo = new AddCustomerPage(driver);

		addcustinfo.clickAddNewCustomer();

		logger.info("Customer details provided");

		addcustinfo.customerName("VK");
		addcustinfo.customerGender("male");
		addcustinfo.customerDOB("001998","01", "06");
		addcustinfo.customerAddress("INDIA");
		addcustinfo.customerCity("Surat");
		addcustinfo.customerState("Gujarat");
		addcustinfo.customerPIN("523442");
		addcustinfo.customerMobNum("8475839393");

		//Random email method called
		String email = randomstring() + "@gmail.com";
		addcustinfo.customerEmailId(email);

		addcustinfo.customerSetPassword("Test123");
		addcustinfo.submitButton();
		
		Thread.sleep(3000);

		logger.info("validation started.........");

		boolean response = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (response == true) {
			Assert.assertTrue(true);
			logger.info("test case passed.........");
		} else {
			logger.info("test case failed.........");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}

	//Random email will be generated
	public String randomstring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
}
