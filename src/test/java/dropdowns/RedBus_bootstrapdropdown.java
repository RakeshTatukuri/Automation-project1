package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_bootstrapdropdown {
public static void main(String[] args) {
	//disable notifications
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.redbus.in");
	//dropdown
	driver.findElement(By.id("src")).sendKeys("vijayawada");
	List<WebElement>alloption=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li//text[@class=\"placeHolderMainText\"]"));
    System.out.println("total options are:"+alloption.size());
    for(WebElement i:alloption)
    {
    	System.out.println(i.getText());
    	if(i.getText().contains("Benz Circle"))
    	{
    		i.click();
    		break;
    	}
    }

}
}
