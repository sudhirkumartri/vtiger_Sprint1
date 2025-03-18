package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Desktop/Sudhir.html");
		
		driver.findElement(By.tagName("input")).sendKeys("admin");
		// upper waler text may our add ho jaye ga change nahi hoga jeseki ======admindamin1
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin1");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		
		//post-condition
		//driver.quit();

}

}
