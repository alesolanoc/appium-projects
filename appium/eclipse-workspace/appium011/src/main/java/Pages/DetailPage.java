package Pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class DetailPage {
	private static By firstTrendingShortDesc;
	ArrayList<String> ald = new ArrayList<String>();
  	private AndroidDriver driver;
  	
	public DetailPage(AndroidDriver driver) {
		this.driver = driver;
		ald.add("Paseo por el Salar de Uyuni");
		ald.add("El Salar de Uyuni, en medio de los Andes en el sur de Bolivia, es la salina más grande del mundo. Es el legado de un lago prehistórico que se secó y dejó un paisaje desértico de casi 11,000 km cuadrados de sal blanca brillante, formaciones rocosas e islas con cactus.");
		ald.add("Centros comerciales Santa Cruz");
		ald.add("Recorrido por centros comerciales en Santa Cruz");
		ald.add("Rumbo a Robore");
		firstTrendingShortDesc = By.id("com.jalasoft.travelerapp:id/tv_trending_title");
	}
	
	public boolean getElementIsDisplayedInDetailPage(String element) {
		String titleElement = "TOUR PACK";
		Set<String> set = new HashSet<String>(ald);
		if (set.contains(element) && driver.findElement(By.xpath("//android.widget.TextView[text, '"+element+"']")).isDisplayed() && driver.findElement(By.xpath("//android.widget.TextView[text, '"+titleElement+"']")).isDisplayed()) {
			return true;
		}
		else
			return false;
	} 

}
