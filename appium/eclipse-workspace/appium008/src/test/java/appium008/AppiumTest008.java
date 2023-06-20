// connect to traveler app in android device
package appium008;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest008 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "Appium");
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "09011FDD40022V");
		caps.setCapability("platformVersion", "13.0");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.jalasoft.travelerapp");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.jalasoft.travelerapp.MainActivity");
		caps.setCapability("noReset", true);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,caps);
		Thread.sleep(10000);
		driver.quit();
	}

}
