package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ui[text()='wth-ToolTip]")).click();
		String tootipText = driver.findElement(By.id("name")).getAttribute("title");
		System.out.println(tootipText );
	}
}
