package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		//pre-condition
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
  
		//test-condition
		//Alert-condition
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		
		//Confirmation popUp
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		//prompt popUp
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		String alertMessage = alert.getText();
		alert.sendKeys("yes");
		alert.accept();
		System.out.println("This is alert message:"+alertMessage);
		Thread.sleep(2000);
		
		//post-condition
		//driver.quit();

       }

	}


