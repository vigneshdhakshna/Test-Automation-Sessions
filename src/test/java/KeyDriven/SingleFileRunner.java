package KeyDriven;

import org.testng.annotations.Test;

import kmdvKEY.TestBase;


public class SingleFileRunner extends TestBase{
	
	@Test()
	public void singleTestCase() {

		runTestCase("Login/TestCase2.kmdv");

	}
	

}
