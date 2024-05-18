package vitiger.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String fetchDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\vtiger\\src\\test\\resources\\TestData\\ProperpertyFile.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}
	
}
