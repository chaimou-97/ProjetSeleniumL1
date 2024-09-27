package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemo {


	public WebDriver driver;

	public String filepath = "C:\\Users\\chaima\\Desktop\\Test Auto\\XPATH.png";
	
	public WebDriverWait wait;
	
	@BeforeMethod
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions ChromeOptions = new ChromeOptions();
		driver = new ChromeDriver(ChromeOptions);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(3000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void uploadFileWithRobot(String path) throws AWTException {
		
		StringSelection stringSelection = new StringSelection(path) ;
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		Robot robot= null;
		robot = new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);	
	}
	
	@org.testng.annotations.Test
	public void robotTest() throws AWTException, InterruptedException {
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button"))));
		WebElement boutton =driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button"));
		boutton.click();
		 uploadFileWithRobot(filepath);
		
		
	}
	
	@AfterMethod
	public void tearDown() {

		//driver.quit();
	}

}
