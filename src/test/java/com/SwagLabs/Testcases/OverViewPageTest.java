package com.SwagLabs.Testcases;

import org.testng.annotations.Test;

public class OverViewPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyurl() {
	  addpause();
	System.out.println("current url:"+ op.getAppurl());
  }
  @Test(priority=2)
  public void verifyproductdetails() {
	  addpause();
	  op.getproductdetails();
  }
  @Test(priority=3)
  public void verifycompleteprocess() {
	  addpause();
	  op.dofinish();
  }
}
