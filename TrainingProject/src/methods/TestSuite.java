package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		BusinessMethods bm = new BusinessMethods();
		//Login
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.orgClose();
		System.out.println("Application Closed Successfully");

		//EmpReg
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgEmpReg("Siva", "P", "SP32456");
		System.out.println("Employee Registration "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.orgClose();
		System.out.println("Application Closed Successfully");
	
		//UserReg
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgUserReg("Siva P", "AASivaP", "SampleTest@5432167890");
		System.out.println("User Registration "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.orgClose();
		System.out.println("Application Closed Successfully");
		
		//UserLogin
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("AASivaP", "SampleTest@5432167890");
		System.out.println("Application Login "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.orgClose();
		System.out.println("Application Closed Successfully");
	}
}
