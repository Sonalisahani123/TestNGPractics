package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	
	
	/*@Test(dataProvider="dataSet",enabled=false)
	public void test(String username,String password)
	{
		System.out.println(username+"-----------"+ password);
	}*/

	@DataProvider
	public Object[][] dataSet()
	{
		Object[][] dataset=new Object[4][2];
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
		
		dataset[1][0]="user1";
		dataset[1][1]="pass1";
		
		dataset[2][0]="user1";
		dataset[2][1]="pass1";
		
		dataset[3][0]="user1";
		dataset[3][1]="pass1";
		return dataset;
			
	}
	
	
	
	@DataProvider(name="create")
	public Object[][] dataSet1()
	{
	return new Object[][]
			{
		{"username","password","smoke"},
		{"username","password","sanity"},
		{"username","password","Regression"},
		{"username","password","Functional"},
			}
		;
		
}
	/*@Test(dataProvider="dataSet1")
	public void test1(String username, String password,String test)
	{
		System.out.println(username+"========" + password + "=========="+test);
	}*/
}

