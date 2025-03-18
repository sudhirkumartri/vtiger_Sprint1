package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAchildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		Set<String> allWindowsIds = driver.getWindowHandles();
		
		System.out.println(allWindowsIds);
		
		for(String id : allWindowsIds)
		{
			driver.switchTo().window(id);
			
			String currentUrl=driver.getCurrentUrl();
			
			
			if(currentUrl.equals("https://www.selenium.dev/"))
			{
				driver.close();
			}
		
		}
			

		}
	}

