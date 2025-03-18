package com.comcast.crm.orgtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.cast.crm.objectrepositoryutility.CreatNewOrganizationsPage;
import com.cast.crm.objectrepositoryutility.HomePage;
import com.cast.crm.objectrepositoryutility.OrganizationInformationPage;
import com.cast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.listenerutility.ListenerImpClass;
@Listeners(com.comcast.crm.listenerutility.ListenerImpClass.class)
public class CreateOrganizationTest3 extends BaseClass {

	@Test(groups="smokeTest")
	public void createOrgTest() throws EncryptedDocumentException, IOException, InterruptedException {
		UtilityClassObject.getTest().log(Status.INFO,"read data from Excel");
		// read testscript data from Excel file

		String orgName = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber();   

		// step:-2 navigate to organization module
		UtilityClassObject.getTest().log(Status.INFO,"navigate to orgPage");
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// click on organization button
		UtilityClassObject.getTest().log(Status.INFO,"navigate to create orgPage");
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// step:-4 enter all the details& create new orgnization
		UtilityClassObject.getTest().log(Status.INFO,"create a new  org");
		CreatNewOrganizationsPage cnop = new CreatNewOrganizationsPage(driver);
		
		cnop.createOrg(orgName);
		UtilityClassObject.getTest().log(Status.INFO,orgName +"====>to create orgPage");

		Thread.sleep(3000);
		// verify header msg Expected Result
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
				String actOrgName = oip.getHeaderMsg().getText();
		if (actOrgName.contains(orgName)) {
			System.out.println(orgName + "name is verified==PASS");
		} else {
			System.out.println(orgName + "name is NOT verified==FAIL");
		}

	}

	@Test(groups="regressionTest")
	public void createOrgWithPhoenumberTest() throws Throwable, IOException {
		// read testScript data from Excel file
		 String orgName = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNumber();
		 String phoneNumber = eLib.getDataFromExcel("org", 7, 3);

		// navigate organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// click on organization button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// step:-4 enter all the details& create new orgnization
		CreatNewOrganizationsPage cnop = new CreatNewOrganizationsPage(driver);
		cnop.createOrg(orgName);

		// verify header msg Expected Result
		Thread.sleep(3000);
		String actPhoneNumber = driver.findElement(By.id("mouseArea_Phone")).getText();
		if (actPhoneNumber.contains(phoneNumber)) {
			System.out.println(phoneNumber + "information  is verified==PASS");
		} else {
			System.out.println(phoneNumber + "information is NOT verified==FAIL");
		}

	}

	@Test(groups="regressionTest")
	public void createOrgWithIndustriesTest() throws EncryptedDocumentException, IOException, InterruptedException {

		// read test script data from excel file
		
		String orgName=eLib.getDataFromExcel("org", 4, 2)+jLib.getRandomNumber();
		String industry=eLib.getDataFromExcel("org", 4, 3);
		String type=eLib.getDataFromExcel("org", 4, 4);
		
		// navigate organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// click on organization button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();

		// step:-4 enter all the details& create new orgnization
		CreatNewOrganizationsPage cnop = new CreatNewOrganizationsPage(driver);
		cnop.createOrg(orgName,industry,type);
		Thread.sleep(3000);
		// verify the industries and type info
		String actIndustries=driver.findElement(By.id("mouseArea_Industry")).getText();
		
		if(actIndustries.contains(industry)) {
			System.out.println(industry+"information is verified==PASS");
		} else {
			System.out.println(industry+"information is not verified==FAIL");
		}
	}

}
