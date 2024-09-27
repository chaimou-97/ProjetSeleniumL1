package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowDemo {

	
	public static void main(String[] args) {

		//configuration de navigateur 
				WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.http.factory", "jdk-http-client");

				ChromeOptions ChromeOptions = new ChromeOptions()    ;

				
				WebDriver driver = new ChromeDriver(ChromeOptions);
				
				driver.get("https://demoqa.com/browser-windows/");
				
				driver.manage().window().maximize();
				
				String handle = driver.getWindowHandle();
				//System.out.println(handle);
				driver.findElement(By.id("windowButton")).click();
				Set<String> handles= driver.getWindowHandles();
				System.out.println(handles);
				
	}

}
