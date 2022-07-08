package DVBDD;

import org.testng.annotations.Test;

import common.TestBase;


public class Runner extends TestBase {
	
	@Test(dataProvider = "path")
	public void testCases(String path) {

		readTestCases(path);

	}
	
	

}
