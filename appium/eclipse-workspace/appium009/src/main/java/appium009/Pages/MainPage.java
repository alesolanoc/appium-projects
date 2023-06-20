package appium009.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;

public class MainPage {
	public String tittleTextprivate = "El desierto de Sal más grande del Mundo";
  	private final By firstTrending = By.xpath("//android.view.View[contains(@text, '"+tittleTextprivate+"')]");

  	public String tittleTextFirstMorePopular = "Pubs - Discotecas La Paz";
  	private final By firstMorPopular = By.xpath("//android.view.View[contains(@text, '"+tittleTextFirstMorePopular+"')]");
  	private final AndroidDriver driver;

  	
	public MainPage(AndroidDriver driver) {
		this.driver = driver;
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
	
	public int getSizefirstMorePopular() {
		return driver.findElements(firstMorPopular).size();
	}
	
	public String getfirstMorePopular() {
		return driver.findElement(firstMorPopular).getText();
	}
	
	public void clickOverfirstMorePopular() {
		driver.findElement(firstMorPopular).click();
	}
}