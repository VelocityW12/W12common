package com.Saucedemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage 
{
	
	    WebDriver driver;
		
		@FindBy(xpath="//button[@id='finish']")
		private WebElement finish;
		
		@FindBy(xpath="//button[@id='cancel']")
		private WebElement cancel1;
		
		public FinalPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void finish()
		{
			finish.click();
		}
		
		public void cancel1()
		{
			cancel1.click();
		}

}
