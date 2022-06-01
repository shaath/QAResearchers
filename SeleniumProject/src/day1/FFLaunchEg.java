package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FFLaunchEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
//		System.setProperty("webdriver.gecko.driver", "D:\\QAReasearchers_Recordings\\Automation/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
	}

}
