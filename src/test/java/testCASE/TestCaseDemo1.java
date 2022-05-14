package testCASE;

import org.testng.annotations.Test;

import util.Base.TestBase;
import util.Data.ExcelUtil;

public class TestCaseDemo1 extends TestBase{
	
	
	@Test
	public void demoWEB() {
		String path = Path.fileFromExcelTestData("sample.xlsx");
		ExcelUtil excelUtil = new ExcelUtil (path) ;

	}
	
	

}
