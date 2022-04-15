package com.Saucedemo.Testclasses;





import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Saucedemo.POMclasses.CartPage;
import com.Saucedemo.POMclasses.HomePage;



@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC04CartFunctionality extends BaseClass
{ 
	@Test(priority=3,timeOut=2000)
	public void CartFunctionality() throws InterruptedException 

{
	

	 HomePage hp = new HomePage(driver);
	 CartPage cp = new CartPage(driver);
	 
	 
	 hp.selectProduct();
	 hp.selectCart();
	 cp.continueShopping();
	 hp.selectProduct1();
	 hp.selectCart();
	 cp.removeProduct();
	 cp.checkOut();
//	 Thread.sleep(4000); if active testcase can fail 
		 String Expectedurl="https://www.saucedemo.com/checkout-step-one.html";
	     String Actualurl = driver.getCurrentUrl();
	     
	     Assert.assertEquals(Expectedurl, Actualurl);
	     
	
	 
}
}