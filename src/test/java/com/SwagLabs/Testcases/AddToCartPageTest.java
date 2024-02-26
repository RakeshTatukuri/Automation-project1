package com.SwagLabs.Testcases;

import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass{
  @Test(priority=1)
  public void verifycartpage() {
	    ap.getcartpage();
	  
  }
  @Test(priority=2)
  public void validateRemoveproduct() {
	  ap.doremove();
	  addpause();
  }
  @Test(priority=3)
  public void validatecontinue() {
	  ap.docontinue();
	  addpause();
	  ip.addproducttocart("Sauce Labs Bolt T-Shirt");
	  addpause();
	  ap.getcartpage();
	  addpause();
  }
  
  @Test(priority=4)
  public void validatecheckout() {
	  ap.docheckout();
	  
  }
}
