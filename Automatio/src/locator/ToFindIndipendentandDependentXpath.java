package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindIndipendentandDependentXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/sk.html");
		WebElement input2 =driver.findElement(By.xpath("//input[@id='testId']/../../td[2]/input"));
		input2.sendKeys("jbcghfjgydy");
		WebElement input3 = driver.findElement(By.xpath("//input[@id='testId']/../../../tr[2]/td[1]/input"));
		input3.sendKeys("ssjjkd");
	}

}
