package practice1.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProjectAndVerifyDataInDBwithGUI {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://localhost:8084");
	
	driver.findElement(By.id("username")).sendKeys("rmgyantra");
	driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button[text()='sign']")).click();
	
	
	}
}
