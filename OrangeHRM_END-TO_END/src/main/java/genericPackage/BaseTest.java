package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Flib implements IAutoConstant {
	public static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		Flib fb = new Flib();
		String browservalueString = fb.readPropertyData(PROPERTY_DATA_M, "Browser");
		String url = fb.readPropertyData(PROPERTY_DATA_M, "Url");

		if (browservalueString.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		} else if (browservalueString.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		} else if (browservalueString.equals("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		} else {
			System.out.println("enter valid name");
		}

	}

	public void failedMethods(String failedMethod) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(ScreenShots + failedMethod + ".png");
			Files.copy(src, dest);
		} catch (Exception e) {

		}
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
