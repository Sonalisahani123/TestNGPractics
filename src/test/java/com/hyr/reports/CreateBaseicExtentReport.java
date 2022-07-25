package com.hyr.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreateBaseicExtentReport {
	
	public static void main(String[] args) throws IOException
	{
		//create the ExtentReport object
		ExtentReports extentreport = new ExtentReports();
		File file =new File("report.html");
		
		//ExtentSparkReporter sparkReporter = new ExtentSparkReporter("H:\\Automation_WS\\TestNGPractics-master\\report.html");//absolute path
		
		//ExtentSparkReporter sparkReporter1 = new ExtentSparkReporter("report1.html");//relative path
		ExtentSparkReporter sparkReporter2 = new ExtentSparkReporter(file);//by using file
		
		extentreport.attachReporter(sparkReporter2);
		
		ExtentTest test1 = extentreport.createTest("Test 1");
		test1.pass("this is passed");
		ExtentTest test2 = extentreport.createTest("Test 2");
		test2.log(Status.FAIL, "This is Failed");
		
		extentreport.createTest("Test 3").skip("This is skipped");
		
		extentreport.flush();
		//to open driectly in browser
		Desktop.getDesktop().browse(new File("report.html").toURI());
	}
		
	

}
