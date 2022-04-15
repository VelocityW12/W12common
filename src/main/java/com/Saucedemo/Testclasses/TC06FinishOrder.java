package com.Saucedemo.Testclasses;





import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Saucedemo.POMclasses.FinalPage;

@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC06FinishOrder extends BaseClass
{
	 @Test(priority=-1,enabled=true)
	public void finishOrderPlaced() throws InterruptedException
	 {

	 FinalPage fp =new FinalPage(driver);

	 fp.finish();
	 
	 String Expectedurl="https://www.saucedemo.com/checkout-complete.html";
     String Actualurl = driver.getCurrentUrl();
     
      Assert.assertEquals(Expectedurl, Actualurl);
	 
}
}
