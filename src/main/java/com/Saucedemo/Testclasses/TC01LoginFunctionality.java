package com.Saucedemo.Testclasses;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC01LoginFunctionality extends BaseClass 

{ 
	@Test(priority=0)
	public  void LoginFunctionality() 
{
	
	 String Expectedurl = "https://www.saucedemo.com/inventory.html";
	 String Actualurl =driver.getCurrentUrl();
	
	 Assert.assertEquals(Expectedurl, Actualurl);
	 log.info("TC01 pass");

}

}
