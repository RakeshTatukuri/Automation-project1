package ParallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class2 {

	@Test	
	public void firefox()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
}
