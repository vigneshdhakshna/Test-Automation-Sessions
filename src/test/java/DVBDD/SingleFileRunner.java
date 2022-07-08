package DVBDD;

import org.testng.annotations.Test;

import common.TestBase;

public class SingleFileRunner extends TestBase{
	
	@Test()
	public void singleTestCase() {

		runTestCase("Login/TestCase2.kmdv");

	}
	

}
