package practice.test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class GetProductInfoTest {

	@Test(dataProvider="getData")
	public void getProductInfoTest(String brandName, String productName) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandName,Keys.ENTER);
		
		// capture product info
		 String price="//span[text()='"+productName+"']/ancestor::div[contains(@class,'a-sect')]/descendant::span[@class='a-price-whole']";
		 String productprice=driver.findElement(By.xpath(price)).getText();
		 System.out.println(productprice);
		 driver.quit();
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException{
		ExcelUtility eLib=new ExcelUtility();
		int rowCount = eLib.getRowcount("product");
		
		Object[][] objectArr=new Object[rowCount][2];
		
		for(int i=0; i<rowCount; i++) {
			
			objectArr[i][0]=eLib.getDataFromExcel("product", i+1, 0);
			objectArr[i][1]=eLib.getDataFromExcel("product", i+1, 1);	
		}
		return objectArr;
	}
}
