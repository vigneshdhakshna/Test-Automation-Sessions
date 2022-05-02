package testCASE;

import org.testng.annotations.Test;

import Pages.LoginPage;
import config.TestNG.Author;
import util.Base.TestBase;
import util.Common.RestAPIUtil;
import util.Common.SeleniumUtil;

public class demo extends TestBase {

	@Author(Name = "Vignesh")
	@Test
	public void demoWEB() {
		String webURL ="https://www.saucedemo.com/";
		SeleniumUtil selenium = Selenium(webURL);
		
		new LoginPage().Login();
		selenium.Log("Logged in successfully");
    }

	@Author(Name = "Dhakshna")
	@Test
	public void demoAPI() {
		String baseURI ="https://reqres.in/";
		RestAPIUtil restAPI= RestAPI(baseURI);
		restAPI.Log( restAPI.getStatusCode() );
    }
}
