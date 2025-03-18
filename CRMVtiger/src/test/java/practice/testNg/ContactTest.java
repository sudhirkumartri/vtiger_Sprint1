package practice.testNg;

import org.testng.annotations.Test;

public class ContactTest {// the class name u can give any name bt most of the time scenario name or module name 
	                     //and ends with should be Test.
	@Test
	public void createContactTest() {// bt method name it give always module name and ends with test
		System.out.println("execute login");
		System.out.println("execute navigate to contact module");
		System.out.println("execute create contacts");
		System.out.println("execute verify contacts");
		System.out.println("execute logout");
	}
	
	@Test
	public void createcontactWithMobileNumberTest() {
		System.out.println("execute createcontactWithMobileNumberTest");
	}
	
}
