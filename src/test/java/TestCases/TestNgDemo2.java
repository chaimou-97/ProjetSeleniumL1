package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemo2 {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions ChromeOptions = new ChromeOptions();
		driver = new ChromeDriver(ChromeOptions);
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test
	public void valid_user_credential() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
   @Test	
   public void invalid_user_credential() {
		
		driver.findElement(By.id("user-name")).sendKeys("aaa");
		driver.findElement(By.id("password")).sendKeys("tt");
		driver.findElement(By.id("login-button")).click();
	}
   
   @AfterMethod
   public void tearDown() {

		//driver.quit();
	}
}
