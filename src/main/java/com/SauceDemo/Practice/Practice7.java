package com.SauceDemo.Practice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Practice7 
{
	@Test(priority=2)                 //1
	public void loginTest()
	{
		System.out.println("Login test");
		Assert.assertTrue(false);        //used for failing purpose
	}
	
	@Test(dependsOnMethods= {"loginTest"}, priority=1)       //2
	public void sigleProductTest()
	{
		System.out.println("Single product test");
	}
}
