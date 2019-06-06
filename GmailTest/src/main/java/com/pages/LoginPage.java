package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class LoginPage extends TestBase {

	
	WebDriverWait wait;
	// OR

	@FindBy(xpath = "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	//@CacheLookup
	WebElement basepage;
	
	@FindBy(xpath = "//*[@id=\"identifierId\"]")
	//@CacheLookup
	WebElement email;

	@FindBy(xpath = "//*[@id=\"yDmH0d\"]")
	WebElement savedEmail;
	
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/content/span")
	WebElement nextBtn;

	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")

	WebElement password;

	@FindBy(xpath = "//*[@id=\"passwordNext\"]/content/span")
	WebElement nextPwdBtn;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public HomePage loginTest(String un, String pwd) {

		
		basepage.click();
		driver.navigate().refresh();
		if (email.isDisplayed()) {
			email.sendKeys(un);
		} else {
			savedEmail.click();
		}
		nextBtn.click();
		password.sendKeys(pwd);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*wait = new WebDriverWait(driver, 30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passwordNext\"]/content/span")));
		element.click();*/
		
		nextPwdBtn.click();
		
		return new HomePage();

	}

}
