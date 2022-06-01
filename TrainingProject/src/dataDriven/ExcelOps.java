package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethods;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException {
		String prPath = System.getProperty("user.dir")+"//src//testData//TestData.xlsx";
		String outPath = System.getProperty("user.dir")+"//src//results//EmpRes.xlsx";

		FileInputStream fi = new FileInputStream(prPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(5);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int intLRI = ws.getLastRowNum();
		
		BusinessMethods bm = new BusinessMethods();
		bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		bm.orgLogin("Admin", "Qedge123!@#");
		
		String res = null;
		
		for (int i = 1; i <= intLRI; i++) {
			XSSFRow r = ws.getRow(i);
			
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			
			XSSFCell c3 = r.createCell(3);
			
			String f = c.getStringCellValue();
			String l = c1.getStringCellValue();
			String eid = c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			
			res = bm.orgEmpReg(f, l, eid);
			
			c3.setCellValue(res);
		}
		
		FileOutputStream fo = new FileOutputStream(outPath);
		wb.write(fo);
		wb.close();
		
		bm.orgLogout();
		bm.orgClose();
	}

}
