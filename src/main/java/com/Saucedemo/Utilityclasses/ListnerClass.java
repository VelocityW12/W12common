package com.Saucedemo.Utilityclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Saucedemo.Testclasses.BaseClass;

public class ListnerClass implements ITestListener
 {	 private WebDriver driver;

	 public void onTestStart(ITestResult result)
		{
			System.out.println("execution start");
		}
		
		public void onTestSuccess(ITestResult result)
		{
			System.out.println("test execuetd successfully");
			this.driver = ((BaseClass)result.getInstance()).driver;
			 UtilityClass uc = new UtilityClass(driver);
			
					try {
						uc.takeScreenShot("pass");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
		}
		
		public void onTestFailure(ITestResult result)
		{
			System.out.println("test failed and screenshot taken");
			
			this.driver = ((BaseClass)result.getInstance()).driver;
			 UtilityClass uc = new UtilityClass(driver);
			
				try {
					uc.takeScreenShot("fail");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
			 
		}


		
		


