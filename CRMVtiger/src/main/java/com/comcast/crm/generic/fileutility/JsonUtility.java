package com.comcast.crm.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	
	public String getDataFromJsonFile(String key) throws IOException, ParseException {
		
		FileReader fileR=new FileReader("./confiAppData/appCommonData.json");		
				JSONParser parser=new JSONParser();
				Object obj = parser.parse(fileR);
				JSONObject map=(JSONObject)obj;
				String data=(String)map.get(key);
				return data;
				
				
				
				
			}
	}


