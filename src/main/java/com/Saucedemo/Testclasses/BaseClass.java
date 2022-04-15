package com.Saucedemo.Testclasses;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucedemo.POMclasses.HomePage;
import com.Saucedemo.POMclasses.Loginpage;


public class BaseClass
{    public WebDriver driver;
     Logger log;
    @Parameters("Browsername")
   @BeforeClass
	public void openBrowser(String Browsername)
	{
    	if(Browsername.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "D:\\DOWNLOADS\\SELENIUM FILES DOWNLOAD\\chromedriver_win32\\chromedriver.exe");
    		
    	    driver = new ChromeDriver();
    	}
    	else if(Browsername.equals("firefox"))
    	{
		System.setProperty("webdriver.gecko.driver", "D:\\DOWNLOADS\\SELENIUM FILES DOWNLOAD\\chromedriver_win32\\geckodriver.exe");
		
	    driver = new FirefoxDriver();
    	}
    	log=Logger.getLogger("SauceDemoV1");
    	PropertyConfigurator.configure("log4j.properties");
    	
		driver.manage().window().maximize();
		System.out.println("1.Browser open");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		System.out.println("2.url hit");
		log.info("Browser open and url hit");
	}

   @BeforeMethod
	public void logIn()
	{
		 Loginpage lp =new Loginpage(driver);
		 
		 lp.sendUserName();
		 lp.sendPassword();
		 lp.clickLogin();
		 System.out.println("3.successfully login");
	}
   
   @AfterMethod
   public void logOut()
   {
	   HomePage hp = new HomePage(driver);
		hp.selectOptions();
		 
		 hp.selectLogout();
		 System.out.println("5.successfully logout");
   }
   
   @AfterClass
   public void closeBrowser()
   {
	   driver.quit();
	   System.out.println("6.Browser closed");
   }
   
}
