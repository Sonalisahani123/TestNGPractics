package com.test;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTestApp {
	WebDriver driver;
	
	@BeforeMethod
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="login combo")
	public void givedata(String un,String pw)
	{
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
	}
	
	@DataProvider(name="login combo")
	public Object[][]dataSet()
	{
		return new Object[][]
				{
			{"standard_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			
				};
	}
	
	@AfterMethod		
	
	public  void takeSS() throws IOException
	{
		 
		  TakesScreenshot  ss=((TakesScreenshot)driver);
		File sourceFile=  ss.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sourceFile, new File(".//ScreenShot//"),true);
		
		
	}
	
		@AfterSuite			
					
		public void closeBrowser()
		{
			driver.close();
			driver.quit();
		}
			
				
	
}

