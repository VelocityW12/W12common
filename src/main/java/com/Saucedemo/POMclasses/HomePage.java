package com.Saucedemo.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	

      WebDriver driver;
      Actions act;
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement options;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement jacketadd;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement shirtadd;
	
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	
	@FindBy(xpath="//body//div//div//button")
	
	private List <WebElement> allproduct;
	
	
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
   private WebElement cartno;
	
	
	
	
	
	public HomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	        act = new Actions(driver);

		
	}
	
	public void selectOptions()
	{
//	options.click(); //for ref bellow  by mouse action
		act.click(options).perform();
	}
	
	public void selectLogout()
	{
		logout.click();
	}
	
	public void selectCart()
	{
		cart.click();
	}
	
	public void selectProduct()
	{
		jacketadd.click();
	}
	
	public void selectProduct1()
	{
		shirtadd.click();
	}
	
	public void applyFilter()
	{   
		filter.click();
		Select s = new Select(filter);
		s.selectByIndex(1);
	}
	
	public void selectAllProduct() 
	{  
		
		for(int i=2;i<allproduct.size();i++)
		{
			allproduct.get(i).click();
		}
	}
	
//	imp
	public String getProductNos()
	
	{
		String no =cartno.getText();
		return no;
	}
	
	public int productCount()
	{
		int allproductsize= allproduct.size();
		
		return allproductsize;
		
	}
	


	
	
	
	

}
