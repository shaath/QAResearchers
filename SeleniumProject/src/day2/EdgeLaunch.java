package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
//		System.setProperty("webdriver.edge.driver", "D:\\QAReasearchers_Recordings\\Automation\\Jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://selenium.dev");
		
		
//		System.setProperty("webdriver.ie.driver", "D:\\QAReasearchers_Recordings\\Automation\\Jars\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		
//		driver.get("https://google.com");
		
		
//		System.setProperty("webdriver.safari.driver", "");
//		WebDriver driver = new SafariDriver();
		
		
//		System.setProperty("webdriver.opera.driver", "");
//		WebDriver driver = new OperaDriver();
		
	}
	

}
