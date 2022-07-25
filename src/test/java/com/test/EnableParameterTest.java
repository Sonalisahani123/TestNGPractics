package com.test;

import org.testng.annotations.Test;

public class EnableParameterTest {
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("this is first");
	}
     @Test
	 public void test2()
	 {
		 System.out.println("this is second");
	 }
     
     public void test3()
     {
    	 System.out.println("this is third");
     }
     
}
