package appium007;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Tests extends AppiumTest007 {
/*	@Test
	public void testOne() throws InterruptedException {
		String tittleText = "El desierto de Sal más grande del Mundo";
		String detailText = "Al suroeste de Bolivia, en el departamento de Potosí";
	
		ExtentTest test1 = extent.createTest("Test1","Verify that as user then I can go to details for the first suggestion that is being displayed at top");
		test1.log(Status.INFO, "Test one started");
		System.out.println("Verify that as user then I can go to details for the first suggestion that is being displayed at top");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
		if (elementNot == false) {
   			test1.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test1.log(Status.PASS,"assertion1 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test1.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test1.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test1.log(Status.PASS,"assertion2 passed");
   		}

//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")));
//		String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText1.contains(detailText));
//		test1.log(Status.PASS,"assertion passed");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test1.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test1.log(Status.PASS,"assertion3 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText));
//		test1.log(Status.PASS,"assertion passed");
		test1.log(Status.INFO, "Test one Finished");
	}


	@Test
	public void testTwo() throws InterruptedException {
		String tittleText = "Pubs - Discotecas La Paz";
		String detailText = "Pubs - Discotecas La Paz";
		ExtentTest test2 = extent.createTest("Test2","Verify that as user then I can go to details for the first suggestion that is being displayed in the grid");
		
		test2.log(Status.INFO, "Test two started");
		System.out.println("Verify that as user then I can go to details for the first suggestion that is being displayed in the grid");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test2.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   			String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test2.log(Status.PASS,"assertion1 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test2.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test2.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText.contains(detailText1));
   			test2.log(Status.PASS,"assertion2 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")));
//		String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText.contains(detailText1));
//		test2.log(Status.PASS,"assertion passed");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test2.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test2.log(Status.PASS,"assertion3 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText));
//		test2.log(Status.PASS,"assertion passed");
		test2.log(Status.INFO, "Test two Finished");
	}
*/
	@Test
	public void testTree() throws InterruptedException {
		String tittleText = "Pubs - Discotecas La Paz";
		String detailText = "Pubs - Discotecas La Paz";
		ExtentTest test3 = extent.createTest("Test3","Verify that as user then I can go to details for the first suggestion that is being displayed in the grid after scroll down to the end");
		
		test3.log(Status.INFO, "Test tree started");
		System.out.println("Verify that as user then I can go to details for the first suggestion that is being displayed in the grid after scroll down to the end");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")).size() != 0;
   		if (elementNot == false) {
   			test3.log(Status.FAIL,"assertion failed");
   		}
   		else {
   			Point locationY = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")).getLocation();
   			Assert.assertEquals(locationY.y,136);
   			test3.log(Status.PASS,"assertion1 passed");
   		}
//		Point locationY = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")).getLocation();
//		Assert.assertEquals(locationY.y,136);
//		test3.log(Status.PASS,"assertion passed");
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test3.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test3.log(Status.PASS,"assertion2 passed");
   		}   		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test3.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test3.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText.contains(detailText1));
   			test3.log(Status.PASS,"assertion3 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")));
//		String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText.contains(detailText1));
//		test3.log(Status.PASS,"assertion passed");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot3 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot3 == false) {
   			test3.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test3.log(Status.PASS,"assertion4 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText));
//		test3.log(Status.PASS,"assertion passed");
		test3.log(Status.INFO, "Test tree Finished");
	}
