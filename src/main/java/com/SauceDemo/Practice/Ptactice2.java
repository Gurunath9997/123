package com.SauceDemo.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ptactice2 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case-1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case-2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Aftet Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	
	
	

}
