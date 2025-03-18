package com.comcast.crm.contacttest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cast.crm.objectrepositoryutility.ContactInformationPage;
import com.cast.crm.objectrepositoryutility.ContactPage;
import com.cast.crm.objectrepositoryutility.CreatNewOrganizationsPage;
import com.cast.crm.objectrepositoryutility.CreatingNewContactPage;
import com.cast.crm.objectrepositoryutility.HomePage;
import com.cast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.basetest.BaseClass;

public class CreateContactTest4 extends BaseClass {


	@Test(groups={"smokeTest"})
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

		//verify header 
		String actHeader = cp.getheaderMsg().getText();
		boolean status=actHeader.equals(lastName);
		Assert.assertEquals(status,true );
		
		
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		SoftAssert soft=new SoftAssert();
		Assert.assertEquals(actLastName,lastName );
		
	}
	

	@Test(groups="regressionTest")
	public void createContactWithSupportDateTest() throws EncryptedDocumentException, IOException {
		// read common data from properties file

		String lastName = eLib.getDataFromExcel("contact", 4, 2) + jLib.getRandomNumber();

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

	@Test(groups="regressionTest")
	public void createContactWithOrgTest() throws EncryptedDocumentException, IOException {

		// read testscript data from Excel file

		String orgName = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();
		System.out.println(orgName);
		String contactLastName = eLib.getDataFromExcel("contact", 7, 3);

		// step2:navigation to contact module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		// step:3:-click on create organisation button

		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// step4:-enter all the detail and create new organisation
		CreatNewOrganizationsPage cnop = new CreatNewOrganizationsPage(driver);
		cnop.createOrg(orgName);

		// verify header orgName info Expected
		String actOrgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		System.out.println(actOrgName);
		if (actOrgName.trim().equals(orgName)) {
			System.out.println(orgName + "information is created==PASS");
		} else {
			System.out.println(orgName + "information is not created==FAIL");

		}

		// step:5 navigate to contact module
		hp.getContactLink().click();

		// step:6: click on create contact button
		ContactPage cp = new ContactPage(driver);
		cp.getcreatecontactlookupicon().click();

		// step:7-enter all the detail& create new contact

		CreatingNewContactPage ccp = new CreatingNewContactPage(driver);
		ccp.createContactWithOrg(contactLastName, orgName);

		// verify header orgName info expected result
		ContactInformationPage cip = new ContactInformationPage(driver);
		String headtext = cip.getHeaderText().getText();
		if (headtext.contains(contactLastName)) {
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
