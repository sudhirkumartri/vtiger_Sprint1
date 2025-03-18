package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseTagname {

	public static void main(String[] args) {
		String expectedHeaderText = "Qspiders";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/Sudhir.html");
		WebElement header = driver.findElement(By.tagName("h1"));
		
		String actualHeaderText = header.getText();
		
		System.out.println(actualHeaderText);
		if(actualHeaderText.contains(expectedHeaderText)) {
			System.out.println("pass:The header is verified");
		}
		else
			System.out.println("fail:The header is vrified");
		driver.quit();
	}

}
