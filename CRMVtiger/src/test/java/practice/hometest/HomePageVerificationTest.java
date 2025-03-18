package practice.hometest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageVerificationTest {
	
	@Test
	public void homePageTest(Method mtd) {
		
		System.out.println(mtd.getName()+ "Test Start");
		String expectedPage="Home Page";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click(); 
		
		// VERIFY
		String acTitle = driver.findElement(By.xpath("//a[contains(text(), 'Home')]")).getText();
		//hardAssert
		Assert.assertEquals(acTitle, expectedPage);
		
		driver.close();
		System.out.println(mtd.getName() +"Test End");
	}
	
	
	@Test
	public void verifyLogohomePageTest(Method mtd) {
		
		System.out.println(mtd.getName()+ "Test Start");		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click(); 
		boolean status=driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']")).isEnabled();
		//hardAssert
		Assert.assertTrue( status);
		driver.close();
		System.out.println(mtd.getName() +"Test End");
	}
	
	}
	
	
	
	
	


