package popUpwindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		String parentTitleString = driver.getTitle();
		driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();

		Set<String> windoHandles = driver.getWindowHandles();
		for (String string : windoHandles) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			if (!parentTitleString.equals(title)) {
				driver.close();
			}
		}

	}

}
