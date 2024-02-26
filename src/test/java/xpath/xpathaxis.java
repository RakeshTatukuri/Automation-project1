package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxis {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://automationplayground.com/crm/customers.html?email");
	//john ancestor node
	String text=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
	System.out.println("for john ancestor node is :"+  text);
	//john parent node
	String text2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
	System.out.println("for john parent node :"+ text2);
	//for row2 all child nodes
	List<WebElement>list=driver.findElements(By.xpath("//tbody//tr[2]//child::td"));
	for(WebElement i:list)
	{
		System.out.println("for row2 all child nodes are:"+"tagname: "+i.getTagName()+"||"+"text: "+i.getText());
	}
	//who is preceding sibiling of john=2
	String text3=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td")).getText();
	System.out.println("preceding sibling of john is: "+text3);
	//get all preceding node for john
	List<WebElement>list1=driver.findElements(By.xpath("//td[text()='John']//preceding::td"));
	System.out.println("All the preceding node for john:");
	for(WebElement i:list1)
	{
		System.out.println(i.getText());
	}
	//get all following-sibiling of john
		List<WebElement>list2=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		System.out.println("total following sibling for john are: "+list2.size());
		for(WebElement i:list2)
		{
			System.out.println(i.getText());
		}
		
	//get all following node of john
	int count=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
	System.out.println("total following nodes are: "+count);
	
}
}
