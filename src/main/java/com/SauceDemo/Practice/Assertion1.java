package com.SauceDemo.Practice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion1 
{
	@Test
	public void loginTest()
	{
		//title check
		String expectedTitle =" Labs";
		String actualTitle = "Swag Labs";
		
		//hard assert
//		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle,"title not matched");
		
		//url check
		String expectedUrl = "www.sauceDemo.com";
		String actualUtl   = "www.sauceDemo.com";
		
		Assert.assertEquals(actualUtl, expectedUrl);
	}

	
	@Test
	public void logOutTest()
    {
		Assert.assertTrue("forcefully failed", false);
//		Assert.assertFalse(false);
		
	}
	
	
}
