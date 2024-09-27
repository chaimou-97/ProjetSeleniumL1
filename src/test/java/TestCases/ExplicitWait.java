package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriver driver =  new ChromeDriver(chromeoptions);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40)); 
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	    driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();
	}

}
