package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo_bootstapdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		//close the popup
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		//from
		//driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]"));
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")).click();
		//input
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		List<WebElement>flist=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//p[contains(@class,'fsjMhJ')]"));
		System.out.println("total options are:"+flist.size());
		for(WebElement i:flist)
		{
			System.out.println(i.getText());
			if(i.getText().contains("pantnagar"))
			{
				i.click();
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
