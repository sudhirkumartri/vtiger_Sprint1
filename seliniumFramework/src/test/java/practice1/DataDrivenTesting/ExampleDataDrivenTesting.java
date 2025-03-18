package practice1.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExampleDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		
		//step1: get the java representation object of the physical file 
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\commondata.properties.txt");
		
		// step 2: using properties class
		
		Properties prop=new Properties();
		prop.load(fis);
		
		//Fetching the value using the key
				String browserVar = prop.getProperty("browser");
				System.out.println(browserVar);
				
				String urlVar=prop.getProperty("url");
				System.out.println(urlVar);
				
				
				String emailVar=prop.getProperty("email");
				System.out.println(emailVar);
				
				String passwordVar=prop.getProperty("password");
				System.out.println(passwordVar);

	}

}
