package com.cast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreatingNewContactPage {

	WebDriver driver;

	public CreatingNewContactPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "lastname")
	private WebElement lastNameTextField;

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	@FindBy(xpath = "//input[@class='crmButton small save']")
	private WebElement saveBtn;

	public WebElement saveBtn() {
		return saveBtn;
	}

	public void createContact(String lastname) {
		lastNameTextField.sendKeys(lastname);
		saveBtn.click();
	}

	@FindBy(name="support_start_date")
	private WebElement startDateTextfield;

	public WebElement getStartDateTextfield() {
		return startDateTextfield;
	}

	@FindBy(name="support_end_date")
	private WebElement endDateTextfield;

	public WebElement getEndDateTextfield() {
		return endDateTextfield;
	}
	
	@FindBy(xpath = "//input[@name='account_name']/..//img")
	private WebElement orglookupicon;
	
	public WebElement getOrgLookupIcon()
	{
		return orglookupicon;
	}
	
	//WebElement Related New Organization Window
	@FindBy(id="search_txt")
	private WebElement searchtextfield;
	
	public WebElement getSearchTextField()
	{
		return searchtextfield;
	}
	
	@FindBy(name="search")
	private WebElement searchnowbtn;
	
	public WebElement getSearchNowBtn()
	{
		return searchnowbtn;
	}
	
	
	
	
	public void CreateContactWithSupportDate(String lastName, String startDate, String endDate)
	{
		getLastNameTextField().sendKeys(lastName);
		getStartDateTextfield().clear();
		getStartDateTextfield().sendKeys(startDate);
		getEndDateTextfield().clear();
		getEndDateTextfield().sendKeys(endDate);
		
		//click on save button
		saveBtn().click();
	}
	
	public void createContactWithOrg(String contactLastName, String orgName)
	{
		getLastNameTextField().sendKeys(contactLastName);
		
		//click on organization lookup icon
		getOrgLookupIcon().click();
		
		//Switch to new window
		String newwintext = "module=Accounts&action=Popup&popup";
		
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.switchToOnURL(driver, newwintext);
		
		//insert organization name
		getSearchTextField().sendKeys(orgName);
		searchnowbtn.click();
		
		//click on organization name
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		
		//Switch to parent window
		String parentwintext = "module=Contacts&action=EditView";
		wlib.switchToOnURL(driver, parentwintext);
		
		//click on save button
		saveBtn().click();
		
	}

}
