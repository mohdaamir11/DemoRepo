package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
	    String title = loginPage.validateLoginPageTitle();
	    Assert.assertEquals(title, "Amazon.in");
	    
	}
	
	
	@Test (priority=2)
	public void amazonLogoImageTest()
	{
	    Boolean flag = loginPage.validateAmazonLogo();
	    Assert.assertTrue(flag);
	}
	
	
//	@DataProvider
//	public void getTestData()
//	{
//		
//	}
	
//	@Test
//	public void mouseMovementtoCreateauser()
//	{
//		loginPage.moveMousetoCreateAccount();
//	}
	
	@Test(priority=3)
	public void loginTest()
	{
		homepPage = loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
