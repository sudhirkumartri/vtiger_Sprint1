package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContains {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust')]"));
		String paragraphText = para.getText();
		System.out.println(paragraphText);
		
	}

}
