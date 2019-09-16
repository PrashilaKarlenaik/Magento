package com.magneto.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.MyOrdersPage;
import com.magento.pages.ViewOrdersPage;

public class MyOrdersTestCase extends TestBase
{

	HomePage homepage;
	LoginPage loginPage;
	MyAccountPage myaccpage;
	MyOrdersPage myorders;
	ViewOrdersPage vieworder;
	
	
	public MyOrdersTestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	 @BeforeMethod
	  public void setUp() throws IOException
	  {
		  initialization();	
		  homepage=new HomePage();
		  loginPage= homepage.clickOnLogInLink();
		  myaccpage=loginPage.validateLogin();
		  myorders=myaccpage.clickMyOrdersMenu();
		  
	  }
	 
	 @Test
	 public void verifyRecenetlyGenreatedOrderNoAndStatus()
	 {
		 String previousOrderId="100010308";
		 Assert.assertEquals(myorders.getRecentlyGeneratedOrderNo(), previousOrderId);
		 String expectedStatus="Pending";
		 Assert.assertEquals(myorders.getRecentlyOrderItemStatus(), expectedStatus);
		 vieworder=myorders.clickViewOrdersLink();
		 vieworder.clickPrintLink();
		 
		 
		 
	 }

}
