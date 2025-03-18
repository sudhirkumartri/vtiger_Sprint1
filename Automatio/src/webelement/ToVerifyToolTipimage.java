package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipimage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/image/broken?sublist=1");
		Thread.sleep(5000);
		
		//test-case
		driver.findElement(By.xpath("//a[text()='Broken Image']")).click();
		Thread.sleep(2000);
		
		 String toolTip = driver.findElement(By.xpath("//figure[@title='Broken Image']")).getAttribute("title");
		 System.out.println(toolTip);
		 
		 //PST-CONDITION
		 driver.quit();
}


	}


