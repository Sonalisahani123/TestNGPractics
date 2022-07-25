package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTitleTest {
	WebDriver driver;
	
	 @BeforeMethod
		public void setUp()
		{
	    	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	    	 driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	 		driver.get("https://www.google.com/");
	    	 
		}
	     @Test()
	     public void googletitleTest()
	     {
	    	 String title=driver.getTitle();
	    	 System.out.println("Title:"+ title);
	    	 Assert.assertEquals("Google", title,"title is not matched");
	     }
	    	 
	    	 @Test()
	         public void googlelogoTest()
	         {
	        	 boolean isdisplya=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	        	 Assert.assertTrue(isdisplya);
	        	 Assert.assertEquals(true, isdisplya);
	        	 
	         
	    	 
	     }
	     @AfterMethod
	     public void tearDown()
	     {
	     	driver.quit();
	     }

}
