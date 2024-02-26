package MouseActionsclass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//button
		WebElement doubleclickbtn=driver.findElement(By.xpath(" //button[text()='Double-Click Me To See Alert']"));
		//Action 
		Actions action=new Actions(driver);
		action.doubleClick( doubleclickbtn).perform();
		
		//alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text is "+alt.getText());
		alt.accept();
		
		
		
	}
}
