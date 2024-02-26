package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemoXpath_operator_indexing {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		//firstname using and operator
		driver.findElement(By.xpath("//input[@class=\"form-control\" and @name=\"firstname\"]")).sendKeys("rakesh");
		//lastname using or operator
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\" or @name=\"lastname\"]")).sendKeys("t");
		//email using indexing
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[3]")).sendKeys("rakesh@gmail.com");
		//telephone using position()
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[position()=4]")).sendKeys("9876543210");
		//password using indexing
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[5]")).sendKeys("password");
		//conform password
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[6]")).sendKeys("password");
		//yes radio button
		driver.findElement(By.xpath("(//input[@value=\"1\"])[2]")).click();
		/*
		 * accept both radio button if button is not selected then click on it
		 * radio or checkbox is selected---> isselected()
		 */
		
	List<WebElement> list=driver.findElements(By.xpath("(//div[@class=\"col-sm-10\"])[8]//input[@type=\"radio\"]"));
	for(WebElement i:list)
	{
		if(!i.isSelected())
		{
			i.click();
			break;
		}
			
	}
		//checkbox
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		//continue
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
	}

}
