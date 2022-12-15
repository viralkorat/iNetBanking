package com.testcases;

import org.testng.annotations.Test;

import com.pageobject.AddCustomerPage;
import com.pageobject.LoginPage;

public class TC_AddCustomerTest extends BaseClass {

	@Test
	public void addNewCustomer() {
		
		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.loginButton();
		
		AddCustomerPage addcustinfo= new AddCustomerPage(driver);
		
		addcustinfo.clickAddNewCustomer();
		
		addcustinfo.customerName("VK");
		addcustinfo.customerGender("male");
		addcustinfo.customerDOB("01", "06", "1998");
		addcustinfo.customerAddress("INDIA");
		addcustinfo.customerCity("Surat");
		addcustinfo.customerState("Gujarat");
		addcustinfo.customerPIN("523442");
		addcustinfo.customerMobNum("8475839393");
		addcustinfo.customerSetPassword("Test123");
		
		
	}
	
}
