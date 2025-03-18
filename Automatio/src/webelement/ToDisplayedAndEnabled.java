package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisplayedAndEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(7000);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
		
		//verify whether the email is displaying or not
		boolean emailDisplayed = email.isDisplayed();
		
		if(emailDisplayed)
		{
			System.out.println("Pass: The email is displayed");
		
		// if displayed pas the email id
		email.sendKeys("tripathi.sudhir2019@gmail.com");
		
		//delay to button to be enabled
		Thread.sleep(2000);
		// verify whether the button is displayed or not 
		boolean buttonEnabled = continueButton.isEnabled();
		
		if(buttonEnabled)
		{
			System.out.println("Pass: The button is enabled");
		}
		else
			System.out.println("Fail: the button is not displayed");
		
	}
	else
		System.out.println("Fail: the email text field is not displayed");
		
		
	}



}
