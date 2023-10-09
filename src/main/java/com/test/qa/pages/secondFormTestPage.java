package com.test.qa.pages;

import com.test.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondFormTestPage extends TestBase {

    @FindBy(xpath="//input[@id='colour-picker']")
    WebElement colorPicker;

    @FindBy(xpath="//input[@id='email-field']")
    WebElement email;

    @FindBy(xpath="//textarea")
    WebElement txtAreaComments;

    @FindBy(xpath="//input[@value='submit']")
    WebElement submitBtn;

    @FindBy(xpath="//p[contains(text(), 'You submitted a form.')]")
    WebElement afterSubmission;

    public secondFormTestPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterDetails(){
        String emaildata = prop.getProperty("email");
        colorPicker.click();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementByid('colour-picker').value='#7d6487'");
        email.clear();
        email.sendKeys(emaildata);

    }

    public void clickOnSubmit(){
        submitBtn.click();
    }

    public boolean validateSubmission(){
        return afterSubmission.isDisplayed();
    }

}
