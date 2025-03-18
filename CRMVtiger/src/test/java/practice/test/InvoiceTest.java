package practice.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.comcast.crm.basetest.BaseClass;

//@Listeners(com.comcast.crm.listenerutility.ListenerImpClass.class) // must be use this annotation if u want to take a screenshots
public class InvoiceTest extends BaseClass {
	
	@Test
	public void creatInvoiceTest() {
		
		System.out.println("execute createInvoiceTest");
		String acTitle = driver.getTitle();
		Assert.assertEquals(acTitle, "Login");
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
	}
	
	@Test
	public void creatInvoiceWithContactTest() {
		
		System.out.println("execute creatInvoiceWithContactTest");	
		
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
		
			}
}
