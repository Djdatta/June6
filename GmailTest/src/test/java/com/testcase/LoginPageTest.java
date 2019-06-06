package com.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	public LoginPageTest() {
	
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new  LoginPage();
	}
	
	@Test
	public void loginPageTest() {

		Assert.assertTrue(true, "Gmail - Free Storage and Email from Google");
		loginPage.loginTest(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
