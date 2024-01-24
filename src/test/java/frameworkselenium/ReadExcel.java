package frameworkselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\automation\\excel\\demoexcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		//String  cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
		//String cellvalue2 = sheet.getRow(1).getCell(0).getStringCellValue();
		//String cellvalue3 = sheet.getColumnStyle(1).getStringCellValue();
		//System.out.println(cellvalue + " " + cellvalue2);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		for(int i =0; i< rowCount ; i++){
			XSSFRow row = sheet.getRow(i);
			
		
		int cellCount = row.getPhysicalNumberOfCells();
		for(int j = 0; j<cellCount; j++) {
			XSSFCell cell = row.getCell(j);
			System.out.print("||"+ getCellValue(cell));
		}
		System.out.println();
		

		}	
		
		workbook.close();
		fis.close();
		
	}
	public static String getCellValue(XSSFCell cell) {
		
		switch(cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
			default:
				return cell.getStringCellValue();
		}
		
	}
	}
	

