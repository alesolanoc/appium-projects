package Pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;

public class SearchPage {
	public String detailTextprivate = "";
	private static By searchInputTextBox;
	private static By transportationFilterCriteria; 
	private static By distanceFilterCriteria;
	private static By durationFilterCriteria;
	private static By ratingFilterCriteria;
	private static By anyTransportationOption;
	private static By walkTransportationOption;
	private static By bikeTransportationOption;
	private static By carTransportationOption;
	private static By shortDesTourPack;
  	private AndroidDriver driver;
  	
	public SearchPage(AndroidDriver driver, String value) {
		this.driver = driver;
		detailTextprivate = value;
		searchInputTextBox = By.id("com.jalasoft.travelerapp:id/search_src_text");
		transportationFilterCriteria = By.id("com.jalasoft.travelerapp:id/tv_transportation_filter");
		distanceFilterCriteria = By.id("com.jalasoft.travelerapp:id/tv_distance_filter");
		durationFilterCriteria = By.id("com.jalasoft.travelerapp:id/tv_duration_filter");
		ratingFilterCriteria = By.id("com.jalasoft.travelerapp:id/tv_rating_filter");
		anyTransportationOption = By.id("com.jalasoft.travelerapp:id/radio_any");
		walkTransportationOption = By.id("com.jalasoft.travelerapp:id/radio_walk");		
		bikeTransportationOption = By.id("com.jalasoft.travelerapp:id/radio_bike");			
		carTransportationOption = By.id("com.jalasoft.travelerapp:id/radio_car");	
		shortDesTourPack = By.xpath("//android.widget.TextView[contains(@text, '"+detailTextprivate+"')]");
	}
	
	public void sendTextFieldToSearchInputBox(String searchText) {
		driver.findElement(searchInputTextBox).sendKeys(searchText);
	}
	
	public void pressDoneAfterFilledText() {
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
	}
	
	public void pressTransportationOption() {
		driver.findElement(transportationFilterCriteria).click();
	}
	
	public void selectAnyTransportationOption() {
		driver.findElement(anyTransportationOption).click();
	}
	
	public void selectWalkTransportationOption() {
		driver.findElement(walkTransportationOption).click();
	}
	
	public void selectBikeTransportationOption() {
		driver.findElement(bikeTransportationOption).click();
	}
	
	public void selectCarransportationOption() {
		driver.findElement(carTransportationOption).click();
	}
	
	public boolean getElementIsDisplayedInSearchPage() {
		if (driver.findElement(shortDesTourPack).isDisplayed()) {
			return true;
		}
		else
			return false;
	} 
	
	public void clickElementShortDescIsDisplayedinSearchPage() {
		driver.findElement(shortDesTourPack).click(); 
	} 		
}
