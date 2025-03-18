package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		Navigation nav = driver.navigate();
		
		
		nav.to("https://www.instagram.com");
		
		Thread.sleep(3000);
		
		
		nav.to("https://www.facebook.com");
		
		
		Thread.sleep(2000);
		
		nav.back();
		
		
		Thread.sleep(3000);
		nav.forward();
		
		
		Thread.sleep(2000);
		nav.refresh();
		driver.close();
	}

}
