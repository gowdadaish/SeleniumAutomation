package frameworkselenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("writedemo");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("Aishwarya");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("hello");
		sheet.getRow(1).createCell(1).setCellValue("Aish");
		
		
		File file = new File ("C:\\Users\\91861\\OneDrive\\Desktop\\automation\\excel\\writedemo.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		

		
		

	}

}
