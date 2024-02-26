package com.SwagLabs.Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.SwagLab.Utilities.PropertiesRead;
//import com.SwagLabs.Page.LoginPage;
import com.SwagLabs.Page.AddToCartPage;
import com.SwagLabs.Page.CheckOutPage;
import com.SwagLabs.Page.InventoryPage;
import com.SwagLabs.Page.LoginPage;
import com.SwagLabs.Page.OverviewPage;

import helper.utility;

//prerepostiory
public class BaseClass {

	public WebDriver driver;
	//object declaration
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckOutPage cp; 
	public OverviewPage op;
	//properties class
	PropertiesRead pr;
	
	@BeforeTest
	public void Appsetup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		pr=new PropertiesRead("configswag");

		lp=new LoginPage(driver);//pass to loginpage constructor
		ip=new InventoryPage(driver);//pass to InventoryPage constructor
		ap=new AddToCartPage(driver);
		cp=new CheckOutPage(driver);
		op=new OverviewPage(driver);
		
	}
	@BeforeClass
	public void pagesetup()
	{
		System.out.println("********Login********");
		System.out.println("application url "+lp.getAppURL());
		System.out.println(("application title "+lp.getAppTitle()));
		lp.doLogin(pr.getdata("un"),pr.getdata("pwd")); 
		utility.getScreenshot(driver);
		addpause();
		System.out.println("********Inventory********");
        System.out.println("Total product are "+ip.getproductscount());
        ip.getproductsname();
		utility.getScreenshot(driver);
		addpause();
        ip.addproducttocart(pr.getdata("pname1"));//
		utility.getScreenshot(driver); 
		addpause();
		
		
        System.out.println("**********cart page*******");
		ap.getcartpage();
		addpause();
		ap.doremove();
		utility.getScreenshot(driver);
		addpause();
		ap.docontinue();
		utility.getScreenshot(driver);
		addpause();
		ip.addproducttocart(pr.getdata("pname2"));
		addpause();
		ap.getcartpage();
		addpause();
		ap.docheckout();
		addpause();
		System.out.println("**********check out page********");
		cp.docontinue(pr.getdata("fname"),pr.getdata("lname"),pr.getdata("zc"));
		addpause();
		System.out.println("****** overview page**********");
	}
	public void addpause()
	{
		try {
			Thread.sleep(2500);
		    } catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
}
