package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import kmdv.Base.PageBase;

public class LoginPage extends PageBase {
	
	public LoginPage() {
		super();
	}

	private By Username = By.id("user-name");
	@FindBy(id = "password") private WebElement password;
	@FindBy(id="login-button") private WebElement loginbutton;

	public LoginPage Login() {
		selenium.type(Username, "standard_user");
		selenium.type(password, "secret_sauce");
		selenium.click(loginbutton);
		return this;
	}
}