package revision;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToModifyDiamension {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		 Dimension dim = new Dimension(2000,1000);
	driver.manage().window().setSize(dim);
	}

}
