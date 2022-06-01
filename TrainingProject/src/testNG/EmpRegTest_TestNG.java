package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTest_TestNG extends TestNGMaster{

	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String empId)
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
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d = new Object[4][3];
		
		d[0][0] = "Nandu";
		d[0][1] = "S";
		d[0][2] = "NS54362";
		
		d[1][0] = "Ganesh";
		d[1][1] = "L";
		d[1][2] = "GL54362";
		
		d[2][0] = "Karthik";
		d[2][1] = "S";
		d[2][2] = "KS54362";
		
		d[3][0] = "Siva";
		d[3][1] = "P";
		d[3][2] = "SP54362";
		
		return d;
	}
}
