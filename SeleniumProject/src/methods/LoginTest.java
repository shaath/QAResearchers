package methods;

import java.io.IOException;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.orgClose();
		System.out.println("Application Closed Successfully");

	}

}
