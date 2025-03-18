package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimension {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension dim = driver.manage().window().getSize();
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("the width is:"+width);
		System.out.println("the height is:"+height);
		
	}

}
