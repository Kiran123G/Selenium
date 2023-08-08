package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.Login_Page;

public class LoginPageTest extends BaseTest {
	@Test
	public void validTest() throws IOException {
		Login_Page lp = new Login_Page(driver);
		Flib fb = new Flib();
		lp.validData(fb.readPropertyData(PROPERTY_DATA_T, "Username"),
				fb.readPropertyData(PROPERTY_DATA_T, "Password"));

	}
}
