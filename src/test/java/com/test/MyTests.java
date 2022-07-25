package com.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTests {
	
	@Test(priority=0)
	public void btest1()
	{
		//Assert.assertEquals(false, true);
		System.out.println("this is first test method");
	}
    @Test(priority=2)
	public void atest2()
	{
		//Assert.assertEquals(expected, actual);
		System.out.println("this is second test method");
	}
}
