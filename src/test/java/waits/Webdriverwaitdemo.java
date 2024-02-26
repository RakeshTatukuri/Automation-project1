package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverwaitdemo {

	public static WebElement waitforpresenceofelement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	public static WebElement waitforviibilityofelement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	public static WebElement waitforelementtoclick(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.elementToBeClickable(loc));
	}
	public static boolean waitfortitle(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.titleContains(title));
	}
	public static boolean waitforurl(WebDriver driver,String url)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//elements
		By email=By.id("input-email");
		By password=By.id("input-password");
		By button=By.xpath("//input[@value='Login']");
		
		//email
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
		
		//password
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("test123");
	}
}
