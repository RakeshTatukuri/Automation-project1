package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletitlevalidation {

	public static void main(String[] args) {
		//step1: open google application in browser
	     WebDriver driver=new ChromeDriver();//its replaca of real browser
		 driver.get("https://www.google.com/");
		
		 //step2:get the actual title from google
		String actualtitle = driver.getTitle();//return type is string
		 System.out.println("actualtitle is:"+actualtitle);
		
		 //step3:compare actual title versus expected title
		 //step4:as per validation print the result
		if(actualtitle.equals("Google"))
		{
			System.out.println("Title matched..Test passed!");
		}else {
			System.out.println("Title not matched...Test failed!");
		}
		
		//step5:close the browser
		driver.quit();
		
	}
}
