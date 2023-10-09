package com.test.qa.testcases;

import com.test.qa.base.TestBase;
import com.test.qa.pages.LoginPage;
import com.test.qa.pages.secondFormTestPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondFormSubmitTest extends TestBase {
    secondFormTestPage secondFormTestPage;

    public SecondFormSubmitTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        secondFormTestPage = new secondFormTestPage();
    }

    @Test(priority=1)
    public void enterDetails(){
        secondFormTestPage.enterDetails();
    }

    @Test(priority=2)
    public void clickOnSubmit(){
        secondFormTestPage.clickOnSubmit();
    }

    @Test(priority=3)
    public void validateSubmission(){
        secondFormTestPage.enterDetails();
        secondFormTestPage.clickOnSubmit();
        secondFormTestPage.validateSubmission();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
