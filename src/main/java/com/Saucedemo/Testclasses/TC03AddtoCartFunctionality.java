package com.Saucedemo.Testclasses;




import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Saucedemo.POMclasses.HomePage;
@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC03AddtoCartFunctionality extends BaseClass
{ 
	@Test(priority=2)
	public  void AddtoCartFunctionality() throws InterruptedException

{ Thread.sleep(5000);
	HomePage hp = new HomePage(driver);
	 
	
	 hp.applyFilter();
	
	 hp.selectProduct();
	 hp.selectCart();
	
	 String Expectedurl="https://www.saucedemo.com/cart.html";
	 String Actualurl = driver.getCurrentUrl();
	 if(Expectedurl.equals(Actualurl))
	 {
		 System.out.println("4.product is succesfully add hence test case is pass");
	 }
	 else
	 {
		 System.out.println("4.product is fail to add hence test case is fail");
	 }

}
}
