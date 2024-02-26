package TESTNG_DEMO;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class groupingtest {
  @Test(groups="Smoketest")
  public void testcase1() 
  {
	  System.out.println("These is test case1 for smoke scenario");
  }
  @Test(groups="Smoketest")
  public void testcase2() 
  {
	  System.out.println("These is test case2 for smoke scenario");
  }
  @Test(groups="Functionaltest")
  public void testcase3() 
  {
	  System.out.println("These is test case3 for functional scenario");
  }
  @Test(groups="Functionaltest")
  public void testcase4() 
  {
	  System.out.println("These is test case4 for functional scenario");
  }
  @Test(groups="Regressiontest")
  public void testcase5() 
  {
	  System.out.println("These is test case5 for regression scenario");
  }
  @Test(groups="Regressiontest")
  public void testcase6() 
  {
	  System.out.println("These is test case6 for regression scenario");
  }
}
