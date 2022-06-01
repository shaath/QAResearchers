package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String date = "25/February/2023";
		String[] split = date.split("/");
		
		String mon_year = split[1]+" "+split[2];
		String day = split[0];
		System.out.println(day+"-----"+mon_year);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[name()='svg' and @fill='currentColor'])[1]")).click();
		Thread.sleep(3000);

		String act_mon_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		
		while(!mon_year.equalsIgnoreCase(act_mon_year))
		{
			driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']")).click();
			act_mon_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		}
		
		List<WebElement> cells = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@aria-disabled='false']"));
		
		System.out.println(cells.size());
		
		for (int i = 0; i < cells.size(); i++) {
			
			String act_day = cells.get(i).getAttribute("aria-label");
			System.out.println(act_day);
			
			if (act_day.contains(" "+day+" ")) {
				cells.get(i).click();
				break;
			}
		}
		
	}

}
