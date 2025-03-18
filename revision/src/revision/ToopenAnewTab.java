package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToopenAnewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.instagram.com");

		
		
	}

}
