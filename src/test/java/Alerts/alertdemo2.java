package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class alertdemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement ele=driver.findElement(By.id("result"));
		//alert 1
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//alert window will open
		Alert alt=driver.switchTo().alert();
		System.out.println("text of alert1 is:"+alt.getText());
		//ok
		alt.accept();
		//String result=driver.findElement(By.id("result")).getText();
		System.out.println("Result is :"+ele.getText());
		
		//alert 2
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//alert window will open
		Alert alt2=driver.switchTo().alert();
		System.out.println("text of alert2 is:"+alt2.getText());
		//ok
		//alt2.accept();
		//dismiss
		alt2.dismiss();
		//String result2=driver.findElement(By.id("result")).getText();
		System.out.println("Result is :"+ele.getText());
		
		//alert 3
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		//alert window will open
		Alert alt3=driver.switchTo().alert();
		System.out.println("text of alert3 is:"+alt3.getText());
		//prompt
		alt3.sendKeys("Jai Sri Ram!");
		alt3.accept();
		//String result3=driver.findElement(By.id("result")).getText();
		System.out.println("Result is:"+ele.getText());
		
	}
}
