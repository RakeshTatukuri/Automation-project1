package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframedemo {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	//bottom
	driver.switchTo().frame(1);
	System.out.println(driver.getPageSource());
	
	//come back to main frame
	driver.switchTo().defaultContent();
	
	// org.openqa.selenium.NoSuchFrameException: no such frame
	
	//top
	driver.switchTo().frame(0);
	System.out.println(driver.getPageSource());
	
	//top to left
	driver.switchTo().frame("frame-left");
	String text=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
	System.out.println("Text is:"+text);
	
	//come back to main frame
	driver.switchTo().defaultContent();
	
	//top to middle
	driver.switchTo().frame(0).switchTo().frame("frame-middle");
	//driver.switchTo().frame("frame-middle");
	String text2=driver.findElement(By.id("content")).getText();
	System.out.println("text is:"+text2);
	
	//come back to main frame
	driver.switchTo().defaultContent();

	//top to right
	driver.switchTo().frame(0).switchTo().frame("frame-right");
	String text3=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
	System.out.println("Text is:"+text3);
	
	
	
	
	
	
	
	
	
}
}
