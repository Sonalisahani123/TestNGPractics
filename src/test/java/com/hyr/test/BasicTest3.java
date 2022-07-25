package com.hyr.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest3 {
	
	
	@Test(dataProvider = "dp1")
	public void login_test(String s) throws InterruptedException
	{
		System.out.println(s);
	}
	
	@DataProvider(indices= {0,2})
	public String[] dp1()
	{
		String[] data = new String[] {"sonali","sahani","sonu","sonam"};
		return data;
				
	}
	

}
