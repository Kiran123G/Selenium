package iframe;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();
		String parentTitleString = driver.getTitle();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String childString = driver.switchTo().window(parentTitleString).getTitle();

			if (parentTitleString.equals(childString)) {
				driver.close();
			}
		}

	}

}
