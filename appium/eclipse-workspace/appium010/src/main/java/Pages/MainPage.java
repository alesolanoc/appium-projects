package Pages;

import org.openqa.selenium.By;

import com.mongodb.client.model.geojson.Point;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class MainPage {
	private static By firstTrending;
	private static By trendingUsingBounds;
	private static By textField;
	private static By exploreText;
	public String tittleTextprivate = "";
  	private AndroidDriver driver;
  	
	public MainPage(AndroidDriver driver,String valuee) {
		this.driver = driver;
		tittleTextprivate = valuee ;
		firstTrending = By.xpath("//android.view.View[contains(@text, '"+tittleTextprivate+"')]");
		trendingUsingBounds = By.xpath("//android.widget.TextView[@bounds='[965,699][1014,741]']");
		textField = By.xpath("//android.widget.EditText");
		exploreText = By.xpath("//android.widget.TextView[contains(@text, 'EXPLORAR')]");
	}

	public int getSizefirstTrending() {
		return driver.findElements(firstTrending).size();
	}

	public String getfirstTrending() {
		return driver.findElement(firstTrending).getText();
	}
	
	public void clickOverfirstTrending() {
		driver.findElement(firstTrending).click();
	}

	@SuppressWarnings("deprecation")
	public int scrollDownMainPage() {
		return driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")).size();
	}

	public org.openqa.selenium.Point getLocationAfterscrollDownMainPage() {
		return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")).getLocation();
	}
	
	public org.openqa.selenium.Point getLocationAfterscrollUpMainPage() {
		return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)")).getLocation();
	}
	
	public String getTextFromNext() {
		return driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.view.View\")).setAsHorizontalList().scrollIntoView("
				+ "new UiSelector().descriptionContains(\"textToSearch\"))")).getText();
	}
	
	public int getSizeUsingBounds() {
		return driver.findElements(trendingUsingBounds).size();
	}
	
	public String getTextUsingBounds() {
		return driver.findElement(trendingUsingBounds).getText();
	}
	
	public void clickUsingBounds() {
		driver.findElement(trendingUsingBounds).click();
	}
	
	public void scrollDownByText() {
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Incallajta\"))"));
	}
	
	public void clickTextField() {
		driver.findElement(textField).click();
	}
	
	public void sendTextField(String tittleText) {
		driver.findElement(textField).sendKeys(tittleText);
	}

	public void clickExploreText() {
		driver.findElement(exploreText).click();
	}
	
}
