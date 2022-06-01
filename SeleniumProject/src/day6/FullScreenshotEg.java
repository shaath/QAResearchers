package day6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenshotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		driver.manage().window().maximize();
		
		Thread.sleep(15000);
		
		String prPath = System.getProperty("user.dir");
		System.out.println(prPath);
		String srPath = prPath+"//src//com//SeleniumProject//screenshots//bingfullpage.gif";
		System.out.println(srPath);
		
		File fullPage = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(fullPage, new File(srPath));

	}

}
