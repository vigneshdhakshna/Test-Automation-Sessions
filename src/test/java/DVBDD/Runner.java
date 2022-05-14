package DVBDD;

import org.testng.annotations.Test;

import util.Base.TestBase;
import util.Common.SeleniumUtil;

public class Runner extends TestBase{
	
	@Test()
	public void test1() {
		String webURL ="https://www.yahoo.com/";
		SeleniumUtil selenium = Selenium(webURL);
		
		Readers readers = new Readers(Path.fileFromTextTestData("sample.kmdv"));
		readers.runSteps();
	}
	

}
