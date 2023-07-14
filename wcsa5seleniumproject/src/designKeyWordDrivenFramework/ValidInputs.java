package designKeyWordDrivenFramework;

import java.io.IOException;

public class ValidInputs extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		FlibK fb = new FlibK();

		LoginPagePom1 lp = new LoginPagePom1(driver);
		lp.validData(fb.readPropertyFile(PROP_PATH, "Username"), fb.readPropertyFile(PROP_PATH, "Password"));

		HomePage hp = new HomePage(driver);
		hp.clickOnUserElement();

		UserList ul = new UserList(driver);
		ul.clickOnCreateUser();

		CreateNewUserPage cnu = new CreateNewUserPage(driver);
		cnu.createUser(fb.readExcelData(
				"C:\\Users\\kiran\\OneDrive\\Desktop\\wcsa5.1Repository-master\\wcsa5seleniumproject\\data\\Book16.xlsx",
				"Sheet1", 1, 0),
				fb.readExcelData(
						"C:\\\\Users\\\\kiran\\\\OneDrive\\\\Desktop\\\\wcsa5.1Repository-master\\\\wcsa5seleniumproject\\\\data\\\\Book16.xlsx",
						"Sheet1", 1, 3),
				fb.readExcelData(
						"C:\\Users\\kiran\\OneDrive\\Desktop\\wcsa5.1Repository-master\\wcsa5seleniumproject\\data\\Book16.xlsx",
						"Sheet1", 1, 1),
				fb.readExcelData(
						"C:\\Users\\kiran\\OneDrive\\Desktop\\wcsa5.1Repository-master\\wcsa5seleniumproject\\data\\Book16.xlsx",
						"Sheet1", 1, 2));
		cnu.deleteUser();

		WorkLib wl = new WorkLib();
		wl.handlingPopUp();

	}

}
