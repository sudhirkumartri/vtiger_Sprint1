package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlapping_issue {
        public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/login");
			Thread.sleep(2000);
			//test-case
			WebElement email = driver.findElement(By.id("email"));
			
			WebElement password = driver.findElement(By.id("password"));
			Thread.sleep(2000);
			Rectangle emailRect = email.getRect();
			Rectangle passwordRect=password.getRect();
			int emailStarty = emailRect.getY();
			int emailHeight = emailRect.getHeight();
			 int emailEndy = emailStarty+emailHeight;
			 int passwordStarty = passwordRect.getY();
			 if(emailEndy<=passwordStarty) {
				 System.out.println("pass:overlapping issue");
				 
			 }
			 else
				 System.out.println("fail:overlapping issue is not present");
			 driver.quit();
		}
}
