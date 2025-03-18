package com.comcast.crm.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cast.crm.objectrepositoryutility.ContactPage;
import com.cast.crm.objectrepositoryutility.CreatingNewContactPage;
import com.cast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreateContactWithSupportDateTest2 extends BaseClass {

	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{

		// read common data from properties file

		FileInputStream fis = new FileInputStream("./confiAppData/commondata.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");

		String USERNAME = prop.getProperty("username");

		String PASSWORD = prop.getProperty("password");

		// read testscript data from Excel file

		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();

		// step2:navigation to contact module
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		// step:3:-click on create contact button
		ContactPage cp = new ContactPage(driver);
		cp.getcreatecontactlookupicon().click();

		// enter all the detail &create new contact
		String startDate = jLib.getSystemDateYYYYDDMM();
		String endDate = jLib.getRequiredDateYYYYDDMM(30);
		CreatingNewContactPage cnp = new CreatingNewContactPage(driver);
		cnp.CreateContactWithSupportDate(lastName, startDate, endDate);

		// verify header phone number info expected result
		String actStartDate = driver.findElement(By.id("dtlview_Support Start Date")).getText();
		if (actStartDate.equals(startDate)) {
			System.out.println(startDate + "information is verified===PASS");
		} else {
			System.out.println(startDate + "information is not verified===FAIL");
		}

		String actendDate = driver.findElement(By.id("dtlview_Support Start Date")).getText();
		if (actendDate.equals(endDate)) {
			System.out.println(endDate + "information is verified===PASS");
		} else {
			System.out.println(endDate + "information is not verified===FAIL");
		}
	}
}
