package testCASE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitConditions {
	private FluentWait<WebDriver> fluentWait;
	
	public WaitConditions(WebDriver driver,int timeOutInSeconds,int pollingEveryInMiliSec) {
		fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(timeOutInSeconds))
		        .pollingEvery(Duration.ofSeconds(pollingEveryInMiliSec))
		        .ignoring(NoSuchElementException.class)
		        .ignoring(ElementNotVisibleException.class)
		        .ignoring(StaleElementReferenceException.class)
		        .ignoring(NoSuchFrameException.class);
	}

	public WebElement visibilityOfElementLocated(By by) {
		return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public List<WebElement> visibilityOfAllElementsLocatedBy(By by) {
		return fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}
	
	public WebElement elementToBeClickable(By by) {
		return fluentWait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public WebElement elementToBeClickable(WebElement element) {
		return fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public Boolean elementToBeSelected(By by) {
		return fluentWait.until(ExpectedConditions.elementToBeSelected(by));
	}
	
	public WebElement presenceOfElementLocated(By by) {
		return fluentWait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public List<WebElement> presenceOfAllElementsLocatedBy(By by) {
		return fluentWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}
	
	public Alert alertIsPresent() {
		return fluentWait.until(ExpectedConditions.alertIsPresent());
	}
	
	public Boolean stalenessOf(WebElement element) {
		return fluentWait.until(ExpectedConditions.stalenessOf(element));
	}
	
}
