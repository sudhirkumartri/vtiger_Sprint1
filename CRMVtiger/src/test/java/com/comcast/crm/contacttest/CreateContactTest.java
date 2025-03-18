package com.comcast.crm.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.cast.crm.objectrepositoryutility.ContactInformationPage;
import com.cast.crm.objectrepositoryutility.ContactPage;
import com.cast.crm.objectrepositoryutility.CreatNewOrganizationsPage;
import com.cast.crm.objectrepositoryutility.CreatingNewContactPage;
import com.cast.crm.objectrepositoryutility.HomePage;
import com.cast.crm.objectrepositoryutility.LoginPage;
import com.cast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreateContactTest extends BaseClass {

	@Test
	public void createContactTest() throws EncryptedDocumentException, IOException {
		// read testscript data from Excel file

		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber();
		// step2:navigation to contact module
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		// step:3:-click on create contact button
		ContactPage cp = new ContactPage(driver);
		cp.getcreatecontactlookupicon().click();

		// step: 4 // enter all the details in create contact

		CreatingNewContactPage ccp = new CreatingNewContactPage(driver);
		ccp.createContact(lastName);

		String actLastName = driver.findElement(By.id("mouseArea_Last Name")).getText();
		System.out.println(actLastName);

		if (actLastName.trim().equals(lastName)) {
			System.out.println(lastName + " information is verified");
		} else {
			System.out.println(lastName + "information is not verified");
		}
	}

	@Test
	public void createContactWithSupportDateTest() throws EncryptedDocumentException, IOException {
		// read common data from properties file

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

	@Test
	public void createContactWithOrgTest() throws EncryptedDocumentException, IOException {


		// read testscript data from Excel file

		String orgName = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();
		String contactLastName = eLib.getDataFromExcel("contact", 7, 3);

	

		// step2:navigation to contact module
		HomePage hp=new HomePage(driver);
		hp.getOrgLink().click();
		// step:3:-click on create organisation button

		OrganizationsPage op=new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// step4:-enter all the detail and create new organisation
		CreatNewOrganizationsPage cnop=new CreatNewOrganizationsPage(driver);
		cnop.createOrg(orgName);
		
		// verify header orgName info Expected
		String actOrgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		System.out.println(actOrgName);
		if (actOrgName.trim().equals(orgName)) {
			System.out.println(orgName + "information is created==PASS");
		} else {
			System.out.println(orgName + "information is not created==FAIL");

		}

		//step:5 navigate to contact module
		hp.getContactLink().click();
		
		
		//step:6: click on create contact button
		ContactPage cp=new ContactPage(driver);
		cp.getcreatecontactlookupicon().click();
		
		
		// step:7-enter all the detail& create new contact
		
		CreatingNewContactPage ccp=new CreatingNewContactPage(driver);
		ccp.createContactWithOrg(contactLastName, orgName);
		
		//verify header orgName info expected result
		ContactInformationPage cip = new ContactInformationPage(driver);
		String headtext = cip.getHeaderText().getText();
		if(headtext.contains(contactLastName))
		{
		System.out.println(contactLastName + "information is created==PASS");
		} else {
		System.out.println(contactLastName + "information is not created==FAIL");
		}
		
		String actOrgName1 = cip.getOrganizationNameText().getText();
		if (actOrgName1.trim().equals(orgName)) {
			System.out.println(orgName + "information is created==PASS");
		} else {
		System.out.println(orgName + "information is not created==FAIL");
		}		
		
	}

}
