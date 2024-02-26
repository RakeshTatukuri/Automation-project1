package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage  {

	//Encapsulation=private data + public functions
	
	 private WebDriver driver;//instance variable
	 
	 //initilize the driver
	 public Loginpage(WebDriver driver)//driver from baseclass
	 {
		 /*
		  * this.driver=instance driver
		  * driver=local driver
		  */
		 this.driver=driver;
	 }
	
	 //Technique 1: locators (by locator + method)
	 //by locator
	private By email=By.id("email-id");
	private By password=By.id("password");
	private By button=By.id("submit-id");

	//method
	 public String getApplicationTitle()
	 {
		return driver.getTitle();
	 }
	 
	 public void login(String em,String pw)
	 {
		 driver.findElement(email).sendKeys("test@gmail.com");
		 driver.findElement(password).sendKeys("test1234");
		 driver.findElement(button).click();
	 }
}
