package com.magneto.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.TvPage;

public class TvTestCase extends TestBase
{

	MyAccountPage acc;
	TvPage tvpage;
	public TvTestCase() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod
	  public void setUp() throws IOException
	  {
		  /*initialization();	
		  homepage=new HomePage();
		  homepage.clickedAccountButton();
		  loginpage=new LoginPage();
		  registrationPage =loginpage.clickCreateAnAccountButton();*/
		  MyAccountPage acc = new MyAccountPage();
		  tvpage = acc.clickedtvMenu();
		  
		}
	
	
	
	
	
	
	
}
