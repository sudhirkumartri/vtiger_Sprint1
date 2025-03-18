package revision;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimention {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		int witdth = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("The width is:"+witdth);
		System.out.println("The height is:"+ height);
		
	}

}
