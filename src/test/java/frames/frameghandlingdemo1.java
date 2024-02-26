package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameghandlingdemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//frame with indexing
	//	driver.switchTo().frame(0);
		
		//frame with id/name
	//	driver.switchTo().frame("mce_0_ifr");
		
		//frame with webelement
		WebElement ele1=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(ele1);
		
		//webelement
	 WebElement ele=driver.findElement(By.id("tinymce"));
	 ele.clear();
	 ele.sendKeys("Hello!");
	 
		
		
		
		
		
		
		
		
	}
}
