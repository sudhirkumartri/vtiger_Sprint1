package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitleoftheWebpage {

	public static void main(String[] args) {
		String ExpectedTitle = "Facebook";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(ExpectedTitle)) {
			System.out.println("Pass:the title is verified");
		}
		else
			System.out.println("Fail:the title is not verified");
	}
}
