package practice.testNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class SampleTestforScreenshot {

	
	@Test
	public void amazonTest() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//step-1: create an object to EventFiring webDriver
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		
		//step-2: use getsceenshotas method to get the file type of sceen shots

		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
	
		// store sceenshot in local driver
		FileUtils.copyFile(srcFile, new File("./screenshot/test.png"));
		
	
		
	}
	
}
