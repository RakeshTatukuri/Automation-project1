package ParallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelTesting_methods {

	@Test(priority=1)
	public void googlechrome()
	{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println("title is "+driver.getTitle());
	}
	@Test(priority=2)	
	public void firefox()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
	@Test(priority=3)	
	public void edge()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
}
