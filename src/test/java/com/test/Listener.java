/*
 * package com.test;
 * 
 * import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.chrome.ChromeDriver; import
 * org.testng.ITestContext; import org.testng.ITestListener; import
 * org.testng.ITestResult;
 * 
 * import io.cucumber.java.Scenario; import
 * io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class Listener implements ITestListener {
 * 
 * public void onTestStart(ITestResult result) {
 * System.out.println("start the test ..............");
 * 
 * }
 * 
 * 
 * //when the testcases passed call this method public void
 * onTestSuccess(ITestResult result) {
 * System.out.println("Name of the Test case passed is:"+result.getName());
 * 
 * }
 * 
 * //When the test cases failed call this method public void
 * onTestFailure(Scenario scenario) {
 * 
 * System.out.println("Name of the test case failed is:"+result.getName());
 * public void tearDown(Scenario scenario) { if (scenario.isFailed()) { // take
 * screenshot: String screenshotName = scenario.getName().replaceAll(" ", "_");
 * byte[] sourcePath = ((TakesScreenshot)
 * driver).getScreenshotAs(OutputType.BYTES); scenario.attach(sourcePath,
 * "image/png", screenshotName);
 * 
 * }
 * 
 * } //When the test cases skipped call this method public void
 * onTestSkipped(ITestResult result) {
 * System.out.println("Name of the test case skipped:"+ result.getName());
 * 
 * }
 * 
 * public void onTestFailedButWithinSuccessPercentage(ITestResult result) { //
 * TODO Auto-generated method stub
 * 
 * }
 * 
 * public void onStart(ITestContext context) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * public void onFinish(ITestContext context) {
 * System.out.println("test got finished");
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 */