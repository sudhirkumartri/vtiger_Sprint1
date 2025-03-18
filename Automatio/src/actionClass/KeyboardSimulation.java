
package actionClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSimulation {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys(Keys.TAB).perform();
	//to open in new tab
	action.keyDown(Keys.CONTROL).perform();
	action.sendKeys(Keys.ENTER).perform();
	action.keyUp(Keys.CONTROL).perform();
	

}
}
