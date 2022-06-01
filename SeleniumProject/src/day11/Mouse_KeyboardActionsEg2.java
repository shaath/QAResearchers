package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_KeyboardActionsEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		act.click(email).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.chord("Selenium")).perform();
		Thread.sleep(5000);
		act.doubleClick().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("C")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("pass"));
		act.click(password).perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("V")).keyUp(Keys.CONTROL).build().perform();
		
	}

}
