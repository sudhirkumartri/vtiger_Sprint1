package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowserPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		
		driver.findElement(By.linkText("Open in new window")).click();
		Set<String> allIDs = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String id: allIDs)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains("SignUpPage"))
			{
				driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
				driver.findElement(By.id("password")).sendKeys("qwerty");
				driver.findElement(By.id("confirm-password")).sendKeys("qwerty");
				WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
				button.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		//post-condition
		driver.quit();

	}

	}


