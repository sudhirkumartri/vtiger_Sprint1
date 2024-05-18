package vitiger.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
public String fetchStringDataFromExcelSheet(String SheetName, int rowNO, int cellNO) throws Exception {
	FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\vtiger\\src\\test\\resources\\TestData\\sudhir123.xlsx");
	return WorkbookFactory.create(fis).getSheet(SheetName).getRow(rowNO).getCell(cellNO).getStringCellValue();
}

	public long fetchNumericDataFromExcelSheet(String sheetName, int rowNo,int cellNo) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\vtiger\\src\\test\\resources\\TestData\\sudhir123.xlsx");
		return (long) WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();

	}

	public boolean fetchBooleanDataFromExcelSheet(String sheetName,int rowNO,int cellNo) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\vtiger\\src\\test\\resources\\TestData\\sudhir123.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNO).getCell(cellNo).getBooleanCellValue();
	}
}

