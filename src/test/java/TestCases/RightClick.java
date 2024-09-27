package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	

	public static void main(String[] args) {
		
	
		 //Config Chrome
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//Access URL
		driver.get("https://demoqa.com/buttons");
		WebElement right_click= driver.findElement(By.id("rightClickBtn"));		
		Actions action = new Actions(driver);
		action.contextClick(right_click).perform();
		String message = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals("You have done a right click",message);
	}

}