/*
	@Test
	@SuppressWarnings("deprecation")
	public void testFour() throws InterruptedException {
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
   		Boolean elementNot = driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)")).size() != 0;
   		if (elementNot == false) {
   			test4.log(Status.FAIL,"assertion failed");
   		}
   		else {
   			Point locationY1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)")).getLocation();
   			Assert.assertEquals(locationY1.y,290);
   			test4.log(Status.PASS,"assertion passed");
   		}		
//		Point locationY1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)")).getLocation();
//		Assert.assertEquals(locationY1.y,290);
//		test4.log(Status.PASS,"assertion passed");
		Thread.sleep(4000);
		test4.log(Status.INFO, "Test four Finished");
	}

	@Test
	@SuppressWarnings("deprecation")
	public void testFive() throws InterruptedException {
		ExtentTest test5 = extent.createTest("Test5","Verify that as user then I can scroll right and go to details for the first suggestion that is being displayed at top");
		
		test5.log(Status.INFO, "Test five started");
		System.out.println("Verify that as user then I can scroll right and go to details for the first suggestion that is being displayed at top");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		String tittleText = "Camino a la Cerveceria Taqui";
		String detailText = "es una empresa con m";
		String textToSearch="Camino a la Cerveceria Taqui";
////		String valuee = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().textStartsWith(\""+textToSearch+"\"))")).getText();
		String valuee = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.view.View\")).setAsHorizontalList().scrollIntoView("
				+ "new UiSelector().descriptionContains(\"textToSearch\"))")).getText();
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test5.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test5.log(Status.PASS,"assertion1 passed");
   		}
//      new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//      String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test5.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, tittleText)]")).click();
		Thread.sleep(3000);
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test5.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test5.log(Status.PASS,"assertion2 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")));
//		String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText1.contains(detailText));
//		test5.log(Status.PASS,"assertion passed");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
		String tittleText1 = "El desierto de Sal más grande del Mundo";
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test5.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();		
   			Assert.assertTrue(detailText2.contains(tittleText1));
   			test5.log(Status.PASS,"assertion3 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();		
//		Assert.assertTrue(detailText2.contains(tittleText1));
//		test5.log(Status.PASS,"assertion passed");
		test5.log(Status.INFO, "Test five Finished");
	}

	@Test
	public void testSix() throws InterruptedException {
		String tittleText = "Camino a la Cerveceria Taqui";
		ExtentTest test6 = extent.createTest("Test6","Verify that as user then I can go to next from top and return to the first suggestion");
		
		test6.log(Status.INFO, "Test six started");
		System.out.println("Verify that as user then I can go to next from top and return to the first suggestion");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.widget.TextView[@bounds='[965,699][1014,741]']")).size() != 0;
   		if (elementNot == false) {
   			test6.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        driver.findElement(By.xpath("//android.widget.TextView[@bounds='[965,699][1014,741]']")).click();
   			test6.log(Status.PASS,"assertion1 passed");
   		}
//		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@bounds='[965,699][1014,741]']")));
//        driver.findElement(By.xpath("//android.widget.TextView[@bounds='[965,699][1014,741]']")).click();
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test6.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test6.log(Status.PASS,"assertion2 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test6.log(Status.PASS,"assertion passed");
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.widget.TextView[@bounds='[783,699][830,741]']")).size() != 0;
   		if (elementNot2 == false) {
   			test6.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   	        driver.findElement(By.xpath("//android.widget.TextView[@bounds='[783,699][830,741]']")).click();
   			test6.log(Status.PASS,"assertion3 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@bounds='[783,699][830,741]']")));
//        driver.findElement(By.xpath("//android.widget.TextView[@bounds='[783,699][830,741]']")).click();
		String tittleText1 = "El desierto de Sal más grande del Mundo";
   		Boolean elementNot3 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).size() != 0;
   		if (elementNot3 == false) {
   			test6.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   	        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell1.contains(tittleText1));
   			test6.log(Status.PASS,"assertion4 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")));
//        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell1.contains(tittleText1));
//		test6.log(Status.PASS,"assertion passed");
		Thread.sleep(4000);
		test6.log(Status.INFO, "Test six Finished");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSeven() throws InterruptedException {
		String tittleText = "Incallajta";
		ExtentTest test7 = extent.createTest("Test7","Verify that as user then I can scroll to last suggestion searching by text");
		
		test7.log(Status.INFO, "Test seven started");
		System.out.println("Verify that as user then I can scroll to last suggestion searching by text");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Incallajta\"))"));
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test7.log(Status.FAIL,"assertion failed");
   		}
   		else {
   	        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell1.contains(tittleText));
   			test7.log(Status.PASS,"assertion passed");
   		}
//        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell1.contains(tittleText));
//		test7.log(Status.PASS,"assertion passed");
		Thread.sleep(4000);
		test7.log(Status.INFO, "Test seven Finished");
	}

	@Test
	public void testEight() throws InterruptedException {
		String tittleText = "Incallajta";
		String detailText = "El sitio arqueológico de Incallajta, con una superficie de 67 hectáreas";
		ExtentTest test8 = extent.createTest("Test8","Verify that as user then I can search by text");
		
		test8.log(Status.INFO, "Test eight started");
		System.out.println("Verify that as user then I can search by text");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(tittleText);
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		Thread.sleep(3000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test8.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test8.log(Status.PASS,"assertion1 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test8.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test8.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test8.log(Status.PASS,"assertion2 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")));
//		String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText1.contains(detailText));
//		test8.log(Status.PASS,"assertion passed");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test8.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test8.log(Status.PASS,"assertion3 passed");
   		}        
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText));
//		test8.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("");
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		Thread.sleep(3000);
		test8.log(Status.INFO, "Test eight Finished");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testNine() throws InterruptedException {
		String tittleText = "VER TODOS";
		String detailText = "Incallajta";
		String giveLikes = "";
		ExtentTest test9 = extent.createTest("Test9","Verify that as user then I give a like");
		
		test9.log(Status.INFO, "Test nine started");
		System.out.println("Verify that as user then I give a like");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test9.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test9.log(Status.PASS,"assertion1 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test9.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Incallajta\"))"));
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test9.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell1.contains(detailText));
   			test9.log(Status.PASS,"assertion2 passed");
   		}
//        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell1.contains(detailText));
//		test9.log(Status.PASS,"assertion passed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).click();
		Thread.sleep(4000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test9.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).click();
   			test9.log(Status.PASS,"assertion3 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")));
//		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).click();
		Thread.sleep(4000);
		test9.log(Status.INFO, "Test nine Finished");
	}

	@Test
	public void testTen() throws InterruptedException {
		String tittleText = "Incallajta";
		String detailText = "El sitio arqueológico de Incallajta, con una superficie de 67 hectáreas";
		ExtentTest test10 = extent.createTest("Test10","Verify that as user then I can search by text after pressed explorer icon");
		
		test10.log(Status.INFO, "Test ten started");
		System.out.println("Verify that as user then I can search by text after pressed explorer icon");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'EXPLORAR')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(tittleText);
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		Thread.sleep(3000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test10.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test10.log(Status.PASS,"assertion1 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test10.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test10.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   			String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText1.contains(detailText));
   			test10.log(Status.PASS,"assertion2 passed");
   		}
//   		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")));
//		String detailText1 = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText1.contains(detailText));
//		test10.log(Status.PASS,"assertion passed");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test10.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText));
   			test10.log(Status.PASS,"assertion3 passed");
   		}
//   		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText));
//		test10.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("");
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		test10.log(Status.INFO, "Test ten Finished");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testEleven() throws InterruptedException {
		String tittleText = "VER TODOS";
		String detailText = "Incallajta";
		String giveLikes = "";
		String tittleText1 = "El desierto de Sal más grande del Mundo";
		ExtentTest test11 = extent.createTest("Test11","Verify that as user then I give a like then it is displayed in my favorites section");
		
		test11.log(Status.INFO, "Test eleven started");
		System.out.println("Verify that as user then I give a like then it is displayed in my favorites section");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test11.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test11.log(Status.PASS,"assertion1 passed");
   		}
//   		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test11.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Incallajta\"))"));
   		Boolean elementNot4 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot4 == false) {
   			test11.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell1.contains(detailText));
   			test11.log(Status.PASS,"assertion2 passed");
   		}		
//        String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell1.contains(detailText));
//		test11.log(Status.PASS,"assertion passed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).click();
		Thread.sleep(4000);
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test11.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).click();
   			test11.log(Status.PASS,"assertion3 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")));
//		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test11.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText1));
   			test11.log(Status.PASS,"assertion4 passed");
   		}        
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText1));
//		test11.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'FAVORITOS')]")).click();
		Thread.sleep(4000);
   		Boolean elementNot3 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot3 == false) {
   			test11.log(Status.FAIL,"assertion5 failed");
   		}
   		else {
   			String detailText3 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailText3.contains(detailText));
   			test11.log(Status.PASS,"assertion5 passed");
   		}
//   		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")));
//		String detailText3 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailText3.contains(detailText));
//		test11.log(Status.PASS,"assertion passed");
		test11.log(Status.INFO, "Test eleven Finished");
	}

*/
	@SuppressWarnings("deprecation")
	@Test
	public void testTwelve() throws InterruptedException {
		String tittleText = "VER TODOS";
		String detailText = "Incallajta";
		String giveLikes = "";
		String tittleText1 = "El desierto de Sal más grande del Mundo";
		ExtentTest test12 = extent.createTest("Test12","Verify that as user then I give an unlike then it is not displayed in my favorites section");
		
		test12.log(Status.INFO, "Test twelve started");
		System.out.println("Verify that as user then I give an unlike then it is not displayed in my favorites section");
		Thread.sleep(4000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(4000);
   		Boolean elementNot = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).size() != 0;
   		if (elementNot == false) {
   			test12.log(Status.FAIL,"assertion1 failed");
   		}
   		else {
   	        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell.contains(tittleText));
   			test12.log(Status.PASS,"assertion1 passed");
   		}
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")));
//        String detailTextfromCell = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell.contains(tittleText));
//		test12.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText+"')]")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Incallajta\"))"));
   		Boolean elementNot1 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).size() != 0;
   		if (elementNot1 == false) {
   			test12.log(Status.FAIL,"assertion2 failed");
   		}
   		else {
   	   		String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
   			Assert.assertTrue(detailTextfromCell1.contains(detailText));
   			test12.log(Status.PASS,"assertion2 passed");
   		}        
