package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		
		alt.dismiss();

	}

}
