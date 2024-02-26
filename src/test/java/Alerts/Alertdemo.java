package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//signin
	driver.findElement(By.name("proceed")).click();
	//alert window
	Alert alert=driver.switchTo().alert();
	System.out.println("Text of alert is:"+alert.getText());
	//ok
	alert.accept();// org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please enter a valid user name}
	//username
	driver.findElement(By.id("login1")).sendKeys("Rakesh");
	//password
	driver.findElement(By.id("password")).sendKeys("Rakesh123");
	//sign
	driver.findElement(By.className("signinbtn")).click();
	
	
	
	
	
}	
}
