package webDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyDimension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		Dimension dim = new Dimension(300,1000);
		Thread.sleep(2000);
		  driver.manage().window().setSize(dim);
	}

}
