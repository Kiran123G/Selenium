package mockPrograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogSpot {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		String parentWindowString = driver.getTitle();//parenTitle

		JavascriptExecutor js = (JavascriptExecutor) driver; //typeCast
		js.executeScript("window.scrollBy(0,1000);");

		WebElement popUpLink = driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']"));
		popUpLink.click();

		Set<String> windowHandles = driver.getWindowHandles(); 
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			String titleString = driver.getTitle(); // child title
			if (!parentWindowString.equals(titleString)) {
				Thread.sleep(2000);
				driver.close();
			}
		}

	}

}
