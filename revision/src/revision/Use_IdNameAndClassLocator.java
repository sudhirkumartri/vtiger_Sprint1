package revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_IdNameAndClassLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/Sudhir.html");
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		
		
		
		username.sendKeys("sudhir kumar tripathi");
		
		
	}

}
