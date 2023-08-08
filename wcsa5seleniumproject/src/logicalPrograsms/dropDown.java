package logicalPrograsms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		WebElement aElement = driver.findElement(By.xpath("//select[@id='drop1']"));
		// --------------------------------------------------------------------------------------------
		Select sl = new Select(aElement);
//	    WebElement allString = sl.getWrappedElement();
//	    String dataString = allString.getText();
//	    System.out.println(dataString);

		// ------------------------------------------------------------------------------

//		List<WebElement> dropElements = driver.findElements(By.xpath("//select[@id='drop1']"));
//		for (WebElement webElement : dropElements) {
//			String eleString = webElement.getText();
//			System.out.println(eleString);
//		}
		sl.selectByIndex(1);
	}

}
