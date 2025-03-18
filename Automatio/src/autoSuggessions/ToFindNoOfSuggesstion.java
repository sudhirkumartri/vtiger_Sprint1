package autoSuggessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindNoOfSuggesstion {

	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("deadpool");
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[Contains(text();'eadpool']"));
		int noofSuggestions = allsuggestions.size();
		System.out.println("the no. of suggestion are:"+noofSuggestions);
		for(WebElement sug:allsuggestions) {
			System.out.println(sug.getText());
			
		}
		
		
	}

}
