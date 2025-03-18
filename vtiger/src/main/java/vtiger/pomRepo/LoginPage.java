package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is an object repository for Login Page
 * @author Rikki Panwar
 *
 */

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	private WebElement username_Textfield;

	@FindBy(name = "user_password")
	private WebElement password_Textfield;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	

	public WebElement getUsername_Textfield() {
		return username_Textfield;
	}

	public WebElement getPassword_Textfield() {
		return password_Textfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * This method is used login an user
	 * @param username
	 * @param password
	 */
	public void loginAction(String username, String password) {
		username_Textfield.sendKeys(username);
		password_Textfield.sendKeys(password);
		loginButton.click();
		
	}

}
