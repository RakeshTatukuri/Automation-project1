package PractiseExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currencycount {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=usd+to+inr&oq=usd&gs_lcrp=EgZjaHJvbWUqDQgBEAAYgwEYsQMYgAQyDwgAEEUYORiDARixAxiABDINCAEQABiDARixAxiABDIHCAIQABiABDINCAMQABiDARixAxiABDIQCAQQABiDARixAxiABBiKBTINCAUQABiDARixAxiABDINCAYQABiDARixAxiABDINCAcQABiDARixAxiABDINCAgQABiDARixAxiABDIHCAkQABiPAtIBCDMyMDNqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*	List<WebElement>all	=driver.findElements(By.xpath("(//div[@class='wLNyTe' or @class='xNzW0d']//option[60])[1]"));//105-uk
	for(WebElement i: all)
	{
		
		System.out.println(i.getText());
		i.click();
		break;
	}
	
	List<WebElement>alloptions=	driver.findElements(By.xpath("(//div[@class='wLNyTe' or @class='xNzW0d']//option[105])[2]"));
		for(WebElement i: alloptions)
		{
			System.out.println(i.getText().length());
			i.click();
			break;
		}
		*/
		
	List<WebElement>upper=	driver.findElements(By.xpath("//select[@class='zuzy3c l84FKc']//option"));
	for(WebElement i: upper)
	{
		if(i.getText().contains("Dollar"))
		{
			System.out.println(i.getText());
			i.click();
			break;
		}
		
	}
	//System.out.println("************");
	List<WebElement>lower=	driver.findElements(By.xpath("//select[contains(@class,'zuzy3c NKvwhd')]//option[139]"));
	for(WebElement i: lower)
	{
		System.out.println(i.getText());
		i.click();
		break;
	}
	
	}
}
