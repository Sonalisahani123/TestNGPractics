package com.hyr.test;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider
	public String[][] dataprovider4()
	{
		String[][] data = new String[][] {{"hyr","123"},{"pqr","345"},{"xyz","678"}};
		return data;
				
	}
}
