package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathmethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		//text()
		driver.findElement(By.xpath("(//a[text()=\"Best Sellers\"])[1]")).click();
		//contains() with text()
		String text=driver.findElement(By.xpath("(//h2[contains(text(),'Bestsellers')])[1]")).getText();
		System.out.println(text);
		//cart
		WebElement ele=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
		System.out.println(ele.getText());
		ele.click();
		//normalise-space()
		String text1=driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(text1);
		//contains()
		driver.findElement(By.xpath("//input[contains(@id,\"twotabsearch\")]")).sendKeys("ipad ",Keys.ENTER);
		//starts-with(prefix)
		WebElement ele2=driver.findElement(By.xpath("//input[starts-with(@id,\"two\")]"));
		ele2.clear();
		ele2.sendKeys("iphone",Keys.ENTER);
		
		
	}
}
