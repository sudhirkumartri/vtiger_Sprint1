package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	@FindBy(name="user_name")
	private WebElement username_textfield;
	
	
	@FindBy(name="user_password")
	private WebElement password_textfield;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	public WebElement getUsername_textfield() {
		return username_textfield;
	}

	public WebElement getPassword_textfield() {
		return password_textfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}


	public void loginAction(String username,String password) {
		username_textfield.sendKeys(username);
		password_textfield.sendKeys(password);
		loginButton.click();
	}
		
	}
