  package com.comcast.crm.orgtest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cast.crm.objectrepositoryutility.CreatNewOrganizationsPage;
import com.cast.crm.objectrepositoryutility.HomePage;
import com.cast.crm.objectrepositoryutility.LoginPage;
import com.cast.crm.objectrepositoryutility.OrganizationInformationPage;
import com.cast.crm.objectrepositoryutility.OrganizationsPage;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class DeleteOrgTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		/*Create object*/
				
				FileUtility fLib=new FileUtility();
				
				ExcelUtility eLib=new ExcelUtility();
				
				JavaUtility jLib=new JavaUtility();

				WebDriverUtility wLib=new  WebDriverUtility();
				
				//Read common data from Json file
				String BROWSER=fLib.getDataFromPropertiesFile("browser");
				String URL=fLib.getDataFromPropertiesFile("url");
				String USERNAME=fLib.getDataFromPropertiesFile("username");
				String PASSWORD=fLib.getDataFromPropertiesFile("password");

			
			
			// read testscript data from Excel file
			
			String orgName=eLib.getDataFromExcel("Sheet3", 10, 2)+jLib.getRandomNumber();

			
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
			 LoginPage lp = new LoginPage(driver);  

			lp.loginToApp("admin", "admin");


			// step2:navigation to org module

			HomePage hp=new HomePage(driver);  

			hp.getOrgLink().click();

			//step:3:-click on create organisation button
			OrganizationsPage cnp=new OrganizationsPage(driver);
			cnp.getCreateNewOrgBtn().click();

			// step4:-enter all the detail and create new organisation

			CreatNewOrganizationsPage cnop=new CreatNewOrganizationsPage(driver);
			cnop.createOrg(orgName);

			//VERIFY header nmsg expected result

			OrganizationInformationPage oip=new OrganizationInformationPage(driver);
			       String actorgName = oip.getHeaderMsg().getText();
			       
			       if(actorgName.contains(orgName)) {
			    	   System.out.println(orgName +"name is verified==PASS");
			       } else {
			    	   System.out.println(orgName +"name is NOT  verified==FAIL");
			       }
			       
			        
			       //go back to organizations page
			     
			       hp.getOrgLink().click();
			       // serch for organization
			       cnp.getSearchEdt().sendKeys(orgName);
			       wLib.select(cnp.getSearchDD(), "Organization Name");
			       cnp.getSearchBtn().click();
			       
			       
			       //in dynamic webtable select & delete org
			       
			       driver.findElement(By.xpath("//a[text()='"+orgName+"']/../../td[8]/a[text()='del']")).click(); 

			// step:-5 :-logout
			
			//hp.logout();
		//	driver.quit();

		}
				
			}



