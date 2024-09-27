package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {


	public static void main(String[] args) {
		
		//configuration de navigateur 
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions ChromeOptions = new ChromeOptions()    ;

		
		WebDriver driver = new ChromeDriver(ChromeOptions);
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e");
		WebElement image1 = driver.findElement(By.xpath("//*[@src='Jmeter720.png']"));
		image1.click();
		
		driver.switchTo().defaultContent();/*switch to the main page*/
		//driver.switchTo().parentFrame(); /*switch to the parent page*/
		 driver.findElement(By.id("philadelphia-field-email")).sendKeys("cha@yahoo.fr");
		
		
		
		
		
		
		
		
		
		
	}

}
