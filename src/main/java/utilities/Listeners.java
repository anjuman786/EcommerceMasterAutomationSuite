package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener {
	ExtentReports extent = ExtentManager.getReportObject();
	ExtentTest test;
	ThreadLocal<ExtentTest>extentTest = new ThreadLocal<>();
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().pass("Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		WebDriver driver = BaseClass.driver;
		String screenshotPath = takescreenshot(result.getMethod().getMethodName(),driver);
		extentTest.get().addScreenCaptureFromPath(screenshotPath);
	}
	public String takescreenshot(String methodName, WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "/reports/"+ methodName + ".png";
		try {
			FileUtils.copyFile(src, new File(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

}
