package TESTNG_DEMO;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Annotationdemo {
  @Test(priority=1)
  public void Registertest() 
  {
	  System.out.println("These is register test for user");
  }
  @Test(priority=2)
  public void Logintest()
  {
	  System.out.println("These is login test for user");
  }
  @Test(priority=3)
  public void Logouttest()
  {
	  System.out.println("These is logout test for user");
  }

  //Annotations
@BeforeMethod()
public void beforemethod()
{
	System.out.println("Beforemethod executes before every test case");
}
@AfterMethod()
public void aftermethod ()
{
	System.out.println("Aftermethod executes after every test case");
}
@BeforeClass()
public void beforeclass()
{
	System.out.println("Beforeclass executes before first  test case");
}
@AfterClass()
public void Afterclass()
{
	System.out.println("Afterclass executes after last  test case");
}
@BeforeTest()
public void Beforetest()
{
	System.out.println("BeforeTest executes before every class");
}
@AfterTest()
public void Aftertest()
{
	System.out.println("AfterTest executes after every class");
}
@BeforeSuite()
public void Beforesuite()
{
	System.out.println("Beforesuite executes before Test");
}
@AfterSuite()
public void Aftersuite()
{
	System.out.println("Aftersuite executes after Test");
}
}