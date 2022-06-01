package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethods;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
		BusinessMethods bm = new BusinessMethods();
		String xlPath = System.getProperty("user.dir")+"//src//testData//Hybrid.xlsx";
		String xlout = System.getProperty("user.dir")+"//src//results//HybridRes.xlsx";
		String res = null;
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet TcSht = wb.getSheet("Testcase");
		XSSFSheet TsSht = wb.getSheet("Teststeps");
		XSSFSheet TdSht = wb.getSheet("TestData");
		XSSFSheet EmpRegSht = wb.getSheet("EmpReg");
		
		int TcSht_lRI = TcSht.getLastRowNum();
		int TsSht_lRI = TsSht.getLastRowNum();
		int EmpReg_lRI = EmpRegSht.getLastRowNum();
		
		for (int i = 1; i <= TcSht_lRI; i++) {
			TcSht.getRow(i).createCell(3);
			String exe = TcSht.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y")) 
			{
				String TcSht_TcId = TcSht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TsSht_lRI; j++) {
					String TsSht_TcId = TsSht.getRow(j).getCell(0).getStringCellValue();
					
					if (TcSht_TcId.equalsIgnoreCase(TsSht_TcId)) {
						String key = TsSht.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) {
						case "Launch":
							String br = TdSht.getRow(1).getCell(0).getStringCellValue();
							String url = TdSht.getRow(1).getCell(1).getStringCellValue();
							
							res = bm.orgLaunch(br, url);
							break;
						case "login":
							String u = TdSht.getRow(1).getCell(2).getStringCellValue();
							String p = TdSht.getRow(1).getCell(3).getStringCellValue();
							res =bm.orgLogin(u, p);
							break;
						case "logout":
							res = bm.orgLogout();
							bm.orgClose();
							break;
						case "Empreg":	
							for (int k = 1; k <= EmpReg_lRI; k++) {
								String f = EmpRegSht.getRow(k).getCell(0).getStringCellValue();
								String l = EmpRegSht.getRow(k).getCell(1).getStringCellValue();
								String empId = EmpRegSht.getRow(k).getCell(2).getStringCellValue();
								res = bm.orgEmpReg(f, l, empId);
								
								EmpRegSht.getRow(k).createCell(3).setCellValue(res);
							}
							
							break;
						case "Usereg":
							String ename = TdSht.getRow(1).getCell(7).getStringCellValue();
							String uname = TdSht.getRow(1).getCell(8).getStringCellValue();
							String pwd = TdSht.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgUserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = TdSht.getRow(1).getCell(8).getStringCellValue();
							String pd = TdSht.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgLogin(un, pd);
							break;	
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//Updating the results in Test steps sheet
						TsSht.getRow(j).createCell(4).setCellValue(res);
						
						//Updating the results in Test case sheet
						if (!TcSht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							TcSht.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				TcSht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}
}
