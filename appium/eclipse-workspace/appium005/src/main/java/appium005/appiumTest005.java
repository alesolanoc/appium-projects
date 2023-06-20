//connect to real device pixel 5 with android 13.0 and run chrome browser with traveler app
package appium005;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appiumTest005 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
