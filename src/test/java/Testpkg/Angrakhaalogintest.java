package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Angrakhaabase;
import Pagepkg.Angrakhaaloginpage;
import Utilitiespkg.Excelutil;



public class Angrakhaalogintest extends Angrakhaabase {
	
    @Test
	public void verifylogin() throws Exception
	{
		Angrakhaaloginpage p1=new Angrakhaaloginpage(driver);
		
		String xl = "C:\\\\Users\\\\aiswa\\\\OneDrive\\\\Desktop\\\\Final.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutil.getrowcount(xl,sheet);
		p1.openloginpage();
		Thread.sleep(1000);		
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelutil.getcellvalue(xl,sheet,i,0);
			System.out.println("username = "+username);
			String password=Excelutil.getcellvalue(xl, sheet,i,1);
			System.out.println("password = "+password);
			
			p1.setvalues(username, password);
			p1.loginclick();
		Thread.sleep(1000);
						
		}
	}

}
