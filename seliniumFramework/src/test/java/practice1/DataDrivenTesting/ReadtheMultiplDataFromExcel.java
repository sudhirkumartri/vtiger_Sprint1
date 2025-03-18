package practice1.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadtheMultiplDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
	File file = new File("‪");
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		// accesss the workbbok using create method
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("sheet2");
		
            Row row = sheet.getRow(1);
            
            
             String colum1Data = row.getCell(0).toString();
            
             String colum2Data = row.getCell(1).toString();
            
            
            System.out.println(colum1Data+"\t"+colum2Data);
		
		
	}

}
