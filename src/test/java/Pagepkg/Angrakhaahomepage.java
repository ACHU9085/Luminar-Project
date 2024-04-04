package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Angrakhaahomepage {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/height-observer/x-header/h1/a/img")WebElement logo; 
	@FindBy(xpath="/html/body/header/height-observer/x-header/nav[2]/a[2]")WebElement search;
	@FindBy(name="q")WebElement searchfield;
	@FindBy(xpath="/html/body/main/section/div/div/div/div[2]/x-tabs/div/div/div/div/product-list/product-card[1]/div[2]/div[1]/div/a")
	WebElement firstitem;
	@FindBy(xpath="/html/body/header/height-observer/x-header/nav[1]/button")
	WebElement hamburger;
		
	public Angrakhaahomepage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	public void titleverification()
	{
		String act=driver.getTitle();
		String exp="ANGRAKHAA";
		Assert.assertEquals(act, exp);
	}
	
	public void logoverification()
	{
		if(logo.isDisplayed())
		{
			System.out.println("logo present");
		}
		else
		{
			System.out.println("logo not present");
		}
	}
	
	public void hamburgermenu()
	{
		hamburger.click();
		driver.navigate().refresh();
	}
	public void searchanitem()
	{
		search.click();
		searchfield.sendKeys("dress");
		searchfield.submit();
		firstitem.click();
		
	}

}
