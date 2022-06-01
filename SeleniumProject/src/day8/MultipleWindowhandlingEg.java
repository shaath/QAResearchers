package day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowhandlingEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
		String gmail_wid = driver.getWindowHandle();
//		System.out.println(gmail_wid);

		driver.findElement(By.linkText("Privacy")).click();
		
		Thread.sleep(5000);
		
		Set<String> s = driver.getWindowHandles();
		
		for (String wid : s) 
		{
			System.out.println(wid);
			driver.switchTo().window(wid);
			
			String title = driver.getTitle();
			
			if (title.contains("Privacy Policy")) 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}
		}	
		
	}

}
