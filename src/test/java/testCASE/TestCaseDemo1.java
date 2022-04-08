package testCASE;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import config.TestNG.Author;
import util.Base.TestBase;
import util.Common.SeleniumUtil;


public class TestCaseDemo1 extends TestBase{
	
	@Author(Name = "Vignesh")
	@Test()
	public void demo1TC() {
		String webURL = "https://www.valuedopinions.co.in/index";
		SeleniumUtil selenium = Selenium(webURL);
		selenium.sleep(2);
		selenium.findBy_Xpath("//a[@class='login button buttonTertiary']").click();
		selenium.sleep(2);
		selenium.findBy_ID("username").sendKeys("ssarantestuser@gmail.com");
		selenium.findBy_ID("password").sendKeys("Test@123");
		selenium.sleep(1);
		selenium.findBy_Xpath("//input[@class='button buttonPrimary button-full']").click();
		selenium.sleep(2);
		
		WebElement host = selenium.findBy_Xpath("//upp-punchcard-list[@ng-if='vm.user.id > 0']");
		int num = 2;
		SearchContext shadow0 = host.getShadowRoot();
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("upp-punchcard[show-modal='false']")).getShadowRoot();
		WebElement findElement1 = shadow1.findElement(By.cssSelector("#pc-"+num));
		selenium.Log(findElement1.getText());
		WebElement findElement2 = shadow1.findElement(By.cssSelector("#pc-"+num+" > div"));
		selenium.Log(findElement2.getCssValue("background-color"));
	}
	

}
