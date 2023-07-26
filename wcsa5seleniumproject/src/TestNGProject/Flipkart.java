package TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public void googleLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("TestNG",Keys.ENTER);
		driver.quit();
	}
	
	@Test
	public void gitHubLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.quit();
	}
	
}
