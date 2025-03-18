package revision;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyTheDimension {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Dimension dim = new Dimension(2000,3000);
		driver.manage().window().setSize(dim);
		
	}

}
