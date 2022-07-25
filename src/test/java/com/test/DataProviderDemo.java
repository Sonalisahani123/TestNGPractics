package com.test;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	
	@DataProvider(name="check")
	public Object dataSet(Method m)
	{
		Object[][] testdata=null;
		if(m.getName().equals("test1"))
		{
			testdata=new Object[][]
					{
				{"username","password","smoke"},
				{"username","password","sanity"},
				{"username","password","Regression"},
				{"username","password","Functional"},
					};
		}
					else if(m.getName().equals("test"))
					{
						testdata=new Object[][]
								{
							{"username","password"},
							{"username","password"},
							{"username","password"},
							
					};
					
				
		}
					return testdata;
		}
	}
	


