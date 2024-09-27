package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	
	public static void main(String[] args) throws IOException {
		
		//configuration de navigateur 
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions ChromeOptions = new ChromeOptions()    ;
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("https://demo.guru99.com/test/upload/");
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) ;//Screenshot enregistrer format file
		FileUtils.copyFile(scrFile, new File("./images.png"));//emplacement du file
	}

}
