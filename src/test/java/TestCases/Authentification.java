package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentification {

	public static void main(String[] args) {
		
        //Config Chrome
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		
		//Access URL
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String titre = driver.findElement(By.cssSelector(".title")).getText();
		System.out.println(titre);

		Assert.assertEquals("Products", titre);
		
		
		driver.quit();
		}

}
