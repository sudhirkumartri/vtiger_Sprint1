package com.comcast.crm.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreateContactwithSupportDateTestJavaUtiliy {

	

public static void main(String[] args) throws IOException, InterruptedException {

	/*Create object*/
	
	FileUtility fLib=new FileUtility();
	
	ExcelUtility eLib=new ExcelUtility();
	
	JavaUtility jLib=new JavaUtility();
	
		// read common data from properties  file
		
		FileInputStream fis=new FileInputStream("./confiAppData/commondata.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String BROWSER=prop.getProperty("browser");
		String URL=prop.getProperty("url");

		String USERNAME=prop.getProperty("username");

		String PASSWORD=prop.getProperty("password");

	//generate random number
	Random random=new Random();
			int randomInt = random.nextInt(1500);
		
			// read testscript data from Excel file
			
			String lastName=eLib.getDataFromExcel("contact", 1, 2)+jLib.getRandomNumber();

	
	WebDriver driver=null;
	
	if(BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
}else {
	driver=new ChromeDriver();
}

	

	//login to app
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(URL);
			
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	// step2:navigation to contact module
	driver.findElement(By.linkText("Contacts")).click();
	
	//step:3:-click on create organisation button
	
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	
	// step4:-enter all the detail and create new organisation

	 String startDate=jLib.getSystemDateYYYYDDMM();
	 String endDate=jLib.getRequiredDateYYYYDDMM(30);
	
	driver.findElement(By.name("lastname")).sendKeys(lastName);
	driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("support_start_date")).clear();
		driver.findElement(By.name("support_start_date")).sendKeys(startDate);
		
		driver.findElement(By.name("support_end_date")).clear();
		driver.findElement(By.name("support_end_date")).sendKeys(endDate);
		
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
	Thread.sleep(2000);
	
	String actStartDate = driver.findElement(By.id("dtlview_Support Start Date")).getText();
	if(actStartDate.equals(startDate)) {
		System.out.println(startDate + "is created==PASS");
	} else {
		System.out.println(startDate + "is not created==FAIL");

	}
	

	String actendDate = driver.findElement(By.id("dtlview_Support End Date")).getText();
	if(actendDate.equals(endDate)) {
		System.out.println(endDate + "information is created==PASS");
	} else {
		System.out.println(endDate + "information is not created==FAIL");

	}
	
	// step:-5 :-logout
	driver.quit();

}


	
}
