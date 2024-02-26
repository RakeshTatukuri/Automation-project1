package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdropdown_stbd {
	
	  //reusable method
	public static void SelectBasedDropDown(WebElement ele,String value) {		
		Select dd=new Select(ele);
		
		System.out.println("is dropdown select multiple selection :"+dd.isMultiple());
		
		List<WebElement>alloptions=dd.getOptions();
		
		System.out.println("total options are :"+alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("value"))
			{
				i.click();
				break;
			}
		}
	}
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	//dropdown day
	WebElement dayele=driver.findElement(By.id("day"));
	SelectBasedDropDown(dayele,"25");
	//dropdown month
	WebElement monthele=driver.findElement(By.id("month"));
	SelectBasedDropDown(monthele,"Dec");
	//dropdown by year
	WebElement yearele=driver.findElement(By.id("year"));
	SelectBasedDropDown(yearele,"2025");
	
	
	
	/*//select by dropdown day
	WebElement dayele=driver.findElement(By.id("day"));
	Select daydd=new Select(dayele);
	
	System.out.println("is dropdown select multiple selection :"+daydd.isMultiple());
	
	List<WebElement>alloptions=daydd.getOptions();
	
	System.out.println("total options are :"+alloptions.size());
	for(WebElement i:alloptions)
	{
		System.out.println(i.getText());
		if(i.getText().contains("25"))
		{
			i.click();
			break;
		}
	}
	
	//select by dropdown month
	WebElement ele=driver.findElement(By.id("month"));
	Select dayddm=new Select(ele);
	
	System.out.println("is dropdown select multiple selection:"+dayddm.isMultiple());
	List<WebElement>alloption=dayddm.getOptions();
	System.out.println("total options are:"+alloption.size());
	for(WebElement i:alloption)
	{
		System.out.println(i.getText());
		if(i.getText().contains("dec"))
		{
			i.click();
			break;
		}
	}
	*/
	
	
	
	
	
	
}
}
