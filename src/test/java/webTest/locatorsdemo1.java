package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//linktext
		driver.findElement(By.linkText("Sign In")).click();
		//partiallinktext
		//driver.findElement(By.partialLinkText("In")).click();
		
		//id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//name
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox -->id
		driver.findElement(By.id("remember")).click();
		
		//submit-->className
		/*by using class name we get these error
		 * invalidselectorexception:compound class names not permitted
		*class= btn     btn-default  btn-primary
		 *      class1   class2       class3
		 *  driver.findElement(By.className("btn btn-default btn-primary")).click();
		 */
		driver.findElement(By.className("btn")).click();
		
		//logout
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
	}
}
