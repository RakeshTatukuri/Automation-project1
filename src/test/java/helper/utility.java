package helper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	
	public static void getScreenshot(WebDriver driver) {
	 //screenshot
	  TakesScreenshot ts=(TakesScreenshot) driver;//takescreenshot interface
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//amazon"+System.currentTimeMillis()+".png");
	  try {
	  FileHandler.copy(temp, dest);
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	}

	//explict wait conditions
	public static WebElement waitforpresenceofelement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	public static WebElement waitforviibilityofelement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	public static WebElement waitforelementtoclick(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.elementToBeClickable(loc));
	}
	public static boolean waitfortitle(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.titleContains(title));
	}
	public static boolean waitforurl(WebDriver driver,String url)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	
	
	
	  //reusable method
	    //drop down 
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
}
