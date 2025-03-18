package practice1.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadUltipleDataAllFromExcel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
File file = new File("‪");
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		// accesss the workbbok using create method
		Workbook workbook = WorkbookFactory.create(fis);
		
		// access the workbook of getsheet () interface
		Sheet sheet = workbook.getSheet("Sheet2");
		
		for(int i=1; i<50; i++) {
			
			Row row=sheet.getRow(i);
			
			  
                       
            String colum1Data = row.getCell(0).toString();
            String colum2Data = row.getCell(1).toString();
           
           
           System.out.println(colum1Data+"\t"+colum2Data);
		
		}
		
	}
}
