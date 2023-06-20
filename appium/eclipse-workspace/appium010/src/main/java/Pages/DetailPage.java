package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class DetailPage {
	public String detailTextprivate = "";
	private static By FisttTrandingDetail;
	private static By FisttTrandingDetailBound;
	private static By favoritiesText;
	private final By backElement = By.xpath("//android.widget.TextView[contains(@text, '')]");
	private final AndroidDriver driver;
	
	public DetailPage(AndroidDriver driver, String valuee) {
		this.driver = driver;
		detailTextprivate = valuee;
		FisttTrandingDetail = By.xpath("//android.widget.TextView[contains(@text, '"+detailTextprivate+"')]");
		FisttTrandingDetailBound = By.xpath("//android.widget.TextView[@bounds='[783,699][830,741]']");
		favoritiesText = By.xpath("//android.widget.TextView[contains(@text, 'FAVORITOS')]");
	}

	public int getSizefirstTrendingDetailPage() {
		return driver.findElements(FisttTrandingDetail).size();
	}
	
	public String getfirstTrendingDetailPage() {
		return driver.findElement(FisttTrandingDetail).getText();
	}
	
	public void clickOverBackElement() {
		driver.findElement(backElement).click();
	}
	
	public int getSizeUsingBoundsDetail() {
		return driver.findElements(FisttTrandingDetailBound).size();
	}
	
	public String getTextUsingBoundsDetail() {
		return driver.findElement(FisttTrandingDetailBound).getText();
	}
	
	public void clickUsingBoundsDetail() {
		driver.findElement(FisttTrandingDetailBound).click();
	}
	
	public void givesLike() {
		driver.findElement(FisttTrandingDetail).click();
	}
	
	public void clickFAvoritiesText() {
		driver.findElement(favoritiesText).click();
	}
}
