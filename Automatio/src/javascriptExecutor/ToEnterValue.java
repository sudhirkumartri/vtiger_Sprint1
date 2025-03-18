package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToEnterValue {

	public static void main(String[] args) throws InterruptedException {
			//pre-condition
			WebDriver driver =new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapp.skillrary.com/");
			//test-condition
			WebElement text = driver.findElement(By.xpath("//input[@class='form-control']"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			/*1st argument == java script key 
			 * 2nd argument == WebElement 
			 * in execute script(what,Where) method*/
			js.executeScript("arguments[0].value='sudhir@gmail.com'", text);
			Thread.sleep(2000);
			
			//post-condition
		//	driver.quit();

		}

}
