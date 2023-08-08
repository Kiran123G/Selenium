package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);

		WebElement chatBoxElement = driver.findElement(By.id("chat-icon"));
		chatBoxElement.click();

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("kiran");

	}

}
