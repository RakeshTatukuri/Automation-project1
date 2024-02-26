package com.SwagLabs.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class OverviewPage {

	private WebDriver driver;
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//locator
	private By getdata=By.id("checkout_summary_container");
	private By finishbtn=By.id("finish");
    private By msg =By.id("checkout_complete_container");
	
	//method
	public String getAppurl()
	{

	return driver.getCurrentUrl();
	}
	public void getproductdetails()
	{
		System.out.println("final product details are");
		utility.getScreenshot(driver);
	    System.out.println(driver.findElement(getdata).getText());
	}
	public void dofinish()
	{
		driver.findElement(finishbtn).click();
		utility.getScreenshot(driver);
		System.out.println(driver.findElement(msg).getText());
	}
	
	
	
}
