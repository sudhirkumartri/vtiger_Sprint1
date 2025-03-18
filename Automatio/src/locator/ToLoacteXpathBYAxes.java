package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLoacteXpathBYAxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//test case
		driver.findElement(By.name("q")).sendKeys("iphone14");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		//axes
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹58,999']")).click();
		driver.quit();
	}

}
