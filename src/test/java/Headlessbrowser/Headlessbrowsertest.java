package Headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowsertest {

	public static void main(String[] args) throws InterruptedException {
		//headless mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		System.out.println("driver session is created");
		driver.get("https://www.google.com/");
		System.out.println("application is opened");
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("before search: "+driver.getCurrentUrl());
		//searchbox
		driver.findElement(By.name("q")).sendKeys("testng",Keys.ENTER);
		
		System.out.println("after search: "+driver.getCurrentUrl());
	
		Thread.sleep(2500);
		
		driver.quit();
		
		System.out.println("browser closed!");
		
		
		
		
		
		
	}
}
