package MouseActionsclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//button--right click
		WebElement elebutton=driver.findElement(By.xpath("//span[text()='right click me']"));
		/*webelement is an interface in selenium
		  alert is an interface in selenium
		  action is an class in selenium
 		  when you performing single action then we use perform()

 		*/
		//Action class
		Actions action=new Actions(driver);
		action.contextClick(elebutton).perform();
		
		//menu
		List<WebElement> menu= driver.findElements(By.xpath("(//ul[contains(@class,'context-menu-list')])//li//span"));
		for(WebElement i:menu)
		{
			if(i.getText().contains("Cut"))
			{
				i.click();
				break;
			}
		}
		//alert 
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert text is "+alert.getText());
		//ok
		alert.accept();
		
		
		
		
		
		
		
		
	}
}
