package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyButtonColorChange {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		
		WebElement Button = driver.findElement(By.id("btn"));
		Button.click();
		
		String color = Button.getCssValue("background-color");
		Thread.sleep(2000);
		System.out.println(color);
		
		if(color.contains("134,239,172"))
		{
			System.out.println("Pass: the button is selected");
	}
		else
		{
			System.out.println("Fail: the button is not selected");
		}
		
		//post- condition
		driver.quit();

}

	}


