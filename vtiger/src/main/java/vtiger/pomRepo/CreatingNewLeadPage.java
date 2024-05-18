package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="salutationtype")
	private WebElement leadSalutationDropDown;
	
	
	@FindBy(name="firstname")
	private WebElement leadFirstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement leadLastNameTextField;
	
	
	@FindBy(name="company")
	private WebElement leadCompanyNameTextfield;
	

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement leadSaveButton;

	public WebElement getLeadSalutationDropdown() {
		return leadSalutationDropDown;
	}

	public WebElement getLeadFirstnameTextfield() {
		return leadFirstNameTextField;
	}

	public WebElement getLeadLastnameTextfield() {
		return leadLastNameTextField;
	}

	public WebElement getLeadCompanynameTextfield() {
		return leadCompanyNameTextfield;
	}

	public WebElement getLeadSaveButton() {
		return leadSaveButton;
	}
	
	public void selectFromSalutationDropdown(String salutation) {
		Select select=new Select(leadSalutationDropDown);
		select.selectByVisibleText(salutation);
	}
		
		public void enterLeadFirstName(String leadFirstName) {
			leadFirstNameTextField.sendKeys(leadFirstName);
		}
		
		public void enterLeadLastName(String leadLastName) {

			leadLastNameTextField.sendKeys(leadLastName);
		}

		public void enterLeadCompanyName(String leadCompanyName) {

			leadCompanyNameTextfield.sendKeys(leadCompanyName);
		}

		public void clickOnSaveButton() {
			leadSaveButton.click();
		}

	}


