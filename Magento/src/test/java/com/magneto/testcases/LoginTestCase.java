package com.magneto.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage ;
import com.magento.pages.LoginPage;

public class LoginTestCase extends TestBase
{
	
	HomePage homepage;
	LoginPage loginPage;
	
	public LoginTestCase() throws IOException
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	  public void setUp() throws IOException
	  {
		  initialization();	
		  homepage=new HomePage();
		  loginPage=new LoginPage();
		  
	  }
 
  @Test
  public void verifyLogin() throws IOException
  {
	  homepage.clickOnLogInLink();
	  loginPage.validateLogin();
	  
	  
	  
	  
  }
}
