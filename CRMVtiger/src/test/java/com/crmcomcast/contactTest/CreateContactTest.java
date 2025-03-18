package com.crmcomcast.contactTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.generic.baseutility.BaseClass;

public class CreateContactTest  extends BaseClass{
	
	
	@Test
	public void createContact() {
		System.out.println("execute create contact & verify");
	}
	
	
	@Test
	public void createContactWithDate() {
		System.out.println("execute createContactWithDate & verify");
	}

	
}
