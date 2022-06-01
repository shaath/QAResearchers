package day6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshotEg {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();

		WebElement logo = driver.findElement(By.className("lnXdpd"));
		
		String prPath = System.getProperty("user.dir");
		System.out.println(prPath);
		String srPath = prPath+"//src//com//SeleniumProject//screenshots//logo.jpg";
		System.out.println(srPath);
		
		File g = logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(g, new File(srPath));
	
	}

}
