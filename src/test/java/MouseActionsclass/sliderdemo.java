package MouseActionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderdemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		
		//frame
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		Actions action =new Actions(driver);
		action.clickAndHold(slider).moveToElement(slider, 250, 0).build().perform();
		
		
	}
}
