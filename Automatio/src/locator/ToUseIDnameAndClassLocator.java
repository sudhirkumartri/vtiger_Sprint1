package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIDnameAndClassLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Sudhir.html");
		WebElement username = driver.findElement(By.id("Username"));
		username.sendKeys("Akash");
		WebElement password = driver.findElement(By.name("Abc"));
		password.sendKeys("sk123");
		WebElement checkbox = driver.findElement(By.id("box"));
		checkbox.click();
	}

}
