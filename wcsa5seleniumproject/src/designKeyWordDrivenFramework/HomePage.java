package designKeyWordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//A[@class='content tt_selected selected']/descendant::IMG")
	private WebElement timeTrack;
	@FindBy(xpath = "//A[@class='content tasks']/descendant::IMG[@class='sizer']")
	private WebElement taskElement;
	@FindBy(xpath = "//A[@class='content reports']/descendant::IMG[@class='sizer']")
	private WebElement reportElement;
	@FindBy(xpath = "//A[@class='content users']/descendant::IMG[@class='sizer']")
	private WebElement userElement;
	@FindBy(xpath = "//A[@class='content calendar']/descendant::IMG[@class='sizer']")
	private WebElement workSchedulElement;
	@FindBy(xpath = "//A[@class='content administration']/descendant::IMG[@class='sizer']")
	private WebElement settingsElement;
	@FindBy(xpath = "//*[@name='usersSelector.selectedUser']")
	private WebElement meDropDown;
	@FindBy(xpath = "//td[normalize-space(.)='Insert existing tasks']")
	private WebElement insertExistingTask;
	@FindBy(xpath = "//FORM[@name='SubmitTTForm']/TABLE/TBODY/TR/TD/TABLE[1]/TBODY/TR[2]/TD/TABLE/TBODY/TR/TD[5]/A/IMG")
	private WebElement createTask;
	@FindBy(id = "SubmitTTButton")
	private WebElement saveChange;
	@FindBy(xpath = "//a[normalize-space()='Enter Time-Track']")
	private WebElement enterTimeTrack;
	@FindBy(xpath = "//a[normalize-space()='View Time-Track']")
	private WebElement viewTimeTrack;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeTrack() {
		return timeTrack;
	}

	public WebElement getTaskElement() {
		return taskElement;
	}

	public WebElement getReportElement() {
		return reportElement;
	}

	public WebElement getUserElement() {
		return userElement;
	}

	public WebElement getWorkSchedulElement() {
		return workSchedulElement;
	}

	public WebElement getSettingsElement() {
		return settingsElement;
	}

	public WebElement getMeDropDown() {
		return meDropDown;
	}

	public WebElement getInsertExistingTask() {
		return insertExistingTask;
	}

	public WebElement getCreateTask() {
		return createTask;
	}

	public WebElement getSaveChange() {
		return saveChange;
	}

	public WebElement getEnterTimeTrack() {
		return enterTimeTrack;
	}

	public WebElement getViewTimeTrack() {
		return viewTimeTrack;
	}
	
	public void clickOnUserElement()
	{
		userElement.click();
	}

}













