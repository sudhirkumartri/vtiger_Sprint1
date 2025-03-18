package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllIDs {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("button[text()='click to open multiple popup windows']")).click();
		//fetch allIDs
		Set<String> allIDs = driver.getWindowHandles();
		//print ALL IDs
		System.out.println(allIDs);
	}

}
