package testCASE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.testproject.sdk.drivers.web.ChromeDriver;

public final class WebTest {

    public static void main(final String[] args) throws Exception {
    	WebDriverManager.firefoxdriver().setup();
    	WebDriver driver = new FirefoxDriver();
		
    	driver.get("https://money.rediff.com/gainers");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(findElements.size());


        driver.quit();
    }
}