package pageobjectmodel;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Notneededexcel {
	
//	public String sheetname;
//	public int rownum;
//	public int cellnum;

	
//	public Notneededexcel(String sheetname, int rownum, int cellnum) {
//		this.sheetname = sheetname;
//		this.rownum = rownum;
//		this.cellnum = cellnum;
//	}
//	
	
	public static String exceldata() throws IOException {
		
		
		String path = System.getProperty("user.dir")+"\\Testdata\\api.xlsx";
		File xlfile = new File(path);
		
		FileInputStream read = null;
		try {
			read = new FileInputStream(xlfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	XSSFWorkbook wrkbk = new XSSFWorkbook(read);
	XSSFSheet sheet = wrkbk.getSheet("Sheet1");
	
	int rowcount = sheet.getLastRowNum();
	System.out.println("row count is" +rowcount);
	for (int rownum = 1; rownum<=rowcount; rownum++ ) {
		Row excelrow = sheet.getRow(rownum);
		System.out.println(excelrow.getCell(0).getStringCellValue());
		System.out.println(excelrow.getCell(1).getStringCellValue());
		System.out.println(excelrow.getCell(2).getStringCellValue());
		System.out.println(excelrow.getCell(3).getStringCellValue());
		System.out.println(excelrow.getCell(4).getStringCellValue());
		System.out.println(excelrow.getCell(5).getStringCellValue());
		System.out.println(excelrow.getCell(6).getNumericCellValue());
		System.out.println(excelrow.getCell(7).getStringCellValue());
		System.out.println(excelrow.getCell(8).getStringCellValue());
//		if(rownum<=rowcount) {
//		int cellcount = excelrow.getLastCellNum();
//		System.out.println("cell count is"+cellcount);
//		for(int cellnum =0; cellnum<=cellcount; cellnum++ ) {
//			Cell excelcell = excelrow.getCell(cellnum);
//			if(cellnum<=excelrow.getLastCellNum()) {
//				System.out.println(excelrow.getCell(cellnum).getStringCellValue()); 
//			
//		DataFormatter formatter = new DataFormatter();
//		String celldata = formatter.formatCellValue(excelcell);
		//System.out.println(celldata);
		
		//return celldata;
		
} 
    
    
//		}
//   
//	} 
//	return"";
//	}
	return "";
}

	

public static void main(String[] args) throws IOException {
		exceldata();

	}

}
