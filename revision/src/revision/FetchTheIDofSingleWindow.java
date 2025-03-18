package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheIDofSingleWindow {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		String windowID = driver.getWindowHandle();
		
		System.out.println("the Id of the parent window:"+windowID );
		
		
		
	}

}
