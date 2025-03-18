package revision;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAlltheWindowID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		
		Set<String> allwindowIDs = driver.getWindowHandles();
		System.out.println("the allwindowids is:"+allwindowIDs);
		
	}

}
