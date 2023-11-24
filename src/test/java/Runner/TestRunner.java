package Runner;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.AppiumTesting_Assignment.Utility.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

@CucumberOptions(plugin = {"arun02","html:Reports","junit:junitreport/cucumber.xml"},
features = "./src/test/java/Features",
glue = {"StepDefinitions", "Hooks"},
tags ="@Test1"
)


public class TestRunner  extends AbstractTestNGCucumberTests{
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public AppiumDriver<MobileElement> driver;
	
	
	@BeforeSuite
	public void setExtent()
	{
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}
	@AfterSuite
	public void endReport()
	{
		extent.flush();
		extent.close();
	}
	@BeforeMethod
	public void startTest(Method name) 
	{
		
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}
	
	@AfterMethod
	public void ReportFlush(ITestResult result) throws IOException
	{
		System.out.println(result.getMethod().getMethodName());
		if(result.getStatus() == ITestResult.FAILURE)
			extentTest.log(LogStatus.FAIL,result.getThrowable());
		else if(result.getStatus()==ITestResult.SKIP)
			extentTest.log(LogStatus.SKIP, result.getThrowable());
		else
			extentTest.log(LogStatus.PASS,"Test Case Passed");
	}
	@AfterMethod
	public void endTest()
	{
		extent.endTest(extentTest);
	}

}
