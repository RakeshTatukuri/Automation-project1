package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/search;_ylt=Awr1QI6qbNRlTvsw.yW7HAx.;_ylc=X1MDMjExNDcyMzAwMwRfcgMyBGZyA21jYWZlZQRmcjIDc2EtZ3Atc2VhcmNoBGdwcmlkA2lMN3BJUGRqU3pHZHduSWF4bWJFWEEEbl9yc2x0AzAEbl9zdWdnAzEwBG9yaWdpbgNpbi5zZWFyY2gueWFob28uY29tBHBvcwMyBHBxc3RyA2N1cgRwcXN0cmwDMwRxc3RybAMxOARxdWVyeQNjdXJyZW5jeSUyMGNvbnZlcnRlcgR0X3N0bXADMTcwODQyMDMxMAR1c2VfY2FzZQM-?p=currency+converter&fr2=sa-gp-search&fr=mcafee&vm=r&type=E210IN826G0");
	
	WebElement	ele=driver.findElement(By.id("currlist2"));
	Select sc=new Select(ele);
	System.out.println(sc.getClass());
	
	}
}
