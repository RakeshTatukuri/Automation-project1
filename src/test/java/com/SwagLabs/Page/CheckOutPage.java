package com.SwagLabs.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class CheckOutPage {

	private WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//locators
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By postalcode=By.id("postal-code");
	private By continuebtn=By.id("continue");
	
	//methods
	
	public void docontinue(String un,String pw,String pc)
	{
		driver.findElement(firstname).sendKeys(un);
		driver.findElement(lastname).sendKeys(pw);
		driver.findElement(postalcode).sendKeys(pc);
		utility.getScreenshot(driver);
		driver.findElement(continuebtn).click();
	}
	
	
}
