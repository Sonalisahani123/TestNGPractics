package com.hyr.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttachScreenShotToExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentReports  extentReports = new ExtentReports();
	     File file =new File("report.html");
	     ExtentSparkReporter  sparkreporter = new ExtentSparkReporter(file);
	     extentReports.attachReporter(sparkreporter);
	     
	     
	     
	     extentReports.flush();
	     Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
