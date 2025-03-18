package revision;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheControlAnychildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String id:allwindow) {
			driver.switchTo().window(id);
			String currentURL = driver.getCurrentUrl();
			driver.close();
			
		}
	}

}
