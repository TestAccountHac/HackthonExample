package com.test.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//textarea")
	WebElement txtAreaComments;
	
	@FindBy(xpath="//input[@value='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//p[contains(text(), 'You submitted a form.')]")
	WebElement afterSubmission;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public void enterDetails(){
		String userNameData = prop.getProperty("username");
		String passwordData = prop.getProperty("password");
		String commentsData = prop.getProperty("comments");
		username.sendKeys(userNameData);
		password.sendKeys(passwordData);
		txtAreaComments.clear();
		txtAreaComments.sendKeys(commentsData);
	}

	public void clickOnSubmit(){
		submitBtn.click();
	}

	public boolean validateSubmission(){
		return afterSubmission.isDisplayed();
	}
	
}
