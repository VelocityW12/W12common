package com.Saucedemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformation

{
    WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement code;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement proceed;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	
	public CheckoutInformation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertFirstName()
	{
		firstname.sendKeys("hitesh");
	}
	
	public void insertLastName()
	{
		lastname.sendKeys("nandan");
	}
	
	public void insertcode()
	{
		code.sendKeys("12453");
	}
	
	public void proceed()
	{
		proceed.click();
	}
	
	public void cancle()
	{
		cancel.click();
	}
	
	
	
}
