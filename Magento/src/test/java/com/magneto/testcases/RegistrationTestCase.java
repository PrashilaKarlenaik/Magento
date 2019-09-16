package com.magneto.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.RegistrationPage;

public class RegistrationTestCase extends TestBase

{
	HomePage homepage;
	LoginPage loginpage;
	RegistrationPage registrationPage;
	MyAccountPage acc;
	
  public RegistrationTestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
  @BeforeMethod
  public void setUp() throws IOException
  {
	  initialization();	
	  homepage=new HomePage();
	  homepage.clickedAccountButton();
	  loginpage=new LoginPage();
	  registrationPage =loginpage.clickCreateAnAccountButton();
	  acc=new MyAccountPage();
	  
  }
/*@Test
  public void verifyRegistrationError() 
  {
	String validationMsg="This is a required field.";
	String errorMsg=registrationPage.registrationErrorMsg();
	Assert.assertEquals(errorMsg, validationMsg);
  }*/

@Test
public void verifyRegistration() throws IOException
{
	registrationPage.registration();
	String helloMsg=acc.helloMsg();
	Assert.assertTrue(helloMsg.contains("padyaqqq")&& helloMsg.contains("gavkargfgfg") );
	
	
}
}
