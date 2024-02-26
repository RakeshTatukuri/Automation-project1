package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentwaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//by locator
		By btn =By.xpath("//button[text()='Start']");
		By text=By.xpath("//h4[text()='Hello World!']");
		
		driver.findElement(btn).click();
		
		//fluent wait
		Wait<WebDriver>wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(250))
				.ignoring(NoSuchElementException.class);
		
	String txt=	wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();
	 System.out.println(txt);
		
		
	}
}
