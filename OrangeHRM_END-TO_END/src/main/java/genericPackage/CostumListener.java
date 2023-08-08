package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CostumListener extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("start the test:", true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success:", true);
	}

	public void onTestFailure(ITestResult result) {
		String data = result.getMethod().getMethodName();
		Reporter.log("failed method SS :" + data, true);

	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("test failed with successPercentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("failed test:", true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("test started", true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("test started", true);
	}

}
