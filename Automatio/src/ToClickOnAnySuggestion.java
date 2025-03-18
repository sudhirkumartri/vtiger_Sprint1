import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAnySuggestion {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
//test-case
	driver.get("https://www.google.com/");
	WebElement googleSearchTextBox = driver.findElement(By.name("q"));
	googleSearchTextBox.sendKeys("deadpool");
	
	List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(),'eadpool')]"));
	int allsuggestions = suggestions.size();
//total number of suggestion are
	System.out.println("Total number of suggestions are:"+allsuggestions);
//to print all suggestion on google text field
	for(WebElement sug:suggestions)
	{
		System.out.println(sug.getText());
		//to print address of suggestions
		System.out.print("  "+sug);
		if(sug.getText().contains("trailer"));
		{
			sug.click();
			break;
		}
	}
	
//post - condition
	driver.quit();
}

}
