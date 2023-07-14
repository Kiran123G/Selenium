package designKeyWordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPagePom1 {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usnTB;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passTB;
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginTB;
	@FindBy(xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement CheckTB;

	// intialization
	public LoginPagePom1(WebDriver driver) {
		PageFactory.initElements(driver, this); // intialize the webelement at one time
	}

	// utilization

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginTB() {
		return loginTB;
	}

	public WebElement getCheckTB() {
		return CheckTB;
	}

	// declaration

	public void validData(String validUsername, String Password) {

		usnTB.sendKeys(validUsername);
		passTB.sendKeys(Password);
		loginTB.click();
	}

}
