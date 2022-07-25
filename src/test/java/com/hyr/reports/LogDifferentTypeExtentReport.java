package com.hyr.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogDifferentTypeExtentReport {

	public static void main(String[] args) throws IOException {
	     ExtentReports  extentReports = new ExtentReports();
	     File file =new File("report.html");
	     ExtentSparkReporter  sparkreporter = new ExtentSparkReporter(file);
	     extentReports.attachReporter(sparkreporter);
	     
	     extentReports.createTest("text based test")
	     .log(Status.INFO, "info1")
	     .log(Status.INFO,"<b>info2</b>")
	     .log(Status.INFO,"<i>info3</i>")
	     .log(Status.INFO,"<b><i>info2</i></b>");
	     
	     
	     String xmlData = "<menu id=\"file\" value=\"File\">\r\n"
	     		+ "  <popup>\r\n"
	     		+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
	     		+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
	     		+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
	     		+ "  </popup>\r\n"
	     		+ "</menu>";
	     
	     
	     String jsonData = "{\"menu\": {\r\n"
	     		+ "  \"id\": \"file\",\r\n"
	     		+ "  \"value\": \"File\",\r\n"
	     		+ "  \"popup\": {\r\n"
	     		+ "    \"menuitem\": [\r\n"
	     		+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
	     		+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
	     		+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
	     		+ "    ]\r\n"
	     		+ "  }\r\n"
	     		+ "}}";
	     
	     extentReports
	     .createTest("XML based Test")
	     .log(Status.INFO, MarkupHelper.createCodeBlock(xmlData,CodeLanguage.XML));
	     
	     extentReports
	     .createTest("JSON based Test")
	     .info(MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));
	     
	     //want to display list type of data in extent report
	     List<String> listData = new ArrayList<String>();
	     listData.add("sonali");
	     listData.add("sahani");
	     listData.add("sonu");
	     
	     Map<Integer,String> mapData = new HashMap<Integer,String>();
	     mapData.put(101, "sonali");
	     mapData.put(102, "sahani");
	     mapData.put(103, "sonu");
	     
	     Set<Integer> setData = mapData.keySet();
	     
	     
	     extentReports
	     .createTest("List based Test")
	     .log(Status.INFO, MarkupHelper.createOrderedList(listData))
	     .info(MarkupHelper.createUnorderedList(listData));
	     
	     
	     extentReports
	     .createTest("Set based Test")
	     .log(Status.INFO, MarkupHelper.createOrderedList(setData))
	     .info(MarkupHelper.createUnorderedList(setData));
	     
	     extentReports
	     .createTest("Map based Test")
	     .log(Status.INFO, MarkupHelper.createOrderedList(mapData))
	     .info(MarkupHelper.createUnorderedList(mapData));
	     
	     
	     extentReports
	     .createTest("Highlight Log Test")
	     .info("THis is not a highlighted message")
	     .info(MarkupHelper.createLabel("This is a highlighted message", ExtentColor.RED));
	     
	     try {
	    	 int i= 5/0;
	    	 }
	      catch(Exception e)
	           {
	    		 extentReports.createTest("Exception Log Test1")
	    		 .fail(e);
	    		 
	    	 }
	     
	     Throwable t =new  RuntimeException("This is a custome exception");
	     extentReports.createTest("Exception Test 2")
	     .info(t);
	     
	   
	     
	     extentReports.flush();
	     Desktop.getDesktop().browse(new File("report.html").toURI());
	     
	     
	

	}

}
