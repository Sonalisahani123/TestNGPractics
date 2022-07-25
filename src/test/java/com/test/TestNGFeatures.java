package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest(){
		System.out.println("login test");
		//int i=9/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void homepageTest(){
		System.out.println("homepage test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registrationpageTest(){
		System.out.println("registrationpage test");
	}
	
}
