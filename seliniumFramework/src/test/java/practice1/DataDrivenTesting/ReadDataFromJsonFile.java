package practice1.DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		// parse json physical file into java object using jsonParse file
		
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(new FileReader("C:\\Users\\HP\\eclipse-workspace\\java basics\\seliniumFramework\\src\\test\\resources\\appCommonData.json"));
		
		// step:2: convert java object in to json object using downcasting
		
		JSONObject map=(JSONObject)obj;
		// get the value from json file using key
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("timeout")); 
		
	}

}
