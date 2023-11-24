package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Hello, Mohd')]")
	WebElement helloUserName;
	
	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[6]")
	WebElement amazonpaylink;
	
	HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle()
	{
		return driver.getTitle();
	}
	
	
	public AmazonPayPage ClickOnAmazonPayLink()
	{
		amazonpaylink.click();
		return new AmazonPayPage();
	}
}
