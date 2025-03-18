package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToScroll_InView {
	public static void main(String[] args) throws InterruptedException {
		//pre-condition
				WebDriver driver =new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://www.selenium.dev/");
				//test-condition
				WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
				String check = news.getText();
				System.out.println(check);
				//down cast to establish connection with java script executor interface 
				JavascriptExecutor js = (JavascriptExecutor)driver;
				/*1st argument == java script key 
				 * 2nd argument == WebElement 
				 * in execute script(what,Where) method*/
				js.executeScript("arguments[0].scrollIntoView(true);", news);
				Thread.sleep(2000);
				
				//post-condition
				driver.quit();
	}

}
