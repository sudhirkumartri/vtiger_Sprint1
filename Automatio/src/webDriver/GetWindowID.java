package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		String windowID = driver.getWindowHandle();
		System.out.println("the ID of the parentwindow:"+windowID);
	}

}
