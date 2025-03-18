package com.comcast.crm.listenerutility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.google.common.io.Files;

public class ListenerImpClass implements ITestListener, ISuiteListener {
	public	ExtentReports report;
	  public static  ExtentTest test;

	public void onStart(ISuite suite) {
		System.out.println("Report configuration");
		String time = new Date().toString().replace(" ", "_").replace(":", " ");

		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report_ "+time+".html");
		spark.config().setDocumentTitle("CRM test suite Results");
		spark.config().setReportName("CRM report");
		spark.config().setTheme(Theme.DARK);
		
		// add ENV information & create test
		 report =new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows11");
		report.setSystemInfo("BROWSER", "CROME-100");
	
	}

	public void onFinish(ISuite suite) {
		System.out.println("Report backUp");
		report.flush();
			}

	public void onTestStart(ITestResult result) {
		System.out.println("======= ====>" + result.getMethod().getMethodName() + ">======START =======");
		 test=report.createTest(result.getMethod().getMethodName());
		 UtilityClassObject.setTest(test);
		 test.log(Status.INFO, result.getMethod().getMethodName()+"===>STARTED<=====");
	}

	public void onTestSucess(ITestResult result) {
		System.out.println("======= ====>" + result.getMethod().getMethodName() + ">=======END ======");
		 test.log(Status.PASS, result.getMethod().getMethodName()+"===>COMPLETED<=====");


	}

	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();

		// EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);

		// File srcFile = edriver.getScreenshotAs(OutputType.FILE);

		// try {
		// FileUtils.copyFile(srcFile, new File("./screenshot/"+testName+".png"));
		// } catch (IOException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		TakesScreenshot eDriver=(TakesScreenshot)BaseClass.sdriver;
		String filepath = eDriver.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":", " ");
		test.addScreenCaptureFromBase64String(filepath, testName+"_"+time);
		test.log(Status.FAIL, result.getMethod().getMethodName()+"===>FAILED<=====");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Report configuration");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Report configuration");

	}

}
