package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.Utility.ScreenshotClass;



public class TC01LoginFunctionality extends TestBaseClass
{
	
     
   @Test
   public void loginFunctionalityTest() throws IOException
   {
       String expectedTitle = "Swag Labs";
       String actualTitle = driver.getTitle();
       
       log.info("Verify the test case");
        
      //hard assert
       Assert.assertEquals(actualTitle, expectedTitle);
       
       //logout
       ScreenshotClass.takeScreenshot(driver);
       
       HomePagePOMClass hp = new HomePagePOMClass(driver);
       hp.clickMenuButton();
       log.info("Clicked on menu button");
       
        hp.clickLogOutButton();
        log.info("Clicked on logout button");
       
   }   
   
   //comment-message
  

}
