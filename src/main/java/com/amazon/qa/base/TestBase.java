package com.amazon.qa.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.tracing.Propagator;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet;

import com.amazon.qa.util.TestUtil;
import com.amazon.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	
	public TestBase() {
		// TODO Auto-generated constructor stub
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\MyTest\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
			prop.load(ip);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver","C:\\Users\\91995\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\91995\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
	    
//		EventFiringDecorator<WebDriver> e_driver= new EventFiringDecorator();
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.decorate((WebDriver) eventListener);
//		driver = (WebDriver) e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.get(prop.getProperty("completeUrl"));
	} 
}
