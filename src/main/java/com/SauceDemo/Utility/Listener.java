package com.SauceDemo.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.SauceDemo.Practice.SampleClass1;

public class Listener implements ITestListener
{
	WebDriver driver;
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is sucessfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		   System.out.println("Test case is failed and hence taking the screenshot");

            this.driver = ((SampleClass1)result.getInstance()).driver;
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File sourceFile =	ts.getScreenshotAs(OutputType.FILE);	
		   File destFile = new File("./screenshot/SauceDemoLogin3105.jpg");	
		   try 
		   {
			FileHandler.copy(sourceFile, destFile);
		    } 
		   catch (IOException e) 
		   {
			e.printStackTrace();
		   }
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Sanity test is started");
	}
}
