package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	

	public static void main(String[] args) {
		//configuration de navigateur 
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions ChromeOptions = new ChromeOptions()    ;
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\chaima\\Desktop\\Test Auto\\XPATH.png");
		
		WebElement checkBox= driver.findElement(By.id("terms"));
		checkBox.click();
		Assert.assertEquals(true,checkBox.isSelected());

	}

}
