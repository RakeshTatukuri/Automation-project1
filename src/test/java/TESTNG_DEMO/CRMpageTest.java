package TESTNG_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CRMpageTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}
	
  @Test(priority=1)
  public void ValidateSignInlink () 
  {
	  driver.findElement(By.linkText("Sign In")).click();
  }
  @Test(priority=2)
  public void ValidateLogin()
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test1234");
	  driver.findElement(By.id("submit-id")).click();
  }
  
  @AfterClass
  public void Teardown() throws InterruptedException
  {
	  Thread.sleep(2500);
	  driver.quit();
  }
  
  @BeforeMethod
  public void getcurrentappurl()
  {
	  System.out.println("current title is:"+driver.getCurrentUrl());
  }
  @AfterMethod
  public void getapptitle()
  {
	  System.out.println("title is:"+driver.getTitle());
  }
}
