package com.SwagLabs.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)//baseclass
	{
		this.driver=driver;//assigning to current class driver
	}
	//locators
	private By productoptions=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	
	private By productname=By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name ']");
	
	private By addtocartbtn=By.xpath("//button[text()='Add to cart']");
	
	//methods
	public int getproductscount()
	{
	int count=	driver.findElements(productoptions).size();
		//System.out.println(count);
	return count;
	}
	public void getproductsname()
	{
		List<WebElement>list=driver.findElements(productname);
		System.out.println("**********product names are*********");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			
		}
		
	}
	public void addproducttocart(String pname)
	{
		List<WebElement>list=driver.findElements(productname);
		System.out.println();
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}	
		}
		//click on button
		driver.findElement(addtocartbtn).click();
		System.out.println("product " + pname + " is added to the cart");
	}
}
