package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTC_POM {

	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.orgLogin(lp.u, lp.p);
		
		Thread.sleep(5000);
		
		AdminHomePage ap = PageFactory.initElements(driver, AdminHomePage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
	}
}
