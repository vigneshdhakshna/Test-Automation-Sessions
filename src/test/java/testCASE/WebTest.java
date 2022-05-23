package testCASE;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.TestNG.Author;
import util.Base.TestBase;
import util.Common.SeleniumUtil;

public final class WebTest extends TestBase{

	@Author(Name = "Vignesh")
	@Test
	public void demoWEB() {
		String webURL ="https://www.mercy.com/";
		SeleniumUtil selenium = Selenium(webURL);
		Assert.assertTrue(selenium.findBy_Xpath("(//img[@class='lockup-color'])[1]").getAttribute("alt").equalsIgnoreCase("Mercy Health"));
		selenium.sleep(2);
		selenium.findBy_ID("global-nav-location").click();
		selenium.findBy_Xpath("//div[@id='PlacesAutocomplete__root']/input").sendKeys("Cincinnati, OH 45201, USA");
		selenium.sleep(1);
		selenium.findBy_Xpath("//input[@value='Cincinnati, OH 45201, USA']").sendKeys(Keys.DOWN);
		selenium.findBy_Xpath("//input[@value='Cincinnati, OH 45201, USA']").sendKeys(Keys.ENTER);
		selenium.findBy_Xpath("//button[@class='btn mr2 flex-1']").click();
		selenium.sleep(5);
    }
}