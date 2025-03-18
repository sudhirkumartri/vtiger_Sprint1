package com.cast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) { 
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText="Organizations")
	
	private WebElement orgLink;
	
	@FindBy(linkText="Contacts")
	
	private WebElement contactsLink;
	

	@FindBy(linkText="Campaigns")
	
	private WebElement campaignLink;
	
	
	@FindBy(linkText="More")
	
	private WebElement MoreLink;
	
	

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	
	private WebElement adminImg;
	
	

	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	
	
	
	
	

	public WebElement getOrgLink() {
		return orgLink;
	}


	public WebElement getContactLink() {
		return contactsLink;
	}
	
	public WebElement getCampaignLink() {
		return campaignLink;
	}


	
	public WebElement getMoreLink() {
		return MoreLink;
	}


	public void navigateToCampaignPage() {
		
		Actions act=new Actions(driver);
		
		act.moveToElement(MoreLink).perform();
		campaignLink.click();
	}
	
	public void logout() throws InterruptedException {
		
		Actions act=new Actions(driver);
		act.moveToElement(adminImg).perform();
		Thread.sleep(2000);
		//adminImg.click();
		signOutLink.click();
	}
	
}
