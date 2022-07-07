package DVBDD;

import org.testng.annotations.Test;

import common.TestObject;

public class Runner extends TestObject {
	
	@Test(dataProvider = "path")
	public void testCases(String path) {

		readTestCases(path);

	}
	
	

}
