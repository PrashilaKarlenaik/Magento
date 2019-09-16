package com.magneto.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;

import junit.framework.Assert;

public class HomeTestCase  extends TestBase
{
	HomePage homepage;
	public HomeTestCase() throws IOException
	{
		super();
		
	}
  
  @BeforeMethod
  public void setUp() throws IOException
  {
	  initialization();	
	  homepage=new HomePage();
  }
  
  
  //--Verify title of Homepage
  
  @Test
  public void verifyTitleOfHomePageTest()
  {
	  
	  String abc=homepage.validateHomePageTitle();
	  Assert.assertEquals("THIS IS DEMO SITE FOR   ",abc );
  }
  
  
  
}
  
  
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  
  
  
  
  
  
  

