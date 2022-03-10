package testCASE;
// Sample test in Java to run Automate session.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import util.Base.TestBase;
public class JavaSample extends TestBase{

@SuppressWarnings("deprecation")
@Test
public void browserStackDemo1() {
	BSDriver bsDriver = new BSDriver();
    final WebDriver driver = bsDriver.getDriver();
    try {
      driver.get("https://bstackdemo.com/");
      final WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.titleIs("StackDemo"));
      // getting name of the product
      String product_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'1\']/p"))).getText();
      // waiting for the Add to cart button to be clickable
      WebElement cart_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'1\']/div[4]")));
      // clicking the 'Add to cart' button
      cart_btn.click();
      // checking if the Cart pane is visible
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("float-cart__content")));
      // getting the product's name added in the cart
      final String product_in_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]"))).getText();
      // verifying whether the product added to cart is available in the cart
      if (product_name.equals(product_in_cart)) {
    	  bsDriver.markTestStatus("passed", "Product has been successfully added to the cart!", driver);
        }
      } catch (Exception e) {
    	  bsDriver.markTestStatus("failed", "Some elements failed to load", driver);
        }
      driver.quit();
}
} 