package com.comcast.crm.contacttest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.cast.crm.objectrepositoryutility.ContactPage;
import com.cast.crm.objectrepositoryutility.CreatNewOrganizationsPage;
import com.cast.crm.objectrepositoryutility.CreatingNewContactPage;
import com.cast.crm.objectrepositoryutility.HomePage;
import com.cast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateContactWithOrgTest2 extends BaseClass {

	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{
	
		// read test script data from Excel file

		String orgName = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();
		String contactLastName = eLib.getDataFromExcel("contact", 7, 3);

	

		// step2:navigation to contact module
		HomePage hp=new HomePage(driver);
		hp.getOrgLink().click();
		// step:3:-click on create organisation button

	OrganizationsPage cp=new OrganizationsPage(driver);
	cp.getCreateNewOrgBtn().click();

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
		ContactPage cop=new ContactPage(driver);
		cp.getCreateNewOrgBtn().click();
		
		
		// step:7-enter all the detail& create new contact
		
		CreatingNewContactPage ccp=new CreatingNewContactPage(driver);
		ccp.createContactWithOrg(contactLastName, orgName);
		
		
		
		
		//verify header orgName info expected result
		actOrgName=driver.findElement(By.id("mouseArea_organization Name")).getText();
		
		
		if (actOrgName.trim().equals(orgName)) {
			System.out.println(orgName + "information is created==PASS");
		} else {
			System.out.println(orgName + "information is not created==FAIL");

		}
		
		
		
		
		
		
	}

}
