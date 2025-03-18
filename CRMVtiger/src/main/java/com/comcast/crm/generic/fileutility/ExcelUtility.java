package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcel(String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\CRMVtiger\\testData\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		return data;
	}
	
	public int getRowcount(String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\CRMVtiger\\testData\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int rowcount = wb.getSheet(sheetName).getLastRowNum();
		return rowcount;
	}
	
	public void setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\CRMVtiger\\testData\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\java basics\\CRMVtiger\\testData\\data.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}
	

}