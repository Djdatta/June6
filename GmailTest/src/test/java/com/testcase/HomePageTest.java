package com.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
	
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new  LoginPage();
		homePage=new HomePage();
		homePage=loginPage.loginTest(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void composeMailTest() {
		homePage.composemail(prop.getProperty("username"), prop.getProperty("subject"));
		
	}
	
	@Test(priority=2)
	public void markAsStartTest() {
		homePage.markAsStar();
		
	}
	@Test(priority=3)
	public void opeRecentlySentMailTest() {
		homePage.openRecentlySentMail();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
