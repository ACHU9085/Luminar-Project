package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Angrakhaabase;
import Pagepkg.Angrakhaahomepage;

public class Angrakhaahometest  extends Angrakhaabase{
	
	@Test
	public void atitleverification()
	{
		Angrakhaahomepage p1=new Angrakhaahomepage(driver);
		p1.titleverification();
	}
	@Test
	public void logoverification()
	{
		Angrakhaahomepage p1=new Angrakhaahomepage(driver);
		p1.logoverification();
	}
	
	@Test
	public void searchitem()
	{
		Angrakhaahomepage p1=new Angrakhaahomepage(driver);
		p1.searchanitem();
	}
	
	@Test
	public void hamburgermenu()
	{
		Angrakhaahomepage p1=new Angrakhaahomepage(driver);
		p1.hamburgermenu();
	}
	

}
