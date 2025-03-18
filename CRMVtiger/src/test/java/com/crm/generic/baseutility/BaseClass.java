package com.crm.generic.baseutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {


	@BeforeSuite(groups={"smokeTest","regressionTest"})
	
	public void configBS() {
		System.out.println("====connect to DB, report config=====");
	}

	@BeforeClass(groups={"smokeTest","regressionTest"})

	public void configBC() {
	System.out.println("==Launch the BROWSER==");
	}
	
	@BeforeMethod(groups={"smokeTest","regressionTest"})
	public void configBM() {
		System.out.println("==LOGIN==");
	}	
	
	@AfterMethod(groups={"smokeTest","regressionTest"})
	
	public void configAM() {
		System.out.println("==LOGOUT==");
	}
	
	
	@AfterClass(groups={"smokeTest","regressionTest"})
	
	public void configAC() {
		System.out.println("===Close the BROWSER===");
	}
	
	
	@AfterSuite(groups={"smokeTest","regressionTest"})
	
	public void configAS() {
		System.out.println("====close DB, Report backup====");
	}
	

}
