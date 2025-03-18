package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	
	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement addOpportunitiesButton;

	public WebElement getAddOpportunitiesButton() {
		return addOpportunitiesButton;
	}
	
	public void clickOnAddOpportunitiesButton() {
		addOpportunitiesButton.click();
	}

}
