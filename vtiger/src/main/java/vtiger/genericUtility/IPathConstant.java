package vtiger.genericUtility;

public interface IPathConstant {
	
		String PROPERTY_FILE_PATH = ".\\src\\test\\resources\\testData\\propertyData.properties";
		String EXCEL_FILE_PATH = ".\\src\\test\\resources\\testData\\ExcelData.xlsx";
		
		int EXPLICIT_WAIT = 20;
		int IMPLICIT_WAIT = 20;
		
		String LEAD_SHEET_NAME = "Leads";
		String ORGANIZATION_SHEET_NAME = "Organizations";
		String CAMPAIGN_SHEET_NAME = "Campaign";
		String OPPROTUNITY_SHEET_NAME = "Opportunity";
		
		String DB_URL = "jdbc:mysql://localhost:3306/vtiger";
		String DB_USERNAME = "root";
		String DB_PASSWORD = "root";
				
}
