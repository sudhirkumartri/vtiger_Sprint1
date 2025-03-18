package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//test-case
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement countrydropdown = driver.findElement(By.id("select-multiple-native"));
		Select select= new Select(countrydropdown);
		//selecting an option
		select.selectByVisibleText("Canada");
		Thread.sleep(2000);
		select.selectByVisibleText("Poland");
		Thread.sleep(2000);
		select.selectByVisibleText("China");
		Thread.sleep(2000);
		//de-selecting by option
		select.deselectByValue("Canada");
		Thread.sleep(2000);
		
	}

}
