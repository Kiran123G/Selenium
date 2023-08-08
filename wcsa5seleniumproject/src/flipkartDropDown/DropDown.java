package flipkartDropDown;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		String aString = "hello";
		String bString = " ";
		char ch;
		for (int i = 0; i < aString.length(); i++) {
			ch=aString.charAt(i);
			bString = ch + bString;
		}
		System.out.println(bString);

}
}