package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;


public class WaitforClicking {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.click();
		
		//object
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//conditions
		wait.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys("sudhirtripathi@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
		
		//conditions
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
		
	}

}
