package revision;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchthePositionOfBrowserWidow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		int xcoordinate = pos.getX();
		int ycoordinate = pos.getY();
		
		System.out.println("the x coodinate is:"+xcoordinate);
		System.out.println("the y coordinate is :"+ycoordinate);
		
	}

}
