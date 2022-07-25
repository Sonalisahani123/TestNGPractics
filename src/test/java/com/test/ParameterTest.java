package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	   WebDriver driver;
	
	     
	    //@Parameters({"URL","browser","emailId"})
	    @Parameters({"browser"})
	    @Test
	    public void yahoologinTest(String browser)
	    {  
	    	if(browser.equals("chrome"))
	    	{
	    		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		    	  WebDriverManager.chromedriver().setup();
		    	  driver=new ChromeDriver();
	    	}else if(browser.equals("firefox"))
	    	{
	    		System.setProperty("webdriver.geckodriver.driver", "E:\\chromedriver_win32\\geckodriver.exe");
		    	 // driver=new  GeckoDriverService();	
	    	}
	    	
	    
	    	  /*driver.get(URL);
	 		  //driver.manage().window().maximize();
	 		  driver.findElement(By.id("login-username")).sendKeys("emailId");
	 		  driver.findElement(By.id("login-signin")).click();
	 		  */
	 		  
	    	
	    	driver.get("https://www.saucedemo.com/");
	    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();

	    }
	
	
	

}
