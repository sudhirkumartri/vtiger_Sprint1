package com.comcast.crm.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrgWthPhoneNumberTest {
public static void main(String[] args) throws InterruptedException, IOException {
		 
		
		// read common data from json file
		
		FileInputStream fis=new FileInputStream("./confiAppData/commondata.properties");
		
		// this all program is commondata
		Properties prop=new Properties();
		prop.load(fis);
		
		String BROWSER=prop.getProperty("browser");
		String URL=prop.getProperty("url");
		String USERNAME=prop.getProperty("username");
		String PASSWORD=prop.getProperty("password");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	//generate random number
	Random random=new Random();
			
			int randomInt = random.nextInt(1500);
			
			
	// read testscript data from Excel file
	FileInputStream fis1=new FileInputStream("./testData/data.xlsx");
	// accesss the workbbok using create method
	Workbook workbook = WorkbookFactory.create(fis1);
	
	// access the workbook of getsheet () interface
	Sheet sheet = workbook.getSheet("sheet3");
	
	Row row = sheet.getRow(7); 
	
	// access the cell
	
	String orgName = row.getCell(2).toString()+randomInt;
	String phonenumber = row.getCell(3).toString(); 
	workbook.close();

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
	Thread.sleep(2000);		
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	// navigation to org module
	driver.findElement(By.linkText("Organizations")).click();
	
	//step:3:-click on create organisation button
	
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	// step4:-enter all the detail and create new organisation
	
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	driver.findElement(By.id("phone")).sendKeys(phonenumber);
	driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	
	// verify header phonenuber info Expected 
	String actphonenumber = driver.findElement(By.id("dtlview_Phone")).getText();
	if(actphonenumber.equals(phonenumber)) {
		System.out.println(phonenumber + "is created==PASS");
	} else {
		System.out.println(phonenumber + "is not created==FAIL");

	}
	
	
	// step:-5 :-logout

	driver.quit();
}

}
