package Utils;

public class ExcelRequists {

public static void main(String[] args) {
		
		ExcelUtils excel = new ExcelUtils("C:\\Users\\sande\\eclipse-workspace\\RetaxisDemoStore\\"+
		"AddingBulkProducts\\ExcelSheets\\BulkProducts.xlsx","Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 2);
		excel.getCellDataNumber(1, 2);
		excel.getColCount();
	}
}
