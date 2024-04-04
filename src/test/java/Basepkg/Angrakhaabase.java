package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Angrakhaabase {
	public WebDriver driver;
	String url="https://www.angrakhaa.com/";
	
	
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.navigate().refresh();
	
	} 
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
