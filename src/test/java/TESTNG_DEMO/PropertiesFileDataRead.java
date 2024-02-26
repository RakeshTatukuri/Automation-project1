package TESTNG_DEMO;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.PropertiesRead;

public class PropertiesFileDataRead {
  @Test
  public void dataread() throws IOException {
	  
	  //single file window reading
	 /* File f1=new File(System.getProperty("user.dir")+"//config.properties");
	  
	  FileInputStream fs=new FileInputStream(f1);

	  //properties class (we are using load class)
	 
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	 // System.out.println("browser name:"+p1.getProperty("bname"));
	  //System.out.println("user name is:"+p1.getProperty("un"));
	   
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(p1.getProperty("un"));
		driver.findElement(By.name("password")).sendKeys(p1.getProperty("pwd"));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	*/  
	  //propertiesRead constructor
	  PropertiesRead p1=new PropertiesRead("config");
	  
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getdata("url"));
		driver.findElement(By.name("username")).sendKeys(p1.getdata("un"));
		driver.findElement(By.name("password")).sendKeys(p1.getdata("pwd"));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		
  }
}
