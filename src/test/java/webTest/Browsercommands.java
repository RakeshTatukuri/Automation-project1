package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands {

	public static void main(String[] args) {
		//ctrl+shift+o for importing commands
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("");
		//to get the title --gettile and return type is String
		System.out.println("Title is"+driver.getTitle());
		//to get current url
		System.out.println("current url"+driver.getCurrentUrl());
		//to get the  source code of page-- getpagesource
		System.out.println(driver.getPageSource());
		//to close the browser close() or quit()
		driver.close();
		
	}
}
