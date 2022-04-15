package com.Saucedemo.Testclasses;




import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC02LogoutFunctionality extends BaseClass
{ 
	SoftAssert soft = new SoftAssert();
	@Test(priority=1,invocationCount = 2)
	public void LogoutFunctionality() throws InterruptedException

{
	
	 
	 String Expectedurl="https://www.saucedemo.com/inventory.html";
	 String Actualurl = driver.getCurrentUrl();
	soft.assertEquals(Actualurl, Expectedurl,"url found ");
	 
	 String Expectedtitle = "Swag Labs";
	 String Actualtitle = driver.getTitle();
	 soft.assertEquals(Actualtitle, Expectedtitle,"title not match");
	 
	 soft.assertAll();
	 
}
}

