package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsEg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		WebElement pr = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> checks = pr.findElements(By.tagName("input"));
		
		System.out.println(checks.size());

		for (int i = 0; i < checks.size(); i++) {
			
			String rName = checks.get(i).getAttribute("value");
			System.out.println(rName);
			
			if (rName.equalsIgnoreCase("Milk")) 
			{
				checks.get(i).click();
			}
			else if (rName.equalsIgnoreCase("Water"))
			{
				checks.get(i).click();
			}
		}
	}

}
