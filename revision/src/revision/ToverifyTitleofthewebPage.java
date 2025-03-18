package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyTitleofthewebPage {

	public static void main(String[] args) {
    
    String expectedTitle = "Facebook";
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://wwww.facebook.com/");
    	 			
    	String actualTitle = driver.getTitle();	
    	
    	System.out.println("Actual Title is ====== : "+actualTitle);
    	System.out.println("Expected Title is ======: "+expectedTitle);
    	
    	if(actualTitle.contains(expectedTitle)) {
    		System.out.println("pass :The title is verified");
    	}
    	else
    		System.out.println("fail:The title is not verrified");
	}

}
