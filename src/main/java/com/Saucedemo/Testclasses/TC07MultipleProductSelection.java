package com.Saucedemo.Testclasses;




import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Saucedemo.POMclasses.HomePage;

@Listeners(com.Saucedemo.Utilityclasses.ListnerClass.class)
public class TC07MultipleProductSelection extends BaseClass
{	
	@Test(priority=4)
	public void MultipleProductSelected() throws InterruptedException {
	

 HomePage hp = new HomePage(driver);

 hp.selectAllProduct();

 
// scenario 1
 
String actualno =hp.getProductNos();
String Expectedno ="6";

if(actualno.equals(Expectedno))
    {
	System.out.println("4.test case is pass");
    }
else
	{
		System.out.println("4.test case is fail");
	}

 }


}

