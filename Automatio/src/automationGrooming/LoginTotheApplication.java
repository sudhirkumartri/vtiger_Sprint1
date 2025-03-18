package automationGrooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTotheApplication {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ca = driver.findElement(By.xpath(" //a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'] "));
		
		ca.click();
		WebElement text = driver.findElement(By.name("firstname"));
		
		text.sendKeys("Sudhir");
		Thread.sleep(2000);
		
		WebElement text2 = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		
		text2.sendKeys("Tripathi");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		
		Select selectDay=new Select(dayDropdown);
		
		selectDay.selectByIndex(10);
		
		WebElement radioButton= driver.findElement(By.xpath("//input[@value='2']"));
		radioButton.click();
		WebElement mobno = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mobno.sendKeys("782713442112");
		
		WebElement newpassword= driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		newpassword.sendKeys("sudhir123");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
	}

}
