package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class Baseclass_pagefactory {

	public WebDriver driver;
	Loginpage_pagefactory pf;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		//@FindBy
		pf=PageFactory.initElements(driver, Loginpage_pagefactory.class);
	}
	
}
