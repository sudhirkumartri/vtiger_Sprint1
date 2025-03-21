package vtiger.genericUtility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.LoginPage;
@Listeners(vtiger.genericUtility.ItestListenrsImplementationClass.class)
public class BaseClass {
	
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	public JavaUtility jUtils = new JavaUtility();
	public WebDriverUtility wUtils = new WebDriverUtility();
	public static WebDriver sDriver;
	public Connection connection;
	
	@BeforeSuite
	public void bs() throws SQLException {
		/*Driver dbDriver = new Driver();
		DriverManager.registerDriver(dbDriver);
		connection = DriverManager.getConnection(IPathConstant.DB_URL, IPathConstant.DB_USERNAME, IPathConstant.DB_PASSWORD);
		System.out.println("Data base connection is achieved");*/
	}
	
	@BeforeClass
	public void bc() throws IOException {
		String browser = fUtils.fetchDataFromPropertyFile("browser");
		String url = fUtils.fetchDataFromPropertyFile("url");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
	}
		
		wUtils.maximizeTheWindow(driver);
		wUtils.waitForPageToLoad(driver);
		driver.get(url);
		System.out.println("The Browser is launched");
		sDriver = driver;
		
	}
	
	
	@BeforeMethod
	public void bm() throws IOException {
		String username = fUtils.fetchDataFromPropertyFile("username");
		String password = fUtils.fetchDataFromPropertyFile("password");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("The user has logged in");
	
		
	}
	
	@AfterMethod
	public void am() {
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("The user has logged out");
	}
	
	@AfterClass
	public void ac() {
		driver.quit();
		System.out.println("The browser is closed");
	}
	
	@AfterSuite
	public void as() throws SQLException {
		/*connection.close();
		System.out.println("The Data base is Closed");*/
	}

}
