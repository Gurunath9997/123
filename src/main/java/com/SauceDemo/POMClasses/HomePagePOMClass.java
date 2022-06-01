package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
	//menuButton
	//logOutButton
	
	//1.WebDriver driver;  global
	//2.element find --> @FindBy
	//3.Method --> element action
	//4.Constructor --> this and pageFactory
		
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	
	public void clickLogOutButton()
	{
		logOutButton.click();
	}
	
	//constructor
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		s  = new Select(filterButton);
	}
	
	//single product element
	
     //addToCart ele
	//method action
	
	
	//single bag product element

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton;
	
	public void clickBagButton()
	{
		bagButton.click();
	}
	
	//add to cart button
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement addToCartButton;
	
	public String getTextFromCartButton()
	{
		String totalProducts = addToCartButton.getText();
		return totalProducts;
		
	}
	
	
	
	//multiple product selection
	//button[text()='Add to cart']        //1 of 6
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multipleAddToCart ;
	
	public void addAllProduct()
	{
		for(int i=0; i<multipleAddToCart.size(); i++)
		{
			multipleAddToCart.get(i).click();
		}
	}
	
	
	//dropdown button
	
	private Select s;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterButton ;
	
	
	public void clickOnFilterButton()
	{
		filterButton.click();
		s.selectByVisibleText("Name (A to Z)");
	}
	

}
