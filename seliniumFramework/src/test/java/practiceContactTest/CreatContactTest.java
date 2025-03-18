package practiceContactTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatContactTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		// read common data from properties  file
		
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
	Sheet sheet = workbook.getSheet("contact"); 
	Row row = sheet.getRow(1);
	String lastName = row.getCell(2).toString()+randomInt;
	
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
	// step2:navigation to contact module
	driver.findElement(By.linkText("Contacts")).click();
	
	//step:3:-click on create organisation button
	
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	// step4:-enter all the detail and create new organisation
	driver.findElement(By.name("lastname")).sendKeys(lastName);
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
	//VERIFY header phonenumber expected result
	Thread.sleep(2000);
	
	boolean actlastName = driver.findElement(By.id("mouseArea_Last Name")).getText().contains(lastName);
	if(actlastName) {
		System.out.println(lastName + "is created==PASS");
	} else {
		System.out.println(lastName + "is not created==FAIL");

	}
	
	// step:-5 :-logout
	driver.quit();

}


		
	}


