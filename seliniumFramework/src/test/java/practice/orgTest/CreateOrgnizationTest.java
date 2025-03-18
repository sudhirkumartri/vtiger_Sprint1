package practice.orgTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class CreateOrgnizationTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		 
		
					// read common data from json file
					
					FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\seliniumFramework\\src\\test\\resources\\commondata.properties");
					
					Properties prop=new Properties();
					prop.load(fis);
					
					String BROWSER=prop.getProperty("browser");
					String URL=prop.getProperty("url");

					String USERNAME=prop.getProperty("username");

					String PASSWORD=prop.getProperty("password");

				//generate random number
				Random random=new Random();
						int randomInt = random.nextInt(1500);
				FileInputStream fis1=new FileInputStream("./src/test/resources/data.xlsx");
				// accesss the workbbok using create method
				Workbook workbook = WorkbookFactory.create(fis1);
				
				// access the workbook of getsheet () interface
				Sheet sheet = workbook.getSheet("sheet3");
				
				Row row = sheet.getRow(1);
				String orgName = row.getCell(2).toString()+randomInt;
				workbook.close();
				
			
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
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(URL);
						
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				// navigation to org module
				driver.findElement(By.linkText("Organizations")).click();
				
				//step:3:-click on create organisation button
				
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				// step4:-enter all the detail and create new organisation
				driver.findElement(By.name("accountname")).sendKeys(orgName);
				driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
				//VERIFY header nmsg expected result
				String headerinfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText(); 
				if(headerinfo.contains(orgName)) {
					System.out.println(orgName + "is created==PASS");
				} else {
					System.out.println(orgName + "is not created==FAIL");

				}
				// verify header orgName info Expected 
				String actOrgName = driver.findElement(By.id("dtlview_Organization ")).getText();
				if(actOrgName.equals(orgName)) {
					System.out.println(orgName + "is created==PASS");
				} else {
					System.out.println(orgName + "is not created==FAIL");

				}
				
				// step:-5 :-logout
				Thread.sleep(2000);
				Actions action=new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
				
				driver.quit();

			}

		

	}


