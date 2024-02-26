package windowhadles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_window {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	//Q)how to write the automation script to open fb application in 10 different newtabs
		//new tab facebook
		for(int i=1;i<=10;i++) {
		WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
		newtab.get("https://www.facebook.com/");
		}
		//new window
		WebDriver newwindow=driver.switchTo().newWindow(WindowType.WINDOW);
		newwindow.get("https://www.instagram.com/accounts/login/");
	}
}
