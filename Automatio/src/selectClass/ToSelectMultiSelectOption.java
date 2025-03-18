package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectMultiSelectOption {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//pre-conditon
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//test-case
			driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			WebElement multiselectoption = driver.findElement(By.id("select-multiple-native"));
			Select selectCountry= new Select(multiselectoption);
			boolean multiple =selectCountry.isMultiple();
			if(multiple)
			{
				System.out.println("pass:dropdown is mutiselect");
			}
			else
				System.out.println("fail:dropDown is single select option");
			//post-condition
		}


	}


