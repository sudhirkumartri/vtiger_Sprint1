package practice.testNg;

import org.testng.annotations.Test;

public class ContactTest1 {// there is no need set the priority in this  testcase 
	
	
	@Test(invocationCount=10)
	public void createContactTest() {
		
		System.out.println("execute createContact with -->HDFC");
	}
	
	@Test(dependsOnMethods="createContactTest")
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest-->HDFC=>ICICI");
	}
	
	@Test(dependsOnMethods="modifyContactTest")
	public void deletecontactTest() {
		System.out.println("execute deleteContactTest");
	}
	
}
