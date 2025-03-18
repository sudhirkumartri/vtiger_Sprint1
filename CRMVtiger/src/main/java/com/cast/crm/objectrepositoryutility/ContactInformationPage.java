package com.cast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	
	WebDriver driver;
	public ContactInformationPage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

   @FindBy(id="mouseArea_Organization Name")
   private WebElement organizationnametext;
   
   public WebElement getOrganizationNameText()
   {
	   return organizationnametext;
   }
   
   @FindBy(className = "dvHeaderText")
   private WebElement headertext;
   
   public WebElement getHeaderText()
   {
	   return  headertext;
   }
	
}
