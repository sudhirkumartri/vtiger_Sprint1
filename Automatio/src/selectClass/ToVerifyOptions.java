package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyOptions{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

		//test-case
		driver.findElement(By.linkText("Create new account")).click();

		WebElement yearDropDown = driver.findElement(By.id("Year"));
		Select selectyear=new Select(yearDropDown);
		List<WebElement> allOptions = selectyear.getOptions();
		int noofOptions = allOptions.size();
		System.out.println("the no. of options in the year dropdown is:"+noofOptions);
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
