package com.Saucedemo.Testclasses;





import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.Saucedemo.POMclasses.CheckoutInformation;

@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC05CheckoutInformationFill extends BaseClass
{ 
	@Test(priority=-2)
	public  void CheckoutInformationFill() throws InterruptedException 

{
	
	 CheckoutInformation ci = new CheckoutInformation(driver);
	
	 log.info("enter in tc 05");
	 log.info("element not found");
	 Reporter.log("element unable to found");
	 ci.insertFirstName();
	 ci.insertLastName();
	 ci.insertcode();
	 ci.proceed();
	 
	 
	 
		 String Expectedurl="https://www.saucedemo.com/checkout-step-two.html";
     String Actualurl = driver.getCurrentUrl();
     
 if(Expectedurl.equals(Actualurl))
 {
	 System.out.println("4.move to payment page hence testcase is pass");
 }
 else
 {
	 System.out.println(" 4.unable to move payment page hence test case is fail");
 }
     log.info("assertion applied");
	 
}
}