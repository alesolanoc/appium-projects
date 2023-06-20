package appium004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.*;

public class Tests extends AppiumTest004{

	String desiertoUyuni = "Al suroeste de Bolivia, en el departamento de Potosí, se encuentra el salar de Uyuni, un desierto salino tan amplio que puede verse desde el espacio. Caminar en medio de la nada. A veces sobre un suelo pálido e interminable, a veces sobre las nubes. El bl...";
			
	
	@Test
	public void testOne() throws InterruptedException {
		System.out.println("Verify that as user then I can go to details for the first");
		Thread.sleep(18000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(18000);
        driver.findElement(By.linkText(desiertoUyuni)).click();
		Thread.sleep(10000);
        driver.findElement(By.linkText("El desierto de Sal más grande del Mundo Walk 5:30Download")).click();
		Thread.sleep(10000);
        driver.findElement(By.xpath("//i[@class=\"left chevron large icon inverted cursor\"]")).click();
		Thread.sleep(10000);

	}
	
	@Test
	public void testTwo() throws InterruptedException {
		System.out.println("Testinggggggg...2");
		Thread.sleep(18000);
		driver.get("https://traveler.jalasoft.com/home");
		Thread.sleep(18000);
	}

}
