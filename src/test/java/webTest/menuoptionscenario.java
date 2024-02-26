package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class menuoptionscenario {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
	List<WebElement>list=driver.findElements(By.xpath("//div[@class='list-group']//a"));
	System.out.println("total size:"+list.size());
	for(WebElement i:list)
	{
		System.out.println(i.getText());
		if(i.getText().equals("Register"))//contains("Register")
		{
			i.click();
			System.out.println("match found!");
			break;
		}
	}
	
	//footer
	//String text=driver.findElement(By.xpath("(//div[@class='col-sm-3'])[5]")).getText();
	//System.out.println(text);
	
	System.out.println();
	//footer
	String text2=driver.findElement(By.xpath("(//div[@class='row'])[4]")).getText();
	System.out.println(text2);
	
}
}
