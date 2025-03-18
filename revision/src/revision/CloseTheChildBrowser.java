package revision;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheChildBrowser{
	
			public static void main (String[] args) throws InterruptedException{

		WebDriver driver=new ChromeDriver();

			driver.get("https://www.google.com");

			driver.switchTo().newWindow(WindowType.WINDOW);

			driver.navigate().to("https://www.facebook.com");
			Thread.sleep(2000);

			driver.switchTo().newWindow(WindowType.WINDOW);

			driver.navigate().to("https://www.instagram.com/");
			Thread.sleep(2000);

		      Set<String> allwindowsID = driver.getWindowHandles();

	     for(   String id:allwindowsID) {
	    	 
	    	 driver.switchTo().window(id);
	    	 
	    	String currenturl = driver.getCurrentUrl();
	    	
	    	if(currenturl.equals("https://www.instagram.com/")) {
	    		driver.close();
	    	}
	     }
			}
}
			
			
