package selectClass;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOption {

	public static void main(String[] args) throws InterruptedException {
		
		String optionToCheck="1807";
		boolean flag=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Create new account")).click();

		WebElement yearDropdown = driver.findElement(By.id("year"));

		Select selectYear = new Select(yearDropdown);
		List<WebElement> allOptions = selectYear.getOptions();
		
		int noOfOptions = allOptions.size();
		
		System.out.println("The no of options in the year drop down is : "+noOfOptions);
		
		for(WebElement option:allOptions) {
			//System.out.println(option.getText());
			
			if(option.getText().equals(optionToCheck)) {
				flag=true;
				break;
			}
			

		}
		
		if(flag) {
			System.out.println(optionToCheck+" is present");
		}
		
		else
			System.out.println(optionToCheck+" is not present");

		
	}
	}


