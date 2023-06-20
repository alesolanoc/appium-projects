// test with xpath , contains and ' when sending string values and html report
package appium007;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class AppiumTest007 {
	AndroidDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent = new ExtentReports();
	@BeforeTest
	public void setup() throws MalformedURLException {

		String path = System.getProperty("user.dir") + "\\Reports\\index.html";
		System.out.println(path);
		htmlReporter = new ExtentHtmlReporter (path);
		htmlReporter.config().setDocumentTitle("Test Automation Report");
		htmlReporter.config().setProtocol(Protocol.HTTPS);
		htmlReporter.config().setEncoding ("UTF-8");
		htmlReporter.config().setTheme (Theme.DARK);
		extent.attachReporter(htmlReporter);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "Appium");
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "09011FDD40022V");
		caps.setCapability("platformVersion", "13.0");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.chrome");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.apps.chrome.Main");
		caps.setCapability("chromedriverExecutable","C:\\platform-tools\\chromedriver_win32_109version_supportedforpixel\\chromedriver.exe");
		caps.setCapability("noReset", true);
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url,caps);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}
	
	@AfterTest
	public void teardown() {
		extent.flush();
		driver.quit();
	}

}
