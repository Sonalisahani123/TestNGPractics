package com.hyr.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest4 {
	
	@Test(dataProvider = "dataprovider4",dataProviderClass=DataSupplier.class)
	public void login_test(String username,String password) throws InterruptedException
	{
		System.out.println(username + ">>" + password);
	}
	

}
