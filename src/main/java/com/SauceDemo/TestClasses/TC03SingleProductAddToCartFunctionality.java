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



public class TC03SingleProductAddToCartFunctionality extends TestBaseClass
{

    
     @Test
     public void singleProductAddToCart()
       {
        HomePagePOMClass hp = new HomePagePOMClass(driver);
        
        //single product
        hp.clickBagButton();
        System.out.println("product is added to cart");
		
        System.out.println("Apply the validation");
        
        String actualResult = hp.getTextFromCartButton();
        
        String expectedResult ="1";
        
        Assert.assertEquals(actualResult, expectedResult);
        
      
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
        
         hp.clickLogOutButton();
         System.out.println("Clicked on logout button");
       }
    
    
        
        
	
}
