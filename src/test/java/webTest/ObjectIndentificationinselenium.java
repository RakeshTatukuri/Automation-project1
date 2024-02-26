package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIndentificationinselenium {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	/*
	 * technique 1 :By locator (identify+validate+actions)
	 * Webelement is an interface in selenium
	 * return type of findelement is webelement
	 * isdisplayed ,isenabled,isselected method returns you boolean method
	 * return type of sendkeys is void
	 */
	//to get the address of search box
	By searchbox=By.id("APjFqb");//by method returns you by class object
	
	//identify using selenium method
	WebElement searchele=driver.findElement(searchbox);

	//validate webelement
	System.out.println("Is searchbox is displayed: "+searchele.isDisplayed());
	System.out.println("Is searchbox is displayed: "+searchele.isEnabled());
	//perform actions
	searchele.sendKeys("java",Keys.ENTER);
	
	
	/*
	 * technique 2: identify+validate+actions
	 */
	WebElement ele=driver.findElement(By.id("APjFqb"));
	
	if(ele.isDisplayed()&& ele.isEnabled())
	{
		ele.sendKeys("testng",Keys.ENTER);
	}
	
	/*
	 * technique 3: identify+action
	 */
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	
	
}
}
