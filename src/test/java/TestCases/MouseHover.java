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

public class MouseHover {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriver driver =  new ChromeDriver(chromeoptions);
		
		driver.get("https://demoqa.com/menu/");
		
		WebElement menu = driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		WebElement subitem = driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/ul/li[1]/a"));
		
		boolean result = subitem.isDisplayed();
		
	    Assert.assertEquals(true, result);
	    
	    driver.quit();
		
	}

}
