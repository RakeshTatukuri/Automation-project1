package windowhadles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowtesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//parent page
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		//linktext
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		//new page will open 
	Set<String> allwindows=driver.getWindowHandles();//returns set of strings 
		System.out.println(allwindows);
		
		for(String childid:allwindows)
		{
			if(!parentid.equals(childid))//parent id is  not equals with child id then switch
				//NOTE: when ever we are using strings we dont apply opertaors in java is rule mentioned by java
			{
				//childwindow
				driver.switchTo().window(childid);
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
				driver.close();//current window
				//driver.quit();//all open window
				
			}
		}
		
		//parent window
		driver.switchTo().window(parentid);
		driver.findElement(By.name("username")).sendKeys("rakesh");
		
		
		
	}
}
