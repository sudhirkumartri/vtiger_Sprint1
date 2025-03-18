package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUps {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications");
		
		//pre-condition
				WebDriver driver =new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://www.yatra.com/");
				

	}

}
