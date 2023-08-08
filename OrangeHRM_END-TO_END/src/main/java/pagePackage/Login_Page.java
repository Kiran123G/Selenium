package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement login;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	private WebElement forgetPass;

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgetPass() {
		return forgetPass;
	}

	public void validData(String username1, String password1) {

		username.sendKeys(username1);
		password.sendKeys(password1);
		login.click();
	}

	public void invalidData(String invalidUsername, String invalidPassword) throws InterruptedException {
		username.sendKeys(invalidUsername);
		password.sendKeys(invalidPassword);
		login.click();
		Thread.sleep(2000);
		username.clear();
	}

}
