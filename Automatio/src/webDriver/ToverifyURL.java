package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyURL {

	public static void main(String[] args) {
		String expectedurlcontent = "button";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		String actualURL = driver.getCurrentUrl();
		System.out.println("The actualURL is====:"+actualURL);
		System.out.println("The expected urlcontentis======:"+expectedurlcontent);
		if(actualURL.contains(expectedurlcontent)) {
			System.out.println("pass:The url content is verified");
		}
		else
			System.out.println("Fail:The url content is not vrified");
	}
}