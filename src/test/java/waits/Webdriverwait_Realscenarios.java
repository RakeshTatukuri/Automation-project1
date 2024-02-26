package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.utility;

public class Webdriverwait_Realscenarios {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//by locator
		By btn =By.xpath("//button[text()='Start']");
		By text=By.xpath("//h4[text()='Hello World!']");
		 
		//calling from utility class
		
		//driver.findElement(btn).click();
		boolean statusurl=utility.waitforurl(driver, "intern");
		System.out.println("status of url is :"+statusurl);
		utility.waitforelementtoclick(driver, btn).click();
		WebElement ele=utility.waitforpresenceofelement(driver,text);
		
		//String t=driver.findElement(text).getText();
		 String t=ele.getText();
		 System.out.println(t);
		
		
	}
}
