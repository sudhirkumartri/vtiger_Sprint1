package practice.testNg;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
public	ExtentReports report;
	@BeforeSuite
	public void configBS() {
		
		//spark report configURATION
				ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
				spark.config().setDocumentTitle("CRM test suite Results");
				spark.config().setReportName("CRM report");
				spark.config().setTheme(Theme.DARK);
				
				// add ENV information & create test
				 report =new ExtentReports();
				report.attachReporter(spark);
				report.setSystemInfo("OS", "Windows11");
				report.setSystemInfo("BROWSER", "CROME-100");
	}
	
	@AfterSuite
	public void configAS() {
		report.flush();
	}
	
	
	
	
	@Test
	public void createContactTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
	TakesScreenshot eDriver=(TakesScreenshot)driver;
	String filepath = eDriver.getScreenshotAs(OutputType.BASE64);
	
		ExtentTest test=report.createTest("createContactTest");
		test.log(Status.INFO,"login to app");
		
		test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		if("HDFdd".equals("HDFC")) {
			test.log(Status.PASS," Contact is created");
		} else {
			test.addScreenCaptureFromBase64String(filepath, "ErrorDile");

		}
		driver.close();
		
	}

	
	@Test
	public void createContactWithORG() {
		
		ExtentTest test=report.createTest("createContactWithORG");
		
		test.log(Status.INFO,"login to app");
		
		test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS," Contact is created");
		} else {
			test.log(Status.FAIL," Contact is not created");

		}
		
		
	}
	
	@Test
	public void createContactWithPhoneNumber() {
		
		ExtentTest test=report.createTest("createContactWithPhoneNumber");
		
		test.log(Status.INFO,"login to app");
		
		test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO,"create contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS," Contact is created");
		} else {
			test.log(Status.FAIL," Contact is not created");

		}
		
	}
}