//   		String detailTextfromCell1 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).getText();
//		Assert.assertTrue(detailTextfromCell1.contains(detailText));
//		test12.log(Status.PASS,"assertion passed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).click();
		Thread.sleep(4000);
   		Boolean elementNot2 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).size() != 0;
   		if (elementNot2 == false) {
   			test12.log(Status.FAIL,"assertion3 failed");
   		}
   		else {
   			driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).click();
   			test12.log(Status.PASS,"assertion3 passed");
   		}		
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")));
//		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '"+giveLikes+"')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '')]")).click();
        Thread.sleep(3000);
   		Boolean elementNot3 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).size() != 0;
   		if (elementNot3 == false) {
   			test12.log(Status.FAIL,"assertion4 failed");
   		}
   		else {
   			String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();
   			Assert.assertTrue(detailText2.contains(tittleText1));
   			test12.log(Status.PASS,"assertion4 passed");
   		}        
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")));
//		String detailText2 = driver.findElement(By.xpath("//android.view.View[contains(@text, '"+tittleText1+"')]")).getText();
//		Assert.assertTrue(detailText2.contains(tittleText1));
//		test12.log(Status.PASS,"assertion passed");
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'FAVORITOS')]")).click();
		Thread.sleep(4000);
   		Boolean elementNot4 = driver.findElements(By.xpath("//android.view.View[contains(@text, '"+detailText+"')]")).size() != 0;
   		System.out.println(elementNot);
   		if (elementNot4 == true) {
   			test12.log(Status.FAIL,"assertion5 failed");
   		}
   		else {
   	   		Assert.assertTrue(elementNot,"Targeted element is not present on screen");
   			test12.log(Status.PASS,"assertion5 passed");
   		}
		test12.log(Status.INFO, "Test twelve Finished");
	}
	
}
