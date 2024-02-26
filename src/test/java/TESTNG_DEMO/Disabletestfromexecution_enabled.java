package TESTNG_DEMO;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Disabletestfromexecution_enabled {

	@Test(priority=-1,description="These is test case1")
	public void Registertest() 
	{
		System.out.println("these is register test for user");
	}
	@Test(priority=0,description="These is test case2")//invocationcount attribute is used to execute the particular text case for how many times
	public void logintest() 
	{
		System.out.println("these is login test for user");
	}
	@Test(priority=1,description="These is test case3",enabled=false)
	public void searchtest() 
	{
		System.out.println("these is search test for user");
	}
	@Test(priority=2,description="These is test case4")
	public void addtocarttest() 
	{
		System.out.println("these is addtocart test for user");
	}
	@Test()
	public void logout()
	{
		System.out.println("these is logout for user");
	}
}
