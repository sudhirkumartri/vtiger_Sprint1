package revision;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setcordinate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		Point newpos = new Point(100,300);
		
		driver.manage().window().setPosition(newpos);
	}

}
