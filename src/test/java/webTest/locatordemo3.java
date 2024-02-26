package webTest;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatordemo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		//page get the total links
		List<WebElement> all=driver.findElements(By.tagName("a"));
		System.out.println("total links are :"+all.size());
		String explink="https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch";
		for(WebElement i:all)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			try
			{ 
			if(i.getAttribute("href").contains(explink))
			
			{
				System.out.println("link found....test passed");
				break;
			}
			}
			catch(Exception e) {
				System.out.println("href is not available");
			}
		}
	}
}
