package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AsserVerifyCheck {
	WebDriver driver;
	
	 @BeforeMethod
		public void setUp()
		{
	    	 WebDriverManager.chromedriver().setup();
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
   	 Assert.assertEquals("Google", title);
    }
	
	
	@Test()
    public void googletitleTest2()
    {
   	 String title=driver.getTitle();
   	 System.out.println("Title:"+ title);
   	 
    }
	
	
	
	

}
