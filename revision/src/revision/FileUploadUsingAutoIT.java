package revision;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:/Users/HP/Desktop/fileupload.exe");


	}

}
