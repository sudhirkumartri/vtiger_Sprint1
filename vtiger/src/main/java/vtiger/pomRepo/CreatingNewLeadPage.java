package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	
	public CreatingNewLeadPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="salutationtype")
	private WebElement leadSalutationDropDown;

	@FindBy(name="firstname")
	private WebElement leadFirstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement leadLastNameTextField;
	
	@FindBy(name="company")
	private WebElement leadCompanyNameTextField;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement leadSaveButton;

	public WebElement getLeadSalutationDropDown() {
		return leadSalutationDropDown;
	}

	public WebElement getLeadFirstNameTextField() {
		return leadFirstNameTextField;
	}

	public WebElement getLeadLastNameTextField() {
		return leadLastNameTextField;
	}

	public WebElement getLeadCompanyNameTextField() {
		return leadCompanyNameTextField;
	}

	public WebElement getLeadSaveButton() {
		return leadSaveButton;
	}
	
	public void selectFromLeadSalutationDropDown(String Salutation) {
		 Select select = new Select(leadSalutationDropDown);
		 select.selectByVisibleText(Salutation);
	}
	
	public void enterLeadFirstName(String leadFirstName) {
		leadFirstNameTextField.sendKeys(leadFirstName);
	}
	
	public void enterleadLastName(String leadLastName) {
		leadLastNameTextField.sendKeys(leadLastName);
	}
	
	public void enterLeadCompanyName(String leadCompanyName) {
		leadCompanyNameTextField.sendKeys(leadCompanyName);
	}
	
	public void clickOnSaveButton() {
		leadSaveButton.click();
	}
	

}
