package appium009;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import appium009.Pages.DetailPage;
import appium009.Pages.MainPage;

public class Tests extends AppiumTest009{
	@Test
	public void testOne() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		DetailPage detailPage = new DetailPage(driver);
		
		ExtentTest test1 = extent.createTest("Test1","Verify that as user then I can go to details for the first suggestion that is being displayed at top");
		test1.log(Status.INFO, "Test one started");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		
		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
		if (elementNot == false) {
   			test1.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(mainPage.tittleTextprivate));
   			test1.log(Status.PASS,"assertion1 passed");
   		}
		mainPage.clickOverfirstTrending();
		
		Thread.sleep(3000);
		Boolean elementNot1 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot1 == false) {
   			test1.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	        String detailText1 = detailPage.getfirstTrendingDetailPage();
  			Assert.assertTrue(detailText1.contains(detailPage.detailTextprivate)); 
   			test1.log(Status.PASS,"assertion2 passed");
   		}

        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
		Boolean elementNot2 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot2 == false) {
   			test1.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   	        String detailText2 = mainPage.getfirstTrending();
   			Assert.assertTrue(detailText2.contains(mainPage.tittleTextprivate));
   			test1.log(Status.PASS,"assertion3 passed");
   		}
		test1.log(Status.INFO, "Test one Finished");
	}
	
	@Test
	public void testTwo() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		DetailPage detailPage = new DetailPage(driver);
		ExtentTest test2 = extent.createTest("Test2","Verify that as user then I can go to details for the first suggestion that is being displayed in the grid");
		
		test2.log(Status.INFO, "Test two started");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		Boolean elementNot = mainPage.getSizefirstMorePopular() != 0;
   		if (elementNot == false) {
   			test2.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   			String detailTextfromCell = mainPage.getfirstMorePopular();
   			Assert.assertTrue(detailTextfromCell.contains(mainPage.tittleTextFirstMorePopular));
   			test2.log(Status.PASS,"assertion1 passed");
   		}
   		mainPage.clickOverfirstMorePopular();
		Thread.sleep(3000);
		Boolean elementNot1 = detailPage.getSizefirstMorePopularDetailPage() != 0;
   		if (elementNot1 == false) {
   			test2.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = detailPage.getfirstMorePopularDetailPage();
   			Assert.assertTrue(detailText1.contains(mainPage.tittleTextFirstMorePopular));
   			test2.log(Status.PASS,"assertion2 passed");
   		}
        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
   		Boolean elementNot2 = mainPage.getSizefirstMorePopular() != 0;
   		if (elementNot2 == false) {
   			test2.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = mainPage.getfirstMorePopular();
   			Assert.assertTrue(detailText2.contains(mainPage.tittleTextFirstMorePopular));
   			test2.log(Status.PASS,"assertion3 passed");
   		}
		test2.log(Status.INFO, "Test two Finished");
	}
	
}
