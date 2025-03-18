package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyTheSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		//pre-conditon
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//test-case
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement multiSelectDropDown= driver.findElement(By.id("select-multiple-native"));
		Select selectCountry= new Select(multiSelectDropDown);
		
		selectCountry.selectByVisibleText("China");
		Thread.sleep(2000);
		
		selectCountry.selectByVisibleText("Poland");
		Thread.sleep(2000);
		
		selectCountry.selectByVisibleText("Canada");
		Thread.sleep(2000);
		
		List<WebElement> allselctedoption = selectCountry.getAllSelectedOptions();
		int noofSelectedOptionAre = allselctedoption.size();
		System.out.println("The no. of selected option are:"+noofSelectedOptionAre);
		String firstselected = selectCountry.getFirstSelectedOption().getText();
		System.out.println("the 1st selected option is:"+firstselected);
		System.out.println("============================================");
		
		
		System.out.println("the all option are");
		for(WebElement option: allselctedoption)
		{
			System.out.println(option.getText());
		}
		//post-condtion
		driver.quit();
}


	}


