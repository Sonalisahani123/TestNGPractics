package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(com.test.Listener.class)
public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(priority = 1, groups = "Title")
	public void googletitleTest() {
		String title = driver.getTitle();
		System.out.println("Title:" + title);

	}

	@Test(priority = 2, groups = "logo")
	public void googlelogoTest() {
		boolean isdisplya = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();

	}

	@Test(priority = 3, groups = "link")
	public void gmailLinkTest() {
		boolean gmaillink = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();

	}

	@Test
	public void TestToFail() {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
