package testCASE;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

import util.Common.BaseUtil;
import util.Data.PropertiesUtil;

public class BSDriver extends BaseUtil{
	
	public RemoteWebDriver getDriver() {
		String path = Path.fileFromProperties("browserStack.properties");
		PropertiesUtil propertiesUtil = new PropertiesUtil (path) ;
		  final String AUTOMATE_USERNAME = propertiesUtil.getValue("AUTOMATE_USERNAME");
		  final String AUTOMATE_ACCESS_KEY = propertiesUtil.getValue("AUTOMATE_ACCESS_KEY");
		  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		  RemoteWebDriver remoteWebDriver = null;
		  
		  DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os", propertiesUtil.getValue("os"));
		    caps.setCapability("os_version", propertiesUtil.getValue("os_version"));
		    caps.setCapability("browser", propertiesUtil.getValue("browser"));
		    caps.setCapability("browser_version", propertiesUtil.getValue("browser_version"));
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("name", Reporter.getCurrentTestResult().getName()); 
		    caps.setCapability("build", Reporter.getCurrentTestResult().getTestClass().getName()); 
		    try {
			remoteWebDriver = new RemoteWebDriver(new URL(URL), caps);
			} catch (Exception e) {
				e.printStackTrace();
			}
		    return remoteWebDriver;
	}
	
	public void markTestStatus(String status, String reason, WebDriver driver) {
	    final JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+ status + "\", \"reason\": \"" + reason + "\"}}");
	  }

}
