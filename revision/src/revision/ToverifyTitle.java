package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyTitle {

	public static void main(String[] args) {
		String expectedurlcontent="button";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		String actualurl=driver.getCurrentUrl();
		if(actualurl.contains(expectedurlcontent)) {
			System.out.println("pass the actual url is:"+actualurl);
			
		}
		else
			System.out.println("fail the expectedurlcontent:"+expectedurlcontent);
	}

}
