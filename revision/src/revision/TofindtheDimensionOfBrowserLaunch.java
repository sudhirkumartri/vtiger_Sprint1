package revision;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofindtheDimensionOfBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		
		
		int width = dim.getWidth();
		int height = dim.getHeight();
		
		System.out.println("the width of dimension:"+width);
		System.out.println("the height of dimension:"+height);

	}

}
