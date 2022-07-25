package com.hyr.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeTest {
	
	@Test(timeOut=2000)
	public void  test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		//driver.manage().window().maximize();
		driver.quit();
    }
	
	@Test(expectedExceptions= {NoSuchElementException.class})
	public void  test2() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.findElement(By.id("abcd")).click();
		//driver.manage().window().maximize();
		driver.quit();
    }

}