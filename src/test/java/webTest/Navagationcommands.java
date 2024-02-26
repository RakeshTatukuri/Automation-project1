package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navagationcommands {

	public static void main(String[] args) throws Exception {
		/*
		 * webdriver is parent reference and creating object reference for child that is chromedriver
		 * webdriver is an interface
		 * chromedriver is an class
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title is "+driver.getTitle());
		
		//static wait in selenium
		Thread.sleep(2500);//thread is a class , sleep is method and thread.sleep is static wait
		
		//google-->facebook in session (navigation)
		driver.navigate().to("https://www.facebook.com/");//return type of navigate is navigation interface object 
		
		//facebook -->google (back)
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
	}
}
