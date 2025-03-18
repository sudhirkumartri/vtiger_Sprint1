package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toverifryTheContentintheURL {

	public static void main(String[] args) {
		String expectedurlContent = "button";
		
		WebDriver driver =new ChromeDriver();

		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		
		String actualURl = driver.getCurrentUrl();
		
		System.out.println("The actual url is :"+actualURl);
		System.out.println("The expected url is "+expectedurlContent);
		
	}

}
