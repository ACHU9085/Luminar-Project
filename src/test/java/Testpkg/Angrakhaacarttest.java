package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Angrakhaabase;
import Pagepkg.Angrakhaacartpage;

public class Angrakhaacarttest extends Angrakhaabase{
	@Test
	public void carttest() throws InterruptedException
	{
		Angrakhaacartpage p=new Angrakhaacartpage(driver);
		p.searchanitem();
		p.addtocart();
		Thread.sleep(2000);		
		p.checkout();
		Thread.sleep(2000);
	}
	
}
 