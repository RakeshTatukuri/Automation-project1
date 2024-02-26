package ParallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	@Test
	public void googlechrome()
	{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println("title is "+driver.getTitle());
	}
}
