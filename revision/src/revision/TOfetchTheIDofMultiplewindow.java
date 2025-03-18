package revision;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOfetchTheIDofMultiplewindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		Set<String> allIDs = driver.getWindowHandles();
		System.out.println(allIDs);
		
		
	}

}
