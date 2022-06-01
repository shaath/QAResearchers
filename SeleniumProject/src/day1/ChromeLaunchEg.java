package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunchEg {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\QAReasearchers_Recordings\\Automation\\Jars\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");

	}

}
