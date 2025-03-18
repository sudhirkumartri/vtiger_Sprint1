package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCoordinates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		int xcoordinates = pos.getX();
		int ycoordinates = pos.getY();
		System.out.println("the x coordinates is="+xcoordinates);
		System.out.println("the y coordinates is="+ycoordinates);

		
		
	}

}
