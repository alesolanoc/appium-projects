package appium007;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendedReports {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
		
	@BeforeTest
	public void reportSetup() {
		String path = System.getProperty("user.dir") + "\\Reports\\index.html";
		System.out.println(path);

		htmlReporter = new ExtentHtmlReporter (path);
		htmlReporter.config().setDocumentTitle("Test Automation Report");
		htmlReporter.config().setProtocol(Protocol.HTTPS);
		htmlReporter.config().setEncoding ("UTF-8");
		htmlReporter.config().setTheme (Theme.DARK);
		
		System.out.println("1111222");
	//	htmlReporter = new ExtentHtmlReporter("c:\\test\\extentss.html");
		System.out.println("11113333");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.out.println("1111");
	}
	
	@AfterTest
	public void reportTeardown() {
		extent.flush();
	}
}
