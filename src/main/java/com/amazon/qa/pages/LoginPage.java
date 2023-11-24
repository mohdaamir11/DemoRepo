package com.amazon.qa.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{
   //page factory - OR:object repository
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	@CacheLookup
	WebElement navigateToLoginPage;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signInButton;
	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	WebElement createYourAmazonAccountButton;
	
	@FindBy(xpath = "//body/div[@id='a-page']/div[1]/div[1]/div[1]/a[1]/i[1]")
	WebElement amazonLogo;
	
	//Initializing the Page objects
	public LoginPage()
	{   
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions:
	public String validateLoginPageTitle()
	{   
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo() {
		
		return amazonLogo.isDisplayed();
	}
	
	public HomePage login(String email1, String pwd1) {
		
		Email.sendKeys(email1);
		continueButton.click();
	    Password.sendKeys(pwd1);
	    signInButton.click();
	    
	    return new HomePage();
	}
	
	public void moveMousetoCreateAccount() {
		Actions action=new Actions(driver);
		action.moveToElement(createYourAmazonAccountButton).build().perform();
		
	}
	
}
