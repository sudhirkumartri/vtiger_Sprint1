package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyContentInWebpage {

	public static void main(String[] args) {
		
		
		
		String expectedcontent="I'm Feeling Lucky";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualcontent = driver.getPageSource();
		
		if(actualcontent.contains(expectedcontent)) {
			System.out.println("pass the content is verified");
			
		}
		else
			System.out.println("fail the content is verified");
		
	}

}
