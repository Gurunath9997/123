package com.SauceDemo.Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion2 
{
	@Test
	public void loginTest()
	{
		//title check
		String expectedTitle =" Labs";
		String actualTitle = "Swag Labs";
		
		//hard assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
	
		
		//url check
		String expectedUrl = "www.sauceDemo.com";
		String actualUtl   = "www.sauceDemo.com";
		
		soft.assertEquals(actualUtl, expectedUrl);
		
		//accurate result apply this method
		//compulsory method
		soft.assertAll();
	}

	
	
	

}
