package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropEg2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.id("draggable"));

		Actions act = new Actions(driver);
		
		act.dragAndDropBy(drag, 382, 16).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Resizable")).click();
	}

}
