package testNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusbankLoginTest {

	public WebDriver driver;
	
	@BeforeClass
	public void brLaunch()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void appLaunch()
	{
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
