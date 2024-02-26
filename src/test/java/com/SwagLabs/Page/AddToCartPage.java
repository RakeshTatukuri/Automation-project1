package com.SwagLabs.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//locator
	private By removebtn  =By.xpath("//button[text()='Remove']");
	private By continuebtn=By.id("continue-shopping");
	private By checkoutbtn=By.id("checkout");
	private By cartbtn=By.id("shopping_cart_container");
	//methods
	public void getcartpage() {
		driver.findElement(cartbtn).click();
		System.out.println("cart page is open!");
	}
	public void doremove()
	{
		driver.findElement(removebtn).click();
		System.out.println("product removed from the cart");
	}
	public String docontinue()
	{
		driver.findElement(continuebtn).click();
		System.out.println("it should navigates to inventory page");
		return driver.getCurrentUrl();
	}
	public String docheckout()
	{
		driver.findElement(checkoutbtn).click();
	    return driver.getCurrentUrl();
	}	
}
