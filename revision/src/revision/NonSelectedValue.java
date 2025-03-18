package revision;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NonSelectedValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		WebElement countrydd = driver.findElement(By.id("select3"));
		Select select  =new Select(countrydd);
		Thread.sleep(2000);
		select.selectByValue("India");
		List<WebElement> allOptions = select.getOptions();
		//List<WebElement> nonselectedOption = new ArrayList<WebElement>();
		
		for(WebElement option : allOptions) {
			if(!option.isSelected()) {
				//nonselectedOption.add(option);
				System.out.println(option.getText());
			}
		}
			
	/**		System.out.println("Non Selected Options:");
		for(WebElement option : nonselectedOption) {
			System.out.println(option.getText());
		}**/
		
		driver.close();	

	}

}
