package com.Saucedemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
WebDriver driver;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")
	private WebElement removebutton;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueshopping;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	
	public CartPage (WebDriver driver)
	
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void continueShopping()
	{
		continueshopping.click();
	}
	
	public void removeProduct()
	{
		removebutton.click();
	}
	
	public void checkOut()
	{
		checkout.click();
	}


}
