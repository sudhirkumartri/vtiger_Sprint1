package revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToselectDropdownAndinsertValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("create new account")).click();
		WebElement daydropdown = driver.findElement(By.id("day"));
		
		Select selectDay=new Select(daydropdown);
		selectDay.selectByIndex(9);
		
	/*WebElement monthdropdown = driver.findElement(By.id("month"));
		
		Select selectmonth=new Select(monthdropdown);
		selectmonth.selectByValue("7");
		
	WebElement yeardropdown = driver.findElement(By.id("year"));
		
		Select selectyear=new Select(yeardropdown);
		selectyear.selectByVisibleText("2000");
		
		driver.quit();*/
	}

}
