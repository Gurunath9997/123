package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TestBaseClass 
{
WebDriver driver;
Logger log = Logger.getLogger("SauceDemoProject12FebBatchv1");


    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//remaining code will stay as it is
		log.info("browser open");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        //login 
        LoginPagePOMClass lp = new LoginPagePOMClass(driver);
        
        lp.sendUsername();       //username
        log.info("Enter the username");
        
        lp.sendPassword();       //password
        log.info("Enter the password");
        
        lp.clickLoginButton();   //login click
        log.info("CLick on login button");
   }
	
	 @AfterMethod
	   public void tearDown() throws IOException
	   {
	        //logout
	       driver.quit();
	       log.info("End of program");
		}

}
