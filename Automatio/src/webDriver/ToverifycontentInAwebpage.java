package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifycontentInAwebpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String expectedcontent = "i,m feeling Lucky";
		driver.get("https://www.google.com/");
		String pagesource = driver.getPageSource();
		if(pagesource.contains(expectedcontent)) {
			System.out.println("pass:The content is verified");
		}
		else
			System.out.println("Fail:The content is not verified");
			
	
		}
		
	}


