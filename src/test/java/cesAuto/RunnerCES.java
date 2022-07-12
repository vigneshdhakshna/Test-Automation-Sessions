package cesAuto;

import org.testng.annotations.Test;

import kmdvKEY.TestBase;




public class RunnerCES extends TestBase {
	
	@Test(dataProvider = "path")
	public void testCases(String path) {

		readTestCases(path);

	}
	
}
