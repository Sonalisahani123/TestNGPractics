package com.hyr.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DataProviderScenarioTest {
	
	@Test(dataProvider = "loginData")
	public void login_test(String username,String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(5000);
		driver.close();	
	}
	
	@DataProvider(parallel=true)
	public Object[][] loginData()
	{
		Object[][] data = new Object[6][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="test123";
		
		data[2][0]="test";
		data[2][1]="admin123";
		
		data[3][0]="prod";
		data[3][1]="test123";
		
		data[4][0]="stage";
		data[0][1]="admin123";
		
		data[4][0]="L6";
		data[4][1]="test123";
		
		data[5][0]="Admin";
		data[5][1]="admin123";
		
		data[6][0]="Admin";
		data[6][1]="test123";
		return data;
		
	}

}
