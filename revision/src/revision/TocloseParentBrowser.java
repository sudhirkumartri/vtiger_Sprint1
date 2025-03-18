package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TocloseParentBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
		//driver.quit();
driver.close();
	}

}
