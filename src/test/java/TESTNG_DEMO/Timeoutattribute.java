package TESTNG_DEMO;

import org.testng.annotations.Test;

public class Timeoutattribute {
  @Test
  public void testcase1() 
  {
	  System.out.println("these is test1");
  }
  @Test(timeOut=4000)
  public void testcase2() throws InterruptedException
  {
	  Thread.sleep(5000);
	  System.out.println("these is test2");
  }
}
