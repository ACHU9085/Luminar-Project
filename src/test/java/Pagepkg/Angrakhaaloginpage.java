package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Angrakhaaloginpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/height-observer/x-header/nav[2]/a[1]")
	WebElement loginpage;
	@FindBy(name="customer[email]")
	WebElement email;
	@FindBy(name="customer[password]")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")
	WebElement login;
	@FindBy(xpath="//*[@id=\"shopify-section-template--17065647374577__main\"]/div/div/div/div[1]/a")
	WebElement logout;
	
		
	public Angrakhaaloginpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	public void openloginpage()
	{
		loginpage.click();
	}
	public void setvalues(String un, String pw)
	{
		email.sendKeys(un);
		pass.sendKeys(pw);
	}
	
	public void loginclick()
	{
		login.click();
	}
	public void logout()
	{
		logout.click();
	}

}
