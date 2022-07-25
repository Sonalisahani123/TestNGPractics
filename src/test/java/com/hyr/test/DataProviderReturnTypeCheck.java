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

public class DataProviderReturnTypeCheck {
	
	@Test(dataProvider = "dataprovider1",enabled=false)
	public void login_test(String s) throws InterruptedException
	{
		System.out.println(s);
	}
	
	
	@Test(dataProvider = "dataprovider2",enabled=false)
	public void login_test(Integer i) throws InterruptedException
	{
		System.out.println(i);
	}
	
	
	
	@DataProvider
	public String[] dataprovider1()
	{
		String[] data = new String[3];
		data[0]="abcd";
		data[1]="pqr";
		data[2]="xyz";
		
		return data;
				
	}

	@DataProvider
	public Integer[] dataprovider2()
	{
		Integer[] data = new Integer[] {1,2,3};
		return data;
				
	}
	
	@DataProvider
	public Object[] dataprovider3()
	{
		Object[] data = new Object[] {1,"sonali",3};
		return data;
				
	}

	@Test(dataProvider = "dataprovider4")
	/*
	 * public void login_test(String[] s) throws InterruptedException {
	 * System.out.println(s[0] + ">>" +s[1]); }
	 */
	
	public void login_test(String username,String password) throws InterruptedException
	{
		System.out.println(username + ">>" + password);
	}
	
	
	@DataProvider
	public String[][] dataprovider4()
	{
		String[][] data = new String[][] {{"hyr","123"},{"pqr","345"},{"xyz","678"}};
		return data;
				
	}
}
