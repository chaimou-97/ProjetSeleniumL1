package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownDemo {

	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriver driver =  new ChromeDriver(chromeoptions);
		
		driver.get("https://demoqa.com/text-box");
		/*1ere methode Scoll Down */
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)", "");
		WebElement boutton= driver.findElement(By.id("submit"));
		
		/* Pour faire defiler jusqu'a un element specifique soit affiché*/
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",boutton);
		boutton.click();

		
		
	}

}
