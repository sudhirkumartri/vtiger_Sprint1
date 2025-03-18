package actionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressAndHoldAndRelease {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		  List<WebElement> allLinks = driver.findElements(By.xpath("a[@class='nav-link']"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		
		for(WebElement Link: allLinks) {
			Link.click();
		}
		action.keyUp(Keys.CONTROL).perform();
	}

}
