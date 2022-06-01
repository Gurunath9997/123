package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	//webelement find
	//actions on webelement
	
	//1. WebDriver declared
	
	private WebDriver driver;
	private Actions act;
	
	
	//we will not use this
//	WebElement userName = driver.findElement(By.xpath("----"));
//	userName.sendKeys("standard_user");
	
	//annonations --> @ --> method only-functionality
	
	//selenium import
	
	//2.find the elements by @FindBY
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	
	//actions on element -method
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
     public void sendPassword()
     {
    	 password.sendKeys("secret_sauce");
     }
	
	
	
     @FindBy(xpath="//input[@id='login-button']")
 	 private WebElement loginButton;
	
	
	public void clickLoginButton()
	{
//		loginButton.click();
		act.click(loginButton).perform();
		
	}
	
	//constructor declare
	
	public LoginPagePOMClass(WebDriver driver)
	{
		  //global  = local
		this.driver = driver;
		
		//selenium class
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
		
	}
	
	//1.WebDriver driver;  global
	//2.element find --> @FindBy
	//3.Method --> element action
	//4.Constructor --> this and pageFactory

}
