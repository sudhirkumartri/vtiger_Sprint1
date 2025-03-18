package com.comcast.crm.orgtest;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreateOrganizationTestJavaUtility {

	public static void main(String[] args) throws InterruptedException, IOException {

/*Create object*/
		
		FileUtility fLib=new FileUtility();
		
		ExcelUtility eLib=new ExcelUtility();
		
		JavaUtility jLib=new JavaUtility();

		
		//Read common data from Json file
		String BROWSER=fLib.getDataFromPropertiesFile("browser");
		String URL=fLib.getDataFromPropertiesFile("url");
		String USERNAME=fLib.getDataFromPropertiesFile("username");
		String PASSWORD=fLib.getDataFromPropertiesFile("password");

	
	
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
	driver.findElement(By.name("lastname")).sendKeys(lastName);
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
	//VERIFY header phonenumber expected result
	Thread.sleep(2000);
	
	boolean actlastName = driver.findElement(By.id("mouseArea_Last Name")).getText().contains(lastName);
	if(actlastName) {
		System.out.println(lastName + "is created==PASS");
	} else {
		System.out.println(lastName + "is not created==FAIL");

	}
	
	// step:-5 :-logout
	driver.quit();

}
		
	}


