package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorVerify {



	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriver driver =  new ChromeDriver(chromeoptions);
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement boutton = driver.findElement(By.id("doubleClickBtn"));
		String color = boutton.getCssValue("background-color");
		System.out.println(color);
		
		Color couleur = Color.fromString(color);
		System.out.println(couleur.asHex());
		
		Assert.assertEquals("#007bff", couleur.asHex());
	}

}
