package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AmazonPayPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
     LoginPage loginPage;
     HomePage homePage;
     AmazonPayPage amznpay;
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@Test (priority=1)
	public void verifyHomepageTitleTest()
	{
		String homepagetitle = homePage.homePageTitle();
		System.out.println(homepagetitle);
		Assert.assertEquals(homepagetitle, "Amazon.in", "home page title is not matched");
	}
	
	@Test (priority=2)
	public void verifyAmazonPaylinkTest()
	{
		amznpay= homePage.ClickOnAmazonPayLink();
//          Assert.assertEquals(amznpay, amznpay);
	
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
