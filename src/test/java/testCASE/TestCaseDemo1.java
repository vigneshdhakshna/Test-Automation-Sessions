package testCASE;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import util.Base.TestBase;

public class TestCaseDemo1 extends TestBase{
	
	
	@Test
	public void demoWEB() throws Throwable {
		FileOutputStream fout = new FileOutputStream(Path.fileFromExcelTestData("sample.xlsx"));
		XSSFWorkbook xbook = new XSSFWorkbook();
		XSSFSheet sheet = xbook.createSheet();
		XSSFRow row = sheet.createRow(0);
		String[] headings = {"TestCaseID", "TestCaseName", "Time", "Status", "Location"};
		for (int i = 0; i < headings.length; i++) {
			XSSFCell cell = row.createCell(i);
			cell.setCellValue(headings[i]);
		}
		
		
		xbook.write(fout);
		xbook.close();
		
	}
	
	

}
