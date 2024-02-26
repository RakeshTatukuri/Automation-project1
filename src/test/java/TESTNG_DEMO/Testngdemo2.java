package TESTNG_DEMO;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

 public class Testngdemo2 {
//here it will execute the test cases in alphabatical order
	@Test	
	public void googlechrome()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
	@Test	
	public void firefox()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
	@Test	
	public void edge()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
}
