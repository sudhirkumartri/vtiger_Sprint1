package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterAnUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		WebElement nameTF = driver.findElement(By.id("name"));
		WebElement emailTF = driver.findElement(By.name("email"));
		WebElement passwordTF = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		nameTF.sendKeys("Sudhir");
		Thread.sleep(1000);
		emailTF.sendKeys("sandeep@gmail.com");
		Thread.sleep(1000);
		emailTF.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		emailTF.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);
		passwordTF.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(1000);
		
		passwordTF.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Login']"));
		
		String loginheader = header.getText();
		Thread.sleep(2000);
		System.out.println("header is : " + loginheader);
	
		
		if(loginheader.contains("Login"))
			System.out.println("Pass : Register Successfull");
		else
			System.out.println("Fail: Register Unsuccessful");
	}

}
