package com.magneto.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.MyWishListPage;
import com.magento.pages.ShareWishListPage;
import com.magento.pages.TvPage;

public class ShareWishListTestCase extends TestBase
{
	HomePage homepage;
	LoginPage loginPage;
	MyAccountPage myaccpage;
	TvPage tvpage;
	ShareWishListPage sharewishList;
	 MyWishListPage mywishlispage;
	
	
  public ShareWishListTestCase() throws IOException 
  {
	  super();
  }
  
  
  @BeforeMethod
  public void setUp() throws IOException
  {
	  initialization();	
	  homepage=new HomePage();
	  loginPage=new LoginPage();
	  myaccpage=new MyAccountPage();
	  tvpage=new TvPage();
	  sharewishList=new ShareWishListPage();
	  mywishlispage=new MyWishListPage();
}

@Test
  public void verifyShareWishList() throws IOException 
	{
	homepage.clickOnLogInLink();
	loginPage.validateLogin();
	myaccpage.clickedtvMenu();
	tvpage.clickLGAddToWishListButton();
	tvpage.clickshareWishlistButton();
	sharewishList.enterEmailAddress();
	sharewishList.enterMessage();
	sharewishList.clickshareWishlistButton();
	Assert.assertEquals(mywishlispage.getSuccessMessage(), "Your Wishlist has been shared.");
	}
}
