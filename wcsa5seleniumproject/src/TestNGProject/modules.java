package TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class modules {
	@Test
	public void facebookLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
}
