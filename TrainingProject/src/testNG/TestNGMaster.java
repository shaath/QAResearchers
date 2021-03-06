package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import methods.GenericMethods;

public class TestNGMaster extends GenericMethods {

	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	public String prPath = "D:\\QAReasearchers_Recordings\\Automation\\WorkSpace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties"; 
	public String br = "Firefox", url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String f = "Laxmi", l = "N", empId = "LN43256";
	public String ename = f+" "+l, uname = "AAA"+f+l+"324331", pwd = "Sample@5432167890";
	
	@BeforeTest
	public void orgLaunch() throws IOException
	{
		fi = new FileInputStream(prPath);
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		brLaunch(br);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeClass
	public void orgLogin() throws InterruptedException
	{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		Thread.sleep(3000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterClass
	public void orgLogout()
	{
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterTest
	public void orgClose()
	{
		driver.close();
	}
}
