package TestCases;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement dropp =driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, dropp).perform();
		
		String textedropped = dropp.getText();
		
		Assert.assertEquals("Dropped!",textedropped);
		
		driver.quit();

		
	}

}
