package KeyDriven;

import org.testng.annotations.Test;

import kmdvKEY.TestBase;



public class Runner extends TestBase {
	
	@Test(dataProvider = "path")
	public void testCases(String path) {

		readTestCases(path);

	}
	
}
