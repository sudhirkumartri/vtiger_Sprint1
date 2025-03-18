package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyAcheckboxIsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(5000);
		WebElement checkbox = driver.findElement(By.id("domain1"));
		checkbox.click();
		if(checkbox.isSelected()) {
			System.out.println("Pass:The checkbox is selected");
		}
		else
			System.out.println("fail:The checkbox is not selected");
		//driver.quit();
	}

}
