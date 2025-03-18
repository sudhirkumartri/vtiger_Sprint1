package revision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("manali");
		
		List<WebElement> allsugessions = driver.findElements(By.xpath("//span[contains(text(),'nali')]"));
		int nos=allsugessions.size();
		System.out.println("Total no of suggessions are:" + nos);
		System.out.println("The suggessions are:");
		for(WebElement sugg : allsugessions) {
			System.out.println(sugg.getText());
		}
		driver.close();
	}

}
