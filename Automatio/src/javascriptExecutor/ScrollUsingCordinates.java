package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUsingCordinates {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//pre-condition
			WebDriver driver =new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.selenium.dev/");
			//test-condition
			
			//down cast to establish connection with java script executor interface 
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//downward vertical scrolling
			js.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(2000);
			
			//upward vertical scrolling
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
			//post-condition
			driver.quit();

		}

	}


