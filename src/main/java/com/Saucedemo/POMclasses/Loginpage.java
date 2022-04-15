package com.Saucedemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
//	declare veriable globally
	WebDriver driver;
	
// find web element
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbutton;
	
//	create constructor to initialize veriable
	public Loginpage(WebDriver driver)
	{
//		
		this. driver = driver;   // give dot after this.
		 PageFactory.initElements(driver, this);
	}
// create non static methods for performing action on webelement	
	public void sendUserName()
	{
		username.sendKeys("standard_user");
	}
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogin()
	{
		loginbutton.click();
	}
	

}
