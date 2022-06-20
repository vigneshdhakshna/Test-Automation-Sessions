package DVBDD;

import org.testng.annotations.Test;

import common.HandleMethods;
import common.TestObject;

public class Runner extends TestObject {
	
	@Test(dataProvider = "path")
	public void testCases(String path) {

		readTestCases(path);

	}
	
	
	public static void main(String[] args) {
		HandleMethods HandleMethods = new HandleMethods();
		HandleMethods.run();
	}

}
