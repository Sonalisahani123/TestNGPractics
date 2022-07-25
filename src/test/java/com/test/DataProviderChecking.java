package com.test;

import org.testng.annotations.Test;

public class DataProviderChecking {
	
	
	@Test(dataProvider="check",dataProviderClass=DataProviderDemo.class)
	public void test(String username,String password)
	{
		System.out.println(username+"-----------"+ password);
	}
	
	
	@Test(dataProvider="check",dataProviderClass=DataProviderDemo.class)
	public void test1(String username, String password,String test)
	{
		System.out.println(username+"========" + password + "=========="+test);
	}

}
