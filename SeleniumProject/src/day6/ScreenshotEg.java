package day6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		File google = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(google, new File("D:\\QAReasearchers_Recordings\\Automation\\WorkSpace\\SeleniumProject\\src\\com\\SeleniumProject\\screenshots\\google.png"));
										  	
	}

}
