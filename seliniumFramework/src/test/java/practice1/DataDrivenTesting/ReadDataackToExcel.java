package practice1.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataackToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		// accesss the workbbok using create method
		Workbook workbook = WorkbookFactory.create(fis);
		
		// access the workbook of getsheet () interface
		Sheet sheet = workbook.getSheet("Sheet3");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.createCell(4);
		
		cell.setCellType(CellType.STRING);
		cell.setCellValue("FAIL");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("=====executed======");
	}

}
