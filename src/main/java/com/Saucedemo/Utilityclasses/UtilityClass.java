package com.Saucedemo.Utilityclasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;


public class UtilityClass implements ITestListener
{   WebDriver driver;

   public UtilityClass(WebDriver driver)
   {
	   
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
   }

  public  void takeScreenShot(String filename) throws IOException
  {
	  Date date = new Date();
	  
	  DateFormat d = new  SimpleDateFormat("dd.MM.YYYY & hh.mm.ss");
	  
	  String NewDate = d.format(date);
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("C:\\Users\\user\\eclipse-workspace\\SauceDemoV1\\screenshot\\" +filename+"."+NewDate+".jpg");
		FileHandler.copy(source, dest);	  
  }
  
 
  
}
