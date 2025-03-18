package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchSingleWindowID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		String windowID = driver.getWindowHandle();
		System.out.println("The Id of the parent window :"+windowID);
	}

}
