package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import helper.utility;

public class selecttagbaseddropdown {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in");
	//dropdown address
	WebElement ele=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	//classname.methodname()
	utility.SelectBasedDropDown(ele,"Amazon Devices");
	
	 /*//select  class
	Select sc=new Select(ele);
	
	System.out.println("is dropdown support multiple selections:"+sc.isMultiple());
	
	//single options
	sc.selectByIndex(3);
	sc.selectByValue("search-alias=grocery");
	sc.selectByVisibleText("Amazon Devices");
	
	//to get all options?to get text of options
	List<WebElement>alloptions=sc.getOptions();
	System.out.println("total options are:"+alloptions.size());
	for(WebElement i:alloptions)
	{
		System.out.println(i.getText());
		if(i.getText().contains("Toys & Games"))
		{
			i.click();
			break;
		}
	}
	
	*/
}
}
