package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Sh");
		Thread.sleep(5000);
		
		List<WebElement> cities = driver.findElements(By.xpath("//section[@id='search']//ul/li"));
		
		System.out.println(cities.size());
		
		for(int i = 0; i < cities.size(); i++)
		{
			String city = cities.get(i).getText();
			System.out.println(city);
			
			if (city.equalsIgnoreCase("Shimla"))
			{
				cities.get(i).click();
				break;
			}
		}
		
	}

}
