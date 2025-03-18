package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		WebElement datepicker = driver.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]"));
		Actions action=new Actions(driver);
		action.sendKeys(datepicker, "01/06/2024").sendKeys(Keys.ENTER).perform();
		
	}

	
}
