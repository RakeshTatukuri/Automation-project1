package MouseActionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().fullscreen();
		
		//frame
		driver.switchTo().frame(0);
		
	    WebElement handle=driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
		
	    Actions act=new Actions(driver);
	    act.moveToElement(handle).dragAndDropBy(handle, 100, 50).build().perform();
		
		
	}
}
