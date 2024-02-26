package webTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Roboclass {

	public static void main(String[] args) throws AWTException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("9553438459");
	driver.findElement(By.name("pass")).sendKeys("123456");

	Robot robot=new Robot();
	
	robot.keyPress(KeyEvent.VK_ENTER);//mandatory
	//robot.keyRelease(KeyEvent.VK_ENTER);//not mandatory
	
	

	/*driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brandcom&gad=1&gclid=EAIaIQobChMIvJrkhs7tgQMVx2krCh24JwF9EAAYASAAEgLFAvD_BwE&gclsrc=aw.ds");
	driver.findElement(By.xpath("//button[contains(text(),\"Upload Resume\")]")).click();
	//typing keywords from laptop/desktop on os generated windows
	Robot robot=new Robot();// Robot class throws AWT Exception	
	
	robot.keyPress(KeyEvent.VK_D);//typing keywords from os generated windows/upload resume in nakurai
	robot.keyRelease(KeyEvent.VK_COLON);//D:\Resume
	robot.keyPress(KeyEvent.VK_BACK_SLASH);
	robot.keyRelease(KeyEvent.KEY_TYPED);
	*/
}
}