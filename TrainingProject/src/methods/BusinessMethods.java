package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusinessMethods extends GenericMethods {

	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	public String prPath = "D:\\QAReasearchers_Recordings\\Automation\\WorkSpace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties"; 
	//Launch
	public String orgLaunch(String br, String url) throws IOException
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
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Login
	public String orgLogin(String u, String p) throws InterruptedException
	{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		Thread.sleep(3000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Logout
	public String orgLogout()
	{
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Close
	public void orgClose()
	{
		driver.close();
	}
	
	//Employee Registration
	public String orgEmpReg(String f, String l, String empId)
	{
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(empId);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//User Registration
	public String orgUserReg(String ename, String uname, String pwd) throws InterruptedException
	{
		expval = uname;
		boolean flag = false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> unames = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
		for (int i = 0; i < unames.size(); i++) {
			actval = unames.get(i).getText();
			if (expval.equalsIgnoreCase(actval)) {
				flag = true;
				break;
			}
		}
		
		if (flag == true) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
}
