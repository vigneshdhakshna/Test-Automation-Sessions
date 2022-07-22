package testCASE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleAutoPrac {
	
	public static void main(String[] args) throws Throwable {
	       // TODO Auto-generated method stub
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=my-account\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("bhanu3@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys("May14");
        driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")).click();
        Boolean log = driver.findElement(By.xpath("//a[@title=\"View my customer account\"]")).isDisplayed();
        if(log)
            System.out.println("User is logged in");
        else
            System.out.println("User is not logged in");
        driver.findElement(By.xpath("//a[@title=\"Home\"]")).click();
//        driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/8/8-home_default.jpg\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"product_img_link\"][1]")).click();
//        Set<String> str = driver.getWindowHandles();
//        System.out.println(str);
//        int fra = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(fra);
//        Thread.sleep(2000);
        driver.switchTo().frame(1);
//        System.out.println(driver.getPageSource());
        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@class='btn btn-default button-plus product_quantity_up']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
//        driver.findElement(By.xpath("//a[@class=\"btn btn-default button-plus product_quantity_up\"]")).click();
//        driver.findElement(By.name("qty")).sendKeys("2");
        Select size = new Select(driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']")));
        size.selectByIndex(1);
        System.out.println("phase 1");
        driver.findElement(By.xpath("//button[@class='exclusive']")).click();
//        int fra = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(fra);
        Thread.sleep(5000);
        System.out.println("phase 2");
        driver.switchTo().defaultContent();
    JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementByClass('btn btn-default button button-medium').click()");
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        boolean btn = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']")).isDisplayed();
//        if(btn)
//            System.out.println("btn is presenet");
//        else
//            System.out.println("btn is not present");
    js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")));
    //    driver.navigate().refresh();
    System.out.println("phase 3");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        driver.findElement(By.xpath("//*[@href='http://automationpractice.com/index.php?controller=order&step=1']")).click();
        driver.findElement(By.xpath("//button[@name='processAddress']")).click();
        driver.findElement(By.xpath("//div[@id='uniform-cgv']")).click();
        driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
        driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
        driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
        Boolean conf = driver.findElement(By.xpath("//p[@class='alert alert-success']")).isDisplayed();
        if(conf)
            System.out.println("Order is confirmed");
        else
            System.out.println("Order is not confirmed");
        driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();
        String orderid = driver.findElement(By.xpath("//tr[@class='first_item ']/td[1]")).getText();
        System.out.println("Order id is :" + "\t" + orderid);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-default button button-medium']")));
//        driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']")).click();
//        Boolean dis = driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']")).isDisplayed();
//        System.out.println(dis);
//        driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();
        driver.quit();
	}

}
