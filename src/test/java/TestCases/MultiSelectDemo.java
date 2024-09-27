package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultiSelectDemo {


	public static void main(String[] args) {
		//configuration de navigateur 
				WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.http.factory", "jdk-http-client");
				ChromeOptions ChromeOptions = new ChromeOptions()    ;
				WebDriver driver = new ChromeDriver(ChromeOptions);
				driver.get("https://demoqa.com/select-menu");
				
				WebElement listeDeroulante = driver.findElement(By.id("cars"));
				
				Select s1 =new Select(listeDeroulante);
				
				List<WebElement> options= s1.getOptions();
				
				
					if (s1.isMultiple())
					{
						s1.selectByIndex(1);
						s1.selectByValue("volvo");
						s1.selectByVisibleText("Audi");
					}
					
			//pour afficher tous les options
					
				for (WebElement op:options) {
					
					//System.out.println(options);
				}
				
		  List<WebElement>	optionselectionne = s1.getAllSelectedOptions();
		  for (WebElement op:optionselectionne) {
			  
			  System.out.println(op.getText());
		  }
		  
				
	}

}
