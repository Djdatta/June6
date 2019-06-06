package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {


	@FindBy(xpath = "//div[contains(text(), 'Compose')]")

	WebElement composeMail;

	@FindBy(xpath = "//*[@class='wA']//following::textarea[@name='to']")

	WebElement toRecipients;

	@FindBy(xpath = "//*[@name='subjectbox']")
	WebElement subject;

	@FindBy(xpath = "//*[@class=\"Am Al editable LW-avf\"]")

	WebElement body;

	@FindBy(xpath = "//*[@class='J-JN-M-I J-J5-Ji Xv L3 T-I-ax7 T-I']//div[@class='J-J5-Ji J-JN-M-I-JG']")
	WebElement option;

	@FindBy(xpath = "//div[@class='J-N-Jz']//span[@class='J-Ph-hFsbo']")
	WebElement label;

	// *[@id=\":u8\"]/div/div
	@FindBy(xpath = "//div[@title='Social']/div/div")
	WebElement socialLabel;

	@FindBy(xpath = "//div[@class='J-JK']//div[@class='J-JK-Jz'and text()='Apply']")
	WebElement socialApply;

	@FindBy(xpath = "//div[@class='J-J5-Ji']//following::div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
	WebElement sendEmail;

	@FindBy(xpath = "//*[@id=\":2h\"]")
	WebElement socialRecievedTab;

	@FindBy(xpath = "//*[contains(text(),'Hello...body')]//parent::div[@class='xT']//parent::div//parent::td//preceding-sibling::td[@class='apU xY']")
	WebElement starMark;

	// tr[@class='zA zE']//td/descendant::div[@id=':me']
	@FindBy(xpath = "//*[contains(text(),'Hello Crossover Team')]")
	WebElement newMail;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}
	
	public void composemail(String toEmail, String subj) {
		composeMail.click();
		System.out.println(toRecipients.isDisplayed());
		toRecipients.sendKeys(toEmail);
		subject.sendKeys(subj);
		body.sendKeys("Hello Crossover Team");
		option.click();
		Actions action = new Actions(driver);
		action.moveToElement(label).build().perform();
		socialLabel.click();
		socialApply.click();
		try {Thread.sleep(10000);} catch (Exception e) {e.printStackTrace();}
		System.out.println(sendEmail.isDisplayed());
		sendEmail.click();
		try {Thread.sleep(10000);} catch (Exception e) {e.printStackTrace();}
	}
	
	public void markAsStar() {
		
		socialRecievedTab.click();
		try {Thread.sleep(10000);} catch (Exception e) {e.printStackTrace();}
		starMark.click();
	}
	
	public void openRecentlySentMail() {
		
		socialRecievedTab.click();
		try {Thread.sleep(10000);} catch (Exception e) {e.printStackTrace();}
		newMail.click();
		try {Thread.sleep(10000);} catch (Exception e) {e.printStackTrace();}
	}
	
	
}
