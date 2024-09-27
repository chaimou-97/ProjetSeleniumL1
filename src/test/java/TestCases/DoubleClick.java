package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {


	public static void main(String[] args) {
		
		 //Config Chrome
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//Access URL
		driver.get("https://demoqa.com/buttons");
		WebElement btn_double_click= driver.findElement(By.id("doubleClickBtn"));		
		Actions action = new Actions(driver);
		action.doubleClick(btn_double_click).perform();
		String message = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals("You have done a double clic",message);
		
		
		
		
		
		}

}
