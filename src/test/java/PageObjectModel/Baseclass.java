package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

  //pre repository
public class Baseclass {

	public WebDriver driver;
	public Loginpage lg;
	
	@BeforeClass
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		//By locator
		lg= new Loginpage(driver);
		
	}	
}
