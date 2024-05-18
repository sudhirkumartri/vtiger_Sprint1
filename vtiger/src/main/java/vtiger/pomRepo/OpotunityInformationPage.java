package vtiger.pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OpotunityInformationPage {

	
	WebDriver driver;
	public OpotunityInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	public String verifyOpportunityInformation(String opportunityName) {
		return driver.findElement(By.xpath("//span[contains(text(), '"+opportunityName+"')]")).getText();
	}

}
