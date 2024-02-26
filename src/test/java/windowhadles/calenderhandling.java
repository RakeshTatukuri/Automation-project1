package windowhadles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calenderhandling {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//expected result
		String date="05";
		String month="Jun";
		String year="2024";
		
		//open calender
		driver.findElement(By.className("dateText")).click();
		
		//month selection
		while(true) {
		String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
		System.out.println(text);
		String cmonth=text.split(" ")[0];
		String cyear=text.split(" ")[1];
		//System.out.println(cmonth);
		//System.out.println(cyear);
		if(cmonth.contains(month) && cyear.contains(year))
		{
			break;
		}else 
		{
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
		}
		
		}
		
		
		////div[contains(@class,'DayTilesWrapper')]//div[contains(@class,'DayTiles__CalendarDays')]
		
		//date selection
		List<WebElement>alldates=driver.findElements(By.xpath("//div[contains(@class,'DayTiles__CalendarDays')]"));
		for(WebElement i:alldates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}			
	}
}
