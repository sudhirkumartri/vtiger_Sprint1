package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		String expectedTagname = "input";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		String usernameTagname = username.getTagName();
		String passwordTagname = password.getTagName();
	if(usernameTagname.equals(expectedTagname)&&passwordTagname.equals(expectedTagname));{
		username.clear();
		username.sendKeys("Sudhir");
		password.clear();
		password.sendKeys("Sudhir@124");
		System.out.println("Pass the Tagname is verified");
		
	}
		
	}

}
