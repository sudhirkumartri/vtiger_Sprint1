 package com.cast.crm.objectrepositoryutility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Sudhir
 * contains Login page elements&bussiness lib like login() 
 * 
 */

public class LoginPage extends WebDriverUtility{//rule 1: create a seprate java class
	
	// Rile:-2 object Creation
	WebDriver driver;
	public LoginPage(WebDriver driver) { //rule3: object initialization
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="user_name")
	 private WebElement usernameEdt;
	

	@FindBy(name="user_password")
private WebElement passwordEdt;
	

	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	
	
		//rule:-4:-object Encasulation

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}


	public WebElement getPasswordEdt() {
		return passwordEdt;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	/**
	 * login to appplication based username,password, url arguments
	 * @param url
	 * @param username
	 * @param password
	 */
	
	//Rule5:-provide Action
	
	public void loginToApp(String url, String username, String password) {
		waitForToLoad(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.manage().window().maximize();
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
	public void loginToApp(String username,String password) {
		driver.manage().window().maximize();
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
}
