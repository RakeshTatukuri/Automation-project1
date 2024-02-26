package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_orangeHRM {

	//encapsulation =private data+ public functions
	private WebDriver driver;
	
	//initialize the driver
	public Loginpage_orangeHRM(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//locators(by locator)
	private By un=By.xpath("//input[@placeholder='Username']");
	private By pwd=By.xpath("//input[@placeholder='Password']");
	private By button=By.xpath("//button[normalize-space()='Login']");
	
	
	
	//methods
	public String getpagesource()
	{
		return driver.getPageSource();
	}
	public String getapplicationtitle()
	{
		return driver.getTitle();
	}
	public void Login(String user, String pass) throws InterruptedException
	{
		Thread.sleep(2500);
		driver.findElement(un).sendKeys("Admin");
		Thread.sleep(2500);
		driver.findElement(pwd).sendKeys("admin123");
		Thread.sleep(2500);
		driver.findElement(button).click();
	}
	
	
}
