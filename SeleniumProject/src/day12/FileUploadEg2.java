package day12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadEg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\SharatChandra\\Desktop\\2.png");
//		driver.findElement(By.id("uploadfile_0")).click();
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("document.getElementById(\"uploadfile_0\").click();");
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload_new.exe");
	}

}
