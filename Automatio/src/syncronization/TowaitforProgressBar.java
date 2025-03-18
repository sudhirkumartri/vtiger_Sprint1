package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TowaitforProgressBar {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//test-condition
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		WebElement startbutton = driver.findElement(By.xpath("//button[text()='Start']"));
		WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		startbutton.click();
		
		/*object*/
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		//condition  it mean use here using explicit wait
		wait.until(ExpectedConditions.textToBePresentInElement(startbutton, "Start"));
		reset.click();
		
		//post-condition
		driver.quit();

	}
	}


