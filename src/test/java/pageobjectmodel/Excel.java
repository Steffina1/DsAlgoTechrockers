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

public class Excel {
		
		public String sheetname;
		
		
		public Excel(String sheetname) {
			this.sheetname = sheetname;
		}
		
		
		
		
	
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
		System.out.println(rowcount);
		for (int rownum = 1; rownum<=rowcount; rownum++ ) {
			Row excelrow = sheet.getRow(rownum);
			int cellcount = excelrow.getLastCellNum();
			System.out.println(cellcount);
			for(int cellnum =0; cellnum<=cellcount; cellnum++ ) {
				
			Cell excelcell = excelrow.getCell(cellnum);
//			String value = excelrow.getCell(cellnum).getStringCellValue();
//			System.out.println(value);
			
			DataFormatter formatter = new DataFormatter();
			String data = formatter.formatCellValue(excelcell);
			System.out.println(data);
			
			}
			
		} 
		return"";
		}
		public static void main(String[] args) throws IOException {
			exceldata ();

		}

	 
		}





