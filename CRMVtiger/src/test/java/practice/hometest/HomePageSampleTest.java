package practice.hometest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageSampleTest {

	
	
	@Test
	public void homePageTest(Method mtd) {
		
		System.out.println(mtd.getName()+ "Test Start");
		SoftAssert saObject=new SoftAssert();
		System.out.println("step-1");
		System.out.println("step-2");
		Assert.assertEquals("Home", "Home");//here we use mandatory information so we go hardAssert
		System.out.println("step-3");
		saObject.assertEquals("Title", "Title-1");//here we use non mandatory information so we use soft assert
		System.out.println("step-4");
		saObject.assertAll();// whenever used soft assert dont forget this method the end of test script-its mandatory
		System.out.println(mtd.getName() +"Test End");
	}
	
	
	@Test
	public void verifyLogohomePageTest(Method mtd) {
		
		System.out.println(mtd.getName()+ "Test Start");
		SoftAssert saObject=new SoftAssert();
		System.out.println("step-1");
		System.out.println("step-2");
		saObject.assertTrue(true);
		System.out.println("step-3");
		System.out.println("step-4");
		System.out.println(mtd.getName() +"Test End");
	}
	
	}
	

