package testCASE;

import org.openqa.selenium.chrome.ChromeOptions;

import io.testproject.sdk.drivers.web.ChromeDriver;

public final class WebTest {

    public static void main(final String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver("4um1kZlnvPpB5R8Us9FmNZU9hNbL8uJMAn8pKgLjdQU1",new ChromeOptions());

        driver.navigate().to("https://example.testproject.io/web/");


        driver.quit();
    }
}