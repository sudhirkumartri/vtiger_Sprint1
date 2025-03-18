package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifydimension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		
		Dimension emailDim = email.getSize();
		Dimension passwordDim = password.getSize();
		
		int emailWidth = emailDim.getWidth();
		int emailHeight = emailDim.getHeight();
		
		int passWidth = passwordDim.getWidth();
		int passHeight = passwordDim.getHeight();
		
		System.out.println("The width of email is : " + emailWidth);
		System.out.println("The height of email is : " + emailHeight);
		
		System.out.println("The width of password is : " + passWidth);
		System.out.println("The height of password is : " + passHeight);
		
		if(emailWidth == passWidth && emailHeight == passHeight)
			System.out.println("Pass: The dimensions are verified");
		else
			System.out.println("Fail: The dimensions are not verified");

	}

}
