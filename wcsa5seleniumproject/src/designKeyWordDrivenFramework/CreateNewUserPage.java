package designKeyWordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class CreateNewUserPage extends FlibK {
	@FindBy(css = "input[name='username']")
	private WebElement usernameTB;
	@FindBy(xpath = "//input[@name='passwordText']")
	private WebElement passwordTB;
	@FindBy(xpath = "//input[@name='passwordTextRetype']")
	private WebElement RetypePasswordTB;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstnameTB;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameTB;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneNoTB;
	@FindBy(xpath = "//input[@name='fax']")
	private WebElement fax;
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middleInitial;
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailAddress;
	@FindBy(xpath = "//input[@name='otherContact']")
	private WebElement otherContact;
	@FindBy(xpath = "//input[@name='workdayDurationStr']")
	private WebElement workDayDuration;
	@FindBy(xpath = "//input[@id='overtimeTracking_Enable']")
	private WebElement enableOvertimeTracking;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createUser;
	@FindBy(xpath = "//a[normalize-space()='ghuge, kiran (manager)']")
	private WebElement user;
	@FindBy(xpath = "//input[@value='Delete This User']")
	private WebElement deleteUser;

	public CreateNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return RetypePasswordTB;
	}

	public WebElement getFirstnameTB() {
		return firstnameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getMiddleInitial() {
		return middleInitial;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getOtherContact() {
		return otherContact;
	}

	public WebElement getWorkDayDuration() {
		return workDayDuration;
	}

	public WebElement getEnableOvertimeTracking() {
		return enableOvertimeTracking;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	// declaration
	FlibK fbFlibK = new FlibK();

	public void createUser(String name, String pass, String firstname, String lastName) {
		usernameTB.sendKeys(name);
		passwordTB.sendKeys(pass);
		RetypePasswordTB.sendKeys(pass);
		firstnameTB.sendKeys(firstname);
		lastNameTB.sendKeys(lastName);
		enableOvertimeTracking.click();
		createUser.click();
		user.click();
	}
	
	public void deleteUser()
	{
		deleteUser.click();
	}
	

}
