package excel.tests;

import com.excel.lib.util.Xls_Reader;

public class ExcelUtilTest {
	
	public static void main(String[] args) {
		
	
		Xls_Reader reader = new Xls_Reader("C:\\Users\\p-venkataramanaiah\\eclipse-workspace\\FSPageObjectModel\\src\\test\\java\\com\\excel\\lib\\util\\SampleExcel.xlsx");
										   
		System.out.println("Excel path Reached");
		
		String sheetName = "Sheet1";
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println("Value from Excel:" + data);
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("Row Count is :" + rowCount);
		
		int columnCount = reader.getColumnCount(sheetName);
		System.out.println("Column Count is :" + columnCount );
		
//		Add new column in the Excel File
//        reader.addColumn(sheetName, "Result");	
//        System.out.println("New Coulmn is added Successfully");
        
        
//		Add new Sheet in the Excel File
		if(! reader.isSheetExist("Registrations")) {
		 boolean sheetadd = reader.addSheet("Registrations");
	     System.out.println("Sheet added successfully : " + sheetadd);
		}
		
//		Write the data in the Excel File
		reader.setCellData(sheetName, "Result", 4, "PASS");
		
		
		
	}
	

	

}
