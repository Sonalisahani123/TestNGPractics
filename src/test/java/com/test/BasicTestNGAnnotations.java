package com.test;

import org.testng.annotations.Test;

public class BasicTestNGAnnotations {
  
	@Test
	public void test1(){
		System.out.println("hi I'm first method");
	}
   @Test(dependsOnMethods={"test1"})
   public void abc(){
	   System.out.println("hi i am second method");
   }
	
	
}
