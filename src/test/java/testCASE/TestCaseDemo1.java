package testCASE;

import org.testng.annotations.Test;

import config.TestNG.Author;
import util.Base.TestBase;
import util.Common.SeleniumUtil;


public class TestCaseDemo1 extends TestBase{
	
	@Author(Name = "Vignesh")
	@Test()
	public void demo1TC() {
		String webURL = "https://www.google.com/";
		SeleniumUtil selenium = Selenium(webURL);
		selenium.Log(selenium.getTitle());
		selenium.pageScreenShot();
}
	
	@Author(Name = "Vignesh")
	@Test()
	public void demo2TC() {
	System.out.println("sample");
}
	
}
