package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.getCause();
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,3);
		getCellDataNumber(1,3);
		
	}
	public static int getRowCount() {
		
		int rowCount = 0;
		try {
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No.of Rows : "+rowCount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	return rowCount;
	}
public static int getColCount() {
		
		int colCount = 0;
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No.of Columns : "+colCount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	return colCount;
	
	}
	
	public static double getCellDataNumber(int rowNum,int colNum) {
		double CellData = 0;
		try {
			CellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();	
		//	System.out.println(CellData);
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.getCause();
				e.printStackTrace();
			}
		return CellData;
	}
	public static String getCellDataString(int rowNum,int colNum) {
		String CellData =null;
		try {
			CellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(CellData);
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.getCause();
				e.printStackTrace();
			}
		return CellData;
	}
}
