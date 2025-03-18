package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment_issue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
	    WebElement password = driver.findElement(By.id("password"));
	    Thread.sleep(1000);
	    Point emailpos = email.getLocation();
	    Point passwordpos = password.getLocation();
	    int emailxcoordinate = emailpos.getX();
	    int paswordcoordinate = passwordpos.getY();
	    if(emailxcoordinate==paswordcoordinate)
	    {
	    	System.out.println("pass:The allignment issue is verified");
	    	
	    }
	    else
	    	System.out.println("fail:The allignment issue is not verified");
	    driver.quit();
	    
	}
    
}
