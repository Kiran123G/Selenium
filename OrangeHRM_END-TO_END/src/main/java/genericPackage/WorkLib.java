package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkLib extends BaseTest {
	// POPUP-HANDLINGS

		public void alertAccept() {
			driver.switchTo().alert().accept();
		}

		public void alertDismiss() {
			driver.switchTo().alert().dismiss();
		}

		public void getText() {
			driver.switchTo().alert().getText();
		}

		public void sendKeys(String text) {
			driver.switchTo().alert().sendKeys(text);
		}

		// MOUSE ACTIONS HANDLIGS
		public void moveTOElement(WebElement element) {
			Actions acts = new Actions(driver);
			acts.moveToElement(element);
		}

		public void rightClick(WebElement element) {
			Actions acts = new Actions(driver);
			acts.contextClick(element);

		}

		public void doubleClick(WebElement element) {
			Actions acts = new Actions(driver);
			acts.doubleClick(element);
		}

		public void dragAndDrop(WebElement text1, WebElement text2) {
			Actions acts = new Actions(driver);
			acts.dragAndDrop(text1, text2);

		}
}
