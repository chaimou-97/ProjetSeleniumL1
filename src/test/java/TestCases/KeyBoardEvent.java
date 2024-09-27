package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvent {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriver driver =  new ChromeDriver(chromeoptions);
		
		driver.get("https://kodingwindow.com/testapp/");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		username.sendKeys("Chaima");
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.CONTROL,"c");
		password.sendKeys(Keys.CONTROL,"v");
	}

}
