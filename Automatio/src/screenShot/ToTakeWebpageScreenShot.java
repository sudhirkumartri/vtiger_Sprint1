package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeWebpageScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		WebElement fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		//First we have to downcast the driver reference to screenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call the get screenshot As()and outputType .file as a 
		File source = fbLogo.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\HP\\Desktop\\sample\\faceBookLogo.png");
		Files.copy(source, destination);
		
		
		
	}
}
