package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class Practice3
{
	@Test(priority=-2)
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=-1)
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test(priority=0)
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test(priority=1)
	public void testD()
	{
		System.out.println("Test D");
	}

	@Test(priority=2)
	public void testE()
	{
		System.out.println("Test E");
	}
}
