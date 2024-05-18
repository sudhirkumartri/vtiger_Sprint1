package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
	
}
public WebDriver getDriver() {
	return driver;
}
@FindBy(linkText="Leads")
private WebElement leadsLink;

@FindBy(linkText="Organizations")
private WebElement organisationLink;

@FindBy(linkText="Contacts")
private WebElement contactsLink;

@FindBy(linkText="Products")
private WebElement productLink;

@FindBy(linkText="More")
private WebElement moreDropDown;

@FindBy(linkText="Campaigns")
private WebElement campaignLink;

@FindBy(linkText="Opportunities")
private WebElement opportunitiesLink;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement administraterIcon;

@FindBy(linkText="Sign Out")
private WebElement signoutLink;

//getter method

public WebElement getLeadsLink() {
	return leadsLink;
}

public WebElement getOrganisationLink() {
	return organisationLink;
}

public WebElement getContactsLink() {
	return contactsLink;
}

public WebElement getProductLink() {
	return productLink;
}

public WebElement getMoreDropDown() {
	return moreDropDown;
}

public WebElement getCampaignLink() {
	return campaignLink;
}

public WebElement getOpportunitiesLink() {
	return opportunitiesLink;
}

public WebElement getAdministraterIcon() {
	return administraterIcon;
}

public WebElement getSignoutLink() {
	return signoutLink;
}

public void ClickOnLeadModule() {
	leadsLink.click();
}
public void ClickOnOrganisationsModule() {
	organisationLink.click();
}
public void ClickOnProductModule() {
	productLink.click();
}
public void clickOnCampaignModule() {

	Actions action = new Actions(driver);
	action.moveToElement(moreDropDown).perform();
	action.click(campaignLink).perform();
}


public void logoutAction() {

	Actions action = new Actions(driver);
	action.moveToElement(administraterIcon).perform();
	action.click(signoutLink).perform();
}
public void clickOnOpportunitiesModule() {
	opportunitiesLink.click();
	
}


}
