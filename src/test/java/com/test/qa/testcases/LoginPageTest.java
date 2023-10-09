package com.test.qa.testcases;

import com.test.qa.pages.LoginPage;
import com.test.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.qa.base.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void enterDetails(){
        loginPage.enterDetails();
	}

	@Test(priority=2)
	public void clickOnSubmit(){
		loginPage.clickOnSubmit();
	}

	@Test(priority=3)
	public void validateSubmission(){
		loginPage.enterDetails();
		loginPage.clickOnSubmit();
		loginPage.validateSubmission();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
