package vtiger.pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.genericUtility.WebDriverUtility;

public class CreatingOpportunityPage {
	WebDriver driver;
	
	public CreatingOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name="potentialname")
	private WebElement opportunityNameTextField;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement organizationLookUpButton;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement campaignLookUpButton;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement opportunitySaveButton;
	
	@FindBy(name="search_text")
	private WebElement organizationLookUpPageSearchTextField;
	
	@FindBy(name="search")
	private WebElement organizationLookUpPageSearchButton;
	
	@FindBy(name="search_text")
	private WebElement campaignLookUpPageSearchTextField;
	
	@FindBy(name="search")
	private WebElement campaignLookUpPageSearchButton;

	public WebElement getOpportunityNameTextField() {
		return opportunityNameTextField;
	}

	public WebElement getOrganizationLookUpButton() {
		return organizationLookUpButton;
	}

	public WebElement getCampaignLookUpButton() {
		return campaignLookUpButton;
	}

	public WebElement getOpportunitySaveButton() {
		return opportunitySaveButton;
	}

	public WebElement getOrganizationLookUpPageSearchTextField() {
		return organizationLookUpPageSearchTextField;
	}

	public WebElement getOrganizationLookUpPageSearchButton() {
		return organizationLookUpPageSearchButton;
	}

	public WebElement getCampaignLookUpPageSearchTextField() {
		return campaignLookUpPageSearchTextField;
	}

	public WebElement getCampaignLookUpPageSearchButton() {
		return campaignLookUpPageSearchButton;
	}

	public void enterOpportunityName(String opportunityName) {
		opportunityNameTextField.sendKeys(opportunityName);
	}
	
	public void clickOnOrganizationLookUpPageSearchResult(String organizationName) {
		driver.findElement(By.xpath("//a[text()='"+organizationName+"']")).click();
	}
	
	public void clickOnCampaignLookUpPageSearchResult(String campaignName) {
		driver.findElement(By.xpath("//a[text()='"+campaignName+"']")).click();
	}
	
	public void selectOrganizationNameFromOrganizationLookUpPage(String titleToSwitch, String organisationName) {
		String parentWindowTitle = driver.getTitle();
		organizationLookUpButton.click();
		
		WebDriverUtility wUtiles = new WebDriverUtility();
		wUtiles.switchToWindow(driver, titleToSwitch);
		
		organizationLookUpPageSearchTextField.sendKeys(organisationName);
		organizationLookUpPageSearchButton.click();
		
		clickOnOrganizationLookUpPageSearchResult(organisationName);
		 wUtiles.switchToWindow(driver, parentWindowTitle);
	}
	
	public void selectCampaignNameFromCampaignLookUpPage(String titleToSwitch, String campaignName) {
		String parentWindowtitile = driver.getTitle();
		campaignLookUpButton.click();
		
		WebDriverUtility wUtiles = new WebDriverUtility();
		wUtiles.switchToWindow(driver,  titleToSwitch);
		
		campaignLookUpPageSearchTextField.sendKeys(campaignName);
		campaignLookUpPageSearchButton.click();
		
		clickOnCampaignLookUpPageSearchResult(campaignName);
		wUtiles.switchToWindow(driver, parentWindowtitile);
	}
	
	public void clickOnSaveButton() {
		opportunitySaveButton.click();
	}

}
