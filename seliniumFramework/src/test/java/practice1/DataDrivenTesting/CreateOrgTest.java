package practice1.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateOrgTest {
	
	
		
		@Test
		public void createOrgtest(XmlTest test) throws FileNotFoundException, IOException, ParseException, InterruptedException {
			
			// read common data from json file
			
			
			JSONParser parser=new JSONParser();
		Object obj = parser.parse(new FileReader("C:\\Users\\HP\\eclipse-workspace\\java basics\\seliniumFramework\\src\\test\\resources\\appCommonData.json"));
			
			// step:2: convert java object in to json object using downcasting
			
			JSONObject map=(JSONObject)obj;
		

		String BROWSER =  test.getParameter("browser");
		String URL=test.getParameter("url");
		String USERNAME=test.getParameter("username");
		String PASSWORD=test.getParameter("password");
		
		//generate random number
		Random random=new Random();
				
				int randomInt = random.nextInt(1500);
				
				
		
		FileInputStream fis1=new FileInputStream("./src/test/resources/data.xlsx");
		// accesss the workbbok using create method
		Workbook workbook = WorkbookFactory.create(fis1);
		
		// access the workbook of getsheet () interface
		Sheet sheet = workbook.getSheet("sheet3");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		 String orgname = cell.getStringCellValue()+randomInt;
		
		
	
		WebDriver driver=null;
		
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
	}else {
		driver=new ChromeDriver();
	}
	
		

		//login to app
		driver.get(URL);
				
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		// navigation to org module
		driver.findElement(By.linkText("Organizations")).click();
		
		//step:3:-click on create organisation button
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		// step4:-enter all the detail and create new organisation
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		// step:-5 :-logout
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		driver.quit();

	}

}
