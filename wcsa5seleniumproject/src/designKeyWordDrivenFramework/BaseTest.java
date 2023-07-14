package designKeyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends FlibK implements IautoConstant {
     static WebDriver driver;
	public void openBrowser() throws IOException {
		FlibK fb = new FlibK();
		String browserValue1 = fb.readPropertyFile(PROP_PATH, "Browser");
		String urlString = fb.readPropertyFile(PROP_PATH,"Url");
		
		if (browserValue1.equalsIgnoreCase("chrome")) {
			
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
		}
		else if(browserValue1.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
		}
		else if(browserValue1.equalsIgnoreCase("edge"))
		{
			System.setProperty(EDGE_KEY,EDGE_PATH);
			driver=new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Enter valid browserValue!!!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(urlString);
	}

	public void tearDown()
	{
		driver.quit();
	}

	}

