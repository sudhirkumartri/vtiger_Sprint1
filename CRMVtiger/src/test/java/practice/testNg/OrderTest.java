package practice.testNg;

import org.testng.annotations.Test;

public class OrderTest {
	
	@Test
	
	public void createOrderTest() {
		
		System.out.println("execute createOrderTest==>123");
		String str=null;
		System.out.println(str.equals("123"));
	}
	
@Test(dependsOnMethods="createOrderTest")
	
	public void billingAnOrderTest() {
		
		System.out.println("Execute billingAnOrderTest==>123");
		//String str=null;
		//System.out.println();
}
}
