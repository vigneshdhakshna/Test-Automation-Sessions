package testCASE;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import config.TestNG.Author;
import util.Base.TestBase;
import util.Common.SeleniumUtil;


public class TestCaseDemo1 extends TestBase{
	
	@Author(Name = "Vignesh")
	@Test()
	public void demo1TC() {
		String webURL = "https://money.rediff.com/gainers";
		SeleniumUtil selenium = Selenium(webURL);
		selenium.Log(selenium.getTitle());
		List<WebElement> elements = selenium.getElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(elements.size());
	}
	

}
