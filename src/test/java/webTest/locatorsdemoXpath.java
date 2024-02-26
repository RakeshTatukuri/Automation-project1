package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemoXpath {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://automationplayground.com/crm/");
	driver.findElement(By.xpath("//a[@id=\"SignIn\"]")).click();
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("test123");
	driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	driver.findElement(By.xpath("//a[@class=\"nav-link\"]")).click();
}

}