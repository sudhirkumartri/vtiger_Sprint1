package practice1.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		// accesss the workbbok using create method
		Workbook workbook = WorkbookFactory.create(fis);
		
		// access the workbook of getsheet () interface
		Sheet sheet = workbook.getSheet("sheet1");
		
		Row row = sheet.getRow(2);
		
		// access the cell
		
		
		Cell cell = row.getCell(2);
		
		// access the data depending upon data type
		
		
		 String condidatename = cell.getStringCellValue();
		
		System.out.println( condidatename);
		
		 long phoneNumber = (long)row.getCell(3).getNumericCellValue();
		 
		 System.out.println(phoneNumber);
		 
		 boolean condidaterStatus = row.getCell(4).getBooleanCellValue();
		 
		 System.out.println(condidaterStatus);
		 
				if(condidaterStatus) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
		

	}

}
