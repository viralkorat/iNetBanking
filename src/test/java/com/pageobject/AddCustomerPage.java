package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement link_add_new_customer;
	
	@FindBy(name="name")
	WebElement customer_name;
	
	@FindBy(name="rad1")
	WebElement customer_gender;
	
	@FindBy(name="dob")
	WebElement customer_dob;
	
	@FindBy(name="addr")
	WebElement customer_address;
	
	@FindBy(name="city")
	WebElement customer_city;
	
	@FindBy(name="state")
	WebElement customer_state;
	
	@FindBy(name="pinno")
	WebElement customer_pincode;
	
	@FindBy(name="telephoneno")
	WebElement customer_mobphoneno;
	
	@FindBy(name="emailid")
	WebElement customer_emailId;
	
	@FindBy(name="password")
	WebElement customer_password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit_button;
	
	//Below is all the method of new customer page
	
	public void clickAddNewCustomer() {
		link_add_new_customer.click();
	}
	
	public void customerName(String cname) {
		customer_name.sendKeys(cname);
	}
	
	public void customerGender(String cgender) {
		customer_gender.click();
	}
	
	//DOB is in mm/dd/yyyy format
	public void customerDOB(String yy,String mm, String dd) {
		customer_dob.sendKeys(yy);
		customer_dob.sendKeys(mm);
		customer_dob.sendKeys(dd);
	}
	
	public void customerAddress(String cadd) {
		customer_address.sendKeys(cadd);
	}
	
	public void customerCity(String ccity) {
		customer_city.sendKeys(ccity);
	}
	
	public void customerState(String cstate) {
		customer_state.sendKeys(cstate);
	}
	
	public void customerPIN(String cpin) {
		customer_pincode.sendKeys(cpin);
	}
	
	public void customerMobNum(String cmobnum) {
		customer_mobphoneno.sendKeys(cmobnum);
	}
	
	public void customerEmailId(String cemailid) {
		customer_emailId.sendKeys(cemailid);
	}
	
	public void customerSetPassword(String cpassword) {
		customer_password.sendKeys(cpassword);
	}
	
	public void submitButton() {
		submit_button.click();
	}
}
