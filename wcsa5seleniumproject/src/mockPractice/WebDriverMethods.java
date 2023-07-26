package mockPractice;

import java.awt.AWTException;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement popUpElement = driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']"));
		popUpElement.click();
		driver.switchTo().alert().accept();
		
		WebElement alertPopUpElement= driver.findElement(By.xpath("//button[normalize-space()='Prompt Alert Box']"));
		alertPopUpElement.click();
		
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();

	}

}
