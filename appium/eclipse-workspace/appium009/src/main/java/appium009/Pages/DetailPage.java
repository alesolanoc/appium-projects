package appium009.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DetailPage {
	public String detailTextprivate = "Al suroeste de Bolivia, en el departamento de Potosí";
	private final By FisttTrandingDetail = By.xpath("//android.widget.TextView[contains(@text, '"+detailTextprivate+"')]");
	private final By backElement = By.xpath("//android.widget.TextView[contains(@text, '')]");

	public String detailTextMorePopular = "Pubs - Discotecas La Paz";
	private final By FisttMorePopularDetail = By.xpath("//android.widget.TextView[contains(@text, '"+detailTextMorePopular+"')]");
											  
	private final AndroidDriver driver;
	
	public DetailPage(AndroidDriver driver) {
		this.driver = driver;
		final By FisttTrandingDetail = By.xpath("//android.widget.TextView[contains(@text, '"+detailTextprivate+"')]");

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

	public int getSizefirstMorePopularDetailPage() {
		return driver.findElements(FisttMorePopularDetail).size();
	}

	public String getfirstMorePopularDetailPage() {
		return driver.findElement(FisttMorePopularDetail).getText();
	}	
}
