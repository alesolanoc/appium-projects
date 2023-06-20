package appium010;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import Pages.DetailPage;
import Pages.MainPage;
import appium010.AppiumTest010;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Tests extends AppiumTest010{
/*	@Test
	public void testOne() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"El desierto de Sal más grande del Mundo");
		DetailPage detailPage = new DetailPage(driver,"El desierto de Sal más grande del Mundo");
		
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
		MainPage mainPage = new MainPage(driver,"Pubs - Discotecas La Paz");
		DetailPage detailPage = new DetailPage(driver,"Pubs - Discotecas La Paz");
		ExtentTest test2 = extent.createTest("Test2","Verify that as user then I can go to details for the first suggestion that is being displayed in the grid");
		
		test2.log(Status.INFO, "Test two started");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test2.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   			String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(mainPage.tittleTextprivate));
   			test2.log(Status.PASS,"assertion1 passed");
   		}
   		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
		Boolean elementNot1 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot1 == false) {
   			test2.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = detailPage.getfirstTrendingDetailPage();
   			Assert.assertTrue(detailText1.contains(mainPage.tittleTextprivate));
   			test2.log(Status.PASS,"assertion2 passed");
   		}
        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
   		Boolean elementNot2 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot2 == false) {
   			test2.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = mainPage.getfirstTrending();
   			Assert.assertTrue(detailText2.contains(mainPage.tittleTextprivate));
   			test2.log(Status.PASS,"assertion3 passed");
   		}
		test2.log(Status.INFO, "Test two Finished");
	}

	@Test
	public void testTree() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Pubs - Discotecas La Paz");
		DetailPage detailPage = new DetailPage(driver,"Pubs - Discotecas La Paz");
		ExtentTest test3 = extent.createTest("Test3","Verify that as user then I can go to details for the first suggestion that is being displayed in the grid after scroll down to the end");
		
		test3.log(Status.INFO, "Test tree started");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.scrollDownMainPage() != 0;
   		if (elementNot == false) {
   			test3.log(Status.FAIL,"assertion failed");
   		}
   		else {
   			org.openqa.selenium.Point locationY = mainPage.getLocationAfterscrollDownMainPage();
   			Assert.assertEquals(locationY.y,136);
   			test3.log(Status.PASS,"assertion1 passed");
   		}
   		Boolean elementNot1 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot1 == false) {
   			test3.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(mainPage.tittleTextprivate));
   			test3.log(Status.PASS,"assertion2 passed");
   		}   		
   		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
   		Boolean elementNot2 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot2 == false) {
   			test3.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText1 = detailPage.getfirstTrendingDetailPage();
   			Assert.assertTrue(detailPage.detailTextprivate.contains(detailText1));
   			test3.log(Status.PASS,"assertion3 passed");
   		}		
        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
   		Boolean elementNot3 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot3 == false) {
   			test3.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   			String detailText2 = mainPage.getfirstTrending();
   			Assert.assertTrue(detailText2.contains(mainPage.tittleTextprivate));
   			test3.log(Status.PASS,"assertion4 passed");
   		}
		test3.log(Status.INFO, "Test tree Finished");
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void testFour() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Pubs - Discotecas La Paz");
		ExtentTest test4 = extent.createTest("Test4","Verify that as user then I can scroll down and scroll up and go to details for the first suggestion that is being displayed at top");
		
		test4.log(Status.INFO, "Test four started");
		
		System.out.println("Verify that as user then I can scroll down and scroll up and go to details for the first suggestion that is being displayed at top");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		
		@SuppressWarnings("rawtypes")
		TouchAction  action =new TouchAction(driver);	
		org.openqa.selenium.Dimension size	=driver.manage().window().getSize();
		int width=size.width;
		int height=size.height;				
		int middleOfX=width/2;
		int startYCoordinate= (int)(height*.7);
		int endYCoordinate= (int)(height*.2);
						
		action.press(PointOption.point(middleOfX, startYCoordinate))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.scrollDownMainPage() != 0;
   		if (elementNot == false) {
   			test4.log(Status.FAIL,"assertion failed");
   		}
   		else {
   			org.openqa.selenium.Point locationY1 = mainPage.getLocationAfterscrollUpMainPage();
   			Assert.assertEquals(locationY1.y,290);
   			test4.log(Status.PASS,"assertion passed");
   		}		
		Thread.sleep(4000);
		test4.log(Status.INFO, "Test four Finished");
	}

	@Test
	@SuppressWarnings("deprecation")
	public void testFive() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Camino a la Cerveceria Taqui");
		DetailPage detailPage = new DetailPage(driver,"es una empresa con m");
		ExtentTest test5 = extent.createTest("Test5","Verify that as user then I can scroll right and go to details for the first suggestion that is being displayed at top");
		
		test5.log(Status.INFO, "Test five started");
		System.out.println("Verify that as user then I can scroll right and go to details for the first suggestion that is being displayed at top");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		String tittleText = "Camino a la Cerveceria Taqui";
		String detailText = "es una empresa con m";
		String textToSearch="Camino a la Cerveceria Taqui";
		String valuee = mainPage.getTextFromNext();
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test5.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test5.log(Status.PASS,"assertion1 passed");
   		}
   		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
   		Boolean elementNot1 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot1 == false) {
   			test5.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = detailPage.getfirstTrendingDetailPage();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test5.log(Status.PASS,"assertion2 passed");
   		}
        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
        MainPage mainPage1 = new MainPage(driver,"El desierto de Sal más grande del Mundo");
		String tittleText1 = "El desierto de Sal más grande del Mundo";
   		Boolean elementNot2 = mainPage1.getSizefirstTrending() != 0;
   		if (elementNot2 == false) {
   			test5.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = mainPage1.getfirstTrending();		
   			Assert.assertTrue(detailText2.contains(tittleText1));
   			test5.log(Status.PASS,"assertion3 passed");
   		}
		test5.log(Status.INFO, "Test five Finished");
	}

	@Test
	public void testSix() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Camino a la Cerveceria Taqui");
		DetailPage detailPage = new DetailPage(driver,"");
		String tittleText = "Camino a la Cerveceria Taqui";
		ExtentTest test6 = extent.createTest("Test6","Verify that as user then I can go to next from top and return to the first suggestion");
		
		test6.log(Status.INFO, "Test six started");
		System.out.println("Verify that as user then I can go to next from top and return to the first suggestion");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.getSizeUsingBounds() != 0;
   		if (elementNot == false) {
   			test6.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   			mainPage.clickUsingBounds();
   			test6.log(Status.PASS,"assertion1 passed");
   		}
   		Boolean elementNot1 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot1 == false) {
   			test6.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test6.log(Status.PASS,"assertion2 passed");
   		}
   		Boolean elementNot2 = detailPage.getSizeUsingBoundsDetail() != 0;
   		if (elementNot2 == false) {
   			test6.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   	        detailPage.clickUsingBoundsDetail();
   			test6.log(Status.PASS,"assertion3 passed");
   		}
		String tittleText1 = "El desierto de Sal más grande del Mundo";
		MainPage mainPage1 = new MainPage(driver,"El desierto de Sal más grande del Mundo");
   		Boolean elementNot3 = mainPage1.getSizefirstTrending() != 0;
   		if (elementNot3 == false) {
   			test6.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   	        String detailTextfromCell1 = mainPage1.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell1.contains(tittleText1));
   			test6.log(Status.PASS,"assertion4 passed");
   		}		
		Thread.sleep(4000);
		test6.log(Status.INFO, "Test six Finished");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSeven() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Incallajta");
		String tittleText = "Incallajta";
		ExtentTest test7 = extent.createTest("Test7","Verify that as user then I can scroll to last suggestion searching by text");
		test7.log(Status.INFO, "Test seven started");
		System.out.println("Verify that as user then I can scroll to last suggestion searching by text");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		mainPage.scrollDownByText();
		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
		if (elementNot == false) {
			test7.log(Status.FAIL,"assertion failed");
		}
		else {
			String detailTextfromCell1 = mainPage.getfirstTrending();
			Assert.assertTrue(detailTextfromCell1.contains(tittleText));
			test7.log(Status.PASS,"assertion passed");
		}
		Thread.sleep(4000);
		test7.log(Status.INFO, "Test seven Finished");
	}

	@Test
	public void testEight() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Incallajta");
		DetailPage detailPage = new DetailPage(driver,"El sitio arqueológico de Incallajta, con una superficie de 67 hectáreas");
		String tittleText = "Incallajta";
		String detailText = "El sitio arqueológico de Incallajta, con una superficie de 67 hectáreas";
		ExtentTest test8 = extent.createTest("Test8","Verify that as user then I can search by text");
		
		test8.log(Status.INFO, "Test eight started");
		System.out.println("Verify that as user then I can search by text");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		mainPage.clickTextField();
		mainPage.sendTextField(tittleText);
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		Thread.sleep(3000);
   		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test8.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test8.log(Status.PASS,"assertion1 passed");
   		}
   		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
   		Boolean elementNot1 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot1 == false) {
   			test8.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = detailPage.getfirstTrendingDetailPage();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test8.log(Status.PASS,"assertion2 passed");
   		}		
        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
   		Boolean elementNot2 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot2 == false) {
   			test8.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = detailPage.getfirstTrendingDetailPage();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test8.log(Status.PASS,"assertion3 passed");
   		}        
		mainPage.clickTextField();
		mainPage.sendTextField("");
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		Thread.sleep(3000);
		test8.log(Status.INFO, "Test eight Finished");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testNine() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"VER TODOS");
		DetailPage detailPage = new DetailPage(driver,"");

		String tittleText = "VER TODOS";
		String detailText = "Incallajta";
		String giveLikes = "";
		ExtentTest test9 = extent.createTest("Test9","Verify that as user then I give a like");
		test9.log(Status.INFO, "Test nine started");
		System.out.println("Verify that as user then I give a like");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test9.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test9.log(Status.PASS,"assertion1 passed");
   		}		
		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
		mainPage.scrollDownByText();
		Thread.sleep(3000);
		MainPage mainPage1 = new MainPage(driver,"Incallajta");
		Thread.sleep(3000);
   		Boolean elementNot1 = mainPage1.getSizefirstTrending() != 0;
   		if (elementNot1 == false) {
   			test9.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	        String detailTextfromCell1 = mainPage1.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell1.contains(detailText));
   			test9.log(Status.PASS,"assertion2 passed");
   		}
		Thread.sleep(4000);
		mainPage1.clickOverfirstTrending();
		Thread.sleep(4000);
   		Boolean elementNot2 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot2 == false) {
   			test9.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			detailPage.givesLike();
   			Thread.sleep(4000);
   			detailPage.clickOverBackElement();
   			test9.log(Status.PASS,"assertion3 passed");
   		}		
		Thread.sleep(4000);
		test9.log(Status.INFO, "Test nine Finished");
	}

	@Test
	public void testTen() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"Incallajta");
		DetailPage detailPage = new DetailPage(driver,"El sitio arqueológico de Incallajta, con una superficie de 67 hectáreas");
		String tittleText = "Incallajta";
		String detailText = "El sitio arqueológico de Incallajta, con una superficie de 67 hectáreas";
		ExtentTest test10 = extent.createTest("Test10","Verify that as user then I can search by text after pressed explorer icon");
		
		test10.log(Status.INFO, "Test ten started");
		System.out.println("Verify that as user then I can search by text after pressed explorer icon");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		mainPage.clickExploreText();
		Thread.sleep(3000);
		mainPage.clickTextField();
		mainPage.sendTextField(tittleText);
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		Thread.sleep(3000);
   		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test10.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test10.log(Status.PASS,"assertion1 passed");
   		}
   		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
   		Boolean elementNot1 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot1 == false) {
   			test10.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = detailPage.getfirstTrendingDetailPage();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test10.log(Status.PASS,"assertion2 passed");
   		}
        Thread.sleep(3000);
        detailPage.clickOverBackElement();
        Thread.sleep(3000);
   		Boolean elementNot2 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot2 == false) {
   			test10.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = mainPage.getfirstTrending();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test10.log(Status.PASS,"assertion3 passed");
   		}
		mainPage.clickTextField();
		mainPage.sendTextField("");
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		test10.log(Status.INFO, "Test ten Finished");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testEleven() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"VER TODOS");
		DetailPage detailPage = new DetailPage(driver,"");
		String tittleText = "VER TODOS";
		String detailText = "Incallajta";
		String giveLikes = "";
		String tittleText1 = "El desierto de Sal más grande del Mundo";
		ExtentTest test11 = extent.createTest("Test11","Verify that as user then I give an unlike then it is not displayed in my favorites section");
		
		test11.log(Status.INFO, "Test eleven started");
		System.out.println("Verify that as user then I give an unlike then it is not displayed in my favorites section");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test11.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test11.log(Status.PASS,"assertion1 passed");
   		}
   		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
		mainPage.scrollDownByText();
		Thread.sleep(3000);
		MainPage mainPage1 = new MainPage(driver,"Incallajta");
   		Boolean elementNot1 = mainPage1.getSizefirstTrending() != 0;
   		if (elementNot1 == false) {
   			test11.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	   		String detailTextfromCell1 = mainPage1.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell1.contains(detailText));
   			test11.log(Status.PASS,"assertion2 passed");
   		}        
		Thread.sleep(4000);
		mainPage1.clickOverfirstTrending();
		Thread.sleep(4000);
		Boolean elementNot2 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot2 == false) {
   			test11.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			detailPage.givesLike();
   			test11.log(Status.PASS,"assertion3 passed");
   		}		
		Thread.sleep(4000);
		detailPage.clickOverBackElement();		
        Thread.sleep(3000);
   		Boolean elementNot3 = mainPage.getSizefirstTrending() != 0;
   		if (elementNot3 == false) {
   			test11.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   			String detailText2 = mainPage.getfirstTrending();
   			Assert.assertTrue(detailText2.contains(tittleText1));
   			test11.log(Status.PASS,"assertion4 passed");
   		}        
   		Thread.sleep(3000);
   		detailPage.clickFAvoritiesText();
		Thread.sleep(4000);
   		Boolean elementNot4 = mainPage1.getSizefirstTrending() != 0;
   		System.out.println(elementNot);
   		if (elementNot4 == true) {
   			test11.log(Status.FAIL,"assertion5 failed");
   		}
   		else {
   	   		Assert.assertTrue(elementNot,"Targeted element is not present on screen");
   			test11.log(Status.PASS,"assertion5 passed");
   		}
		test11.log(Status.INFO, "Test eleven Finished");
	}
*/
	@SuppressWarnings("deprecation")
	@Test
	public void testTwelve() throws InterruptedException {
		MainPage mainPage = new MainPage(driver,"VER TODOS");
		DetailPage detailPage = new DetailPage(driver,"");
		String tittleText = "VER TODOS";
		String detailText = "Incallajta";
		String giveLikes = "";
		String tittleText1 = "El desierto de Sal más grande del Mundo";
		ExtentTest test12 = extent.createTest("Test12","Verify that as user then I give a like then it is displayed in my favorites section");
		
		test12.log(Status.INFO, "Test eleven started");
		System.out.println("Verify that as user then I give a like then it is displayed in my favorites section");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = mainPage.getSizefirstTrending() != 0;
   		if (elementNot == false) {
   			test12.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = mainPage.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test12.log(Status.PASS,"assertion1 passed");
   		}
		mainPage.clickOverfirstTrending();
		Thread.sleep(3000);
		mainPage.scrollDownByText();
		Thread.sleep(3000);
		MainPage mainPage1 = new MainPage(driver,"Incallajta");
   		Boolean elementNot4 = mainPage1.getSizefirstTrending() != 0;
   		if (elementNot4 == false) {
   			test12.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailTextfromCell1 = mainPage1.getfirstTrending();
   			Assert.assertTrue(detailTextfromCell1.contains(detailText));
   			test12.log(Status.PASS,"assertion2 passed");
   		}		
		Thread.sleep(4000);
		mainPage1.clickOverfirstTrending();
		Thread.sleep(4000);
   		Boolean elementNot1 = detailPage.getSizefirstTrendingDetailPage() != 0;
   		if (elementNot1 == false) {
   			test12.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			detailPage.givesLike();
   			test12.log(Status.PASS,"assertion3 passed");
   		}		
		Thread.sleep(4000);
		detailPage.clickOverBackElement();
        Thread.sleep(3000);
        MainPage mainPage2 = new MainPage(driver,"El desierto de Sal más grande del Mundo");
   		Boolean elementNot2 = mainPage2.getSizefirstTrending() != 0;
   		if (elementNot2 == false) {
   			test12.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   			String detailText2 = mainPage2.getfirstTrending();
   			Assert.assertTrue(detailText2.contains(tittleText1));
   			test12.log(Status.PASS,"assertion4 passed");
   		}        
   		detailPage.clickFAvoritiesText();
		Thread.sleep(4000);
   		Boolean elementNot3 = mainPage1.getSizefirstTrending() != 0;
   		if (elementNot3 == false) {
   			test12.log(Status.FAIL,"assertion5 failed");
   		}
   		else {
   			String detailText3 = mainPage1.getfirstTrending();
   			Assert.assertTrue(detailText3.contains(detailText));
   			test12.log(Status.PASS,"assertion5 passed");
   		}
		test12.log(Status.INFO, "Test twelve Finished");
	}
	
}
