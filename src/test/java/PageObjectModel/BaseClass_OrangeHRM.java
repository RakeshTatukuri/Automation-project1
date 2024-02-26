package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseClass_OrangeHRM {

	public WebDriver driver;
	 Loginpage_orangeHRM hrm;

	@BeforeClass
	public void Setup()
	{

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		hrm=new Loginpage_orangeHRM(driver);
	}
}
