package revision;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchThePositionofBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Point pos = driver.manage().window().getPosition();
		int Xcoordinate = pos.getX();
		int ycoordinate = pos.getY();
		System.out.println("The cordinate is x cordinate:"+Xcoordinate);
		System.out.println("The coordinate is y coordnate:"+ycoordinate);
	}

}
