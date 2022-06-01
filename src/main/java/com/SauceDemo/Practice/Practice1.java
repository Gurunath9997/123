package com.SauceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 
{
	@BeforeMethod
	public void setUpMethod()         //pre-conditions
	{
		System.out.println("Browser, URL, Login");
	}

	 @Test              //main test case
	 public void verifyLoginFunctionality()
	 {
	   System.out.println("Login functionality is verified");
	 }
    
	 @Test
	 public void singleProductAddToCart()
	 {
		 System.out.println("SIngle product add to cart is verified");
	 }
	  
    
    @AfterMethod           //post conditions
    public void tearDown()
    {
    	System.out.println("browser close");
    }
    
    
    
    
   
    
}
