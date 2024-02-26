package com.SwagLabs.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass{
  @Test(priority=1)
  public void verifyproductcount() {
	  int count= ip.getproductscount();
	  Assert.assertEquals(count,6,"product count not matched!");
	  System.out.println("Total products are "+count);
  }
  @Test(priority=2)
  public void verifyproductnames() {
	  ip.getproductsname();
  }
  @Test(priority=3)
  public void validateAddTocart() {
	   ip.addproducttocart("Sauce Labs Fleece Jacket");
  }
}
