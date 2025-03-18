package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenAnew_tabWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
	}

}
