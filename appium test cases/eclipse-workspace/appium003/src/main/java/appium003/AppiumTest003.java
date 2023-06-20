// call chrome browser with https://traveler.jalasoft.com/home and installed chromedriver v 91
package appium003;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest003 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "Appium");
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "sdk_gphone64_x86_64");
		caps.setCapability("platformVersion", "12.0");
		caps.setCapability("UDID", "emulator-5554");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("chromedriverExecutable","C:\\platform-tools\\chromedriver_win32_91version_supportedforemulators\\chromedriver.exe");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,caps);
		//D
		Thread.sleep(18000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(18000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(18000);
		js.executeScript("window.scrollBy(0,10)", "");
		Thread.sleep(18000);
		driver.quit();

	}

}
