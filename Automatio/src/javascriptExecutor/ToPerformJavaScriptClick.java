package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformJavaScriptClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//test-case
		driver.get("https:www.selenium.dev/");
		Thread.sleep(2000);
		//identify webElemnt reference
		WebElement link = driver.findElement(By.linkText("About selenium"));
		// down-cast Reference to java script executer interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", link);
		Thread.sleep(1000);
		//post-Condition
		driver.quit();
		
	}

}
