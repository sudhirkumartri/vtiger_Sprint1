package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		//pre-condition
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//test-condition
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(4000);
		//driver.switchTo().frame(0);	
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(outerFrame);
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("Manager");
		Thread.sleep(4000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(email);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		String question1 = driver.findElement(By.xpath("//p[text()='Write a script to handle frames in a webpage?']")).getText();
		System.out.println(question1);
		driver.quit();
	}


}
