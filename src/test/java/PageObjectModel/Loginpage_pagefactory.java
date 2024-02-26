package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage_pagefactory {

	//encapsulation=private data+ public functions
	
	 private WebDriver driver;
	
	 //initialize driver
	 public Loginpage_pagefactory(WebDriver driver)//baseclass driver
	 {
		 /*this.driver=current/instance class driver
		  * driver=local/base class driver
		  */
		 this.driver=driver;
	 }
	
	 //Technique2:page factory(@findby)
	private @FindBy(id="email-id")
	 WebElement email;
	
	private @FindBy(id="password")
	WebElement pwd;
	private @FindBy(id="submit-id")
	WebElement btn;
	
	//methods
	public String getapptitle()
	{
		return driver.getTitle();
		
	}
	public void Login(String em,String pd)
	{
		email.sendKeys(em);
		pwd.sendKeys(pd);
		btn.click();
	}
	
}
