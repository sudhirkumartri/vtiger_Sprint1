package com.cast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatNewOrganizationsPage {
	

	WebDriver driver;
	public CreatNewOrganizationsPage(WebDriver driver) { 
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(name="accountname")
	private WebElement orgNameEdt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(name="industry")
	private WebElement industryDB;

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	public void createOrg(String orgName) {
		orgNameEdt.sendKeys(orgName);
		savebtn.click();
	}
		
		
		
		public void createOrg(String orgName, String industry,String type) {
			orgNameEdt.sendKeys(orgName);
			Select sel=new Select(industryDB);
			sel.selectByVisibleText(industry);// overloading concept
			savebtn.click();
		
	}
	
}
