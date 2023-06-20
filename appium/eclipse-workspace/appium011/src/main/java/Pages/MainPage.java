package Pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class MainPage {
	private static By header;
	private static By searchTextBox;
	private static By trendingLabel;
	private static By moreTourPacksLabel;
	private static By seeAllLabel;
	private static By firstTrendingShortDesc;
	private static By firstTrendingLargeDesc;
	private static By firstTrendingImage;
	public String headerText = "Traveler";
	public String searchText = "Looking for a new adventure?";
	public String trendinglabelText = "Trending";
	public String moreTourPacksText = "More Tour Packs";
	public String seeAllText = "SEE ALL";
	ArrayList<String> al = new ArrayList<String>();
  	private static AndroidDriver driver;
  	
	public MainPage(AndroidDriver driver) {
		this.driver = driver;
		al.add("Traveler");
		al.add("Looking for a new adventure?");
		al.add("Trending");
		al.add("More Tour Packs");
		al.add("SEE ALL");
		al.add("Paseo por el Salar de Uyuni");
		al.add("El Salar de Uyuni, en medio de los Andes en el sur de Bolivia, es la salina más grande del mundo. Es el legado de un lago prehistórico que se secó y dejó un paisaje desértico de casi 11,000 km cuadrados de sal blanca brillante, formaciones rocosas e islas con cactus.");
		al.add("Uyuni");
		al.add("50.0");
		header = By.id("com.jalasoft.travelerapp:id/iv_header");
		searchTextBox = By.id("com.jalasoft.travelerapp:id/tv_packs");
		trendingLabel = By.id("com.jalasoft.travelerapp:id/tv_trending");
		moreTourPacksLabel = By.id("com.jalasoft.travelerapp:id/tv_more_packs_header");
		seeAllLabel = By.id("com.jalasoft.travelerapp:id/tv_see_all");
		searchTextBox = By.id("com.jalasoft.travelerapp:id/tv_packs");
		firstTrendingShortDesc = By.id("com.jalasoft.travelerapp:id/tv_trending_title");
		firstTrendingLargeDesc = By.id("com.jalasoft.travelerapp:id/tv_trending_description");
		firstTrendingImage = By.id("com.jalasoft.travelerapp:id/iv_trending");
	}
	
	public boolean getElementIsDisplayed(String element) {
		Set<String> set = new HashSet<String>(al);
		if (set.contains(element) && driver.findElement(By.xpath("//android.widget.TextView[text, '"+element+"']")).isDisplayed()) {
			return true;
		}
		else
			return false;
	} 
	
	public void clickElementShortDescIsDisplayed(String element) {
		driver.findElement(firstTrendingShortDesc).click(); 
	} 	
	
	public void clickElementLargeDescIsDisplayed(String element) {
		driver.findElement(firstTrendingLargeDesc).click(); 
	} 	
	
	public void clickElementImageIsDisplayed(String element) {
		driver.findElement(firstTrendingImage).click(); 
	} 	
	
	public boolean getElementImageIsDisplayed(String element) {
		Set<String> set = new HashSet<String>(al);
		System.out.println(driver.findElement(By.xpath("//android.widget.ImageView")).isDisplayed());
		if (set.contains(element) && driver.findElement(By.xpath("//android.widget.ImageView")).isDisplayed()) {
			return true;
		}
		else
			return false;
	}
	
	public void clickOverSearchInputBox() {
		driver.findElement(searchTextBox).click();
	}
	
	@SuppressWarnings("deprecation")
	public static <MobileElement> Boolean goDetailPageFromShortDesc(String textToSearch) throws InterruptedException {
		//@SuppressWarnings("deprecation")
/*		String value = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).setAsHorizontalList().scrollIntoView("
				+ "new UiSelector().descriptionContains(\"Recorrido por el Lago Titicaca\"))")).getText();
	*/	
// funciona pero no encuentra texto		String value = driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().className(\"android.view.ViewGroup\")).setAsHorizontalList().scrollIntoView( UiSelector().descriptionContains(\""+textToSearch+"\"))")).getText();
		Thread.sleep(3000);
// funcionta pero no encuentra texto		WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\""+textToSearch+"\"))"));
		WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).setAsHorizontalList().getChildByText("
		+ "new UiSelector().className(\"android.widget.TextView\"), \""+textToSearch+"\")"));
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		return element.isDisplayed();
	}
		
	@SuppressWarnings("deprecation")
	public static <MobileElement> Boolean goDetailPageFromLargeDesc(String textToSearch) throws InterruptedException {
		Thread.sleep(3000);
		WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).setAsHorizontalList().getChildByText("
		+ "new UiSelector().className(\"android.widget.TextView\"), \""+textToSearch+"\")"));
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		return element.isDisplayed();
	}	
	
	@SuppressWarnings("deprecation")
	public boolean scrollDownMainPage(String textToSearch) throws InterruptedException {
		Thread.sleep(6000);
		WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		"new UiScrollable(new UiSelector().className(\"androidx.recyclerview.widget.RecyclerView\")).scrollIntoView("
		+ "new UiSelector().text(\""+textToSearch+"\"))"));
		Thread.sleep(6000);
		element.click();
		Thread.sleep(3000);
		return element.isDisplayed();
	}


}
