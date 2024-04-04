package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Angrakhaacartpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/height-observer/x-header/nav[2]/a[2]")
	WebElement search;
	
	@FindBy(name="q")
	WebElement searchfield;
	
	@FindBy(xpath="//*[@id=\"product-list-template--17065647341809__main\"]/product-card[1]/div[1]/button")
	WebElement firstitem;
	
	@FindBy(xpath="/html/body/quick-buy-modal/div/div[2]")
	WebElement element;
		
	@FindBy(xpath="/html/body/quick-buy-modal/div/div[2]/safe-sticky/div/div[7]/form/div/buy-buttons/button")
	WebElement addtocart;
			
	@FindBy(name="checkout")
	WebElement checkout;
			
	public Angrakhaacartpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	public void searchanitem() throws InterruptedException
	{
		search.click();
		searchfield.sendKeys("dress");
		searchfield.submit();
		firstitem.click();
		Thread.sleep(3000);
	}
	public void addtocart() throws InterruptedException
	{
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();   
	    Thread.sleep(2000);
	    
		addtocart.click();
	}
	
	public void checkout()
	{
		checkout.click();
	}
	
}		
	
	    
