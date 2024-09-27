package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementComand {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("username"));
		
		//Verification de web element si affiché ou non bool return True Or False
		
		Boolean result = username.isDisplayed();
		System.out.println(result);
		
		//Verification de web element si activé  ou non bool return True Or False
		
		Boolean result1 = username.isEnabled();
		System.out.println(result1);
		
		//Verification de web element si existe ou non 
		
		List<WebElement> login = driver.findElements(By.name("username"));
		
		if (login.size()==0) {
			System.out.println("username n existe pqs");
		}
		else {
			System.out.println("username  existe ");
		}
		
        //naviguer vers la page précedente
		driver.navigate().back();
	
		Thread.sleep(5000);
		
		//naviger vers la page suivante
		driver.navigate().forward();
		
		//driver.quit();
	}

}
