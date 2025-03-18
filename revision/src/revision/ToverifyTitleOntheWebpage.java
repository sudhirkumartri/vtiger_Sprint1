package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyTitleOntheWebpage {

	public static void main(String[] args) {
		
		String expectedTitle = "Instagram";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String actualTitle = driver.getTitle();
	}

}
