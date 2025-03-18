package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindow {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//img[@class='lnXdpd']")).click();
driver.quit();
	}

}
