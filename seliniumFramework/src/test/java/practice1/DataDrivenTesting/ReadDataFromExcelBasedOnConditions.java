package practice1.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelBasedOnConditions {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        
		String expectedTestId="tc_02";
		String data1="";
		String data2="";
		String data3="";

		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		// accesss the workbbok using create method
		Workbook workbook = WorkbookFactory.create(fis);
		
		// access the workbook of getsheet () interface
		Sheet sheet = workbook.getSheet("Sheet3");
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=0; i<=rowcount; i++) {
			String data= "";
			try {
			
			 data=sheet.getRow(i).getCell(0).toString();
			 if(data.equals(expectedTestId)) {
				 data1=sheet.getRow(i).getCell(1).toString();
				 data2=sheet.getRow(i).getCell(2).toString();
				 data3=sheet.getRow(i).getCell(3).toString();

			 }
			} catch(Exception e) {}
		}
			System.out.println(data1);
			
			System.out.println(data2);
			System.out.println(data3);

			
		
		workbook.close();
		
	}

}
