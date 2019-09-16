package com.magneto.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.MyWishListPage;
import com.magento.pages.ShoppingCart;
import com.magento.pages.TvPage;

public class ShoppingCartTestCase extends TestBase
{
	HomePage homepage;
	LoginPage loginPage;
	MyAccountPage myaccpage;
	TvPage tvpage;
	ShoppingCart shoppingcart;
	MyWishListPage mywishlist;
	
  public ShoppingCartTestCase() throws IOException 
  {
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
	  tvpage= myaccpage.clickedtvMenu();
	  mywishlist= tvpage.clickLGAddToWishListButton();
	  shoppingcart =mywishlist.clickAddToCartButton();
	 
	 
	  
  }
  

  	@Test
  	public void verifyShippingCostGenerated() throws IOException 
	{
  		driver.findElement(By.id("country")).click();
  		Select select=new Select(driver.findElement(By.id("country")));
  		select.selectByValue("IN");
  		driver.findElement(By.id("region")).sendKeys("Maharashatra");
  		driver.findElement(By.id("postcode")).sendKeys("400012");
  		String cost=driver.findElement(By.xpath("//strong[text()='Grand Total']/following::span[1]")).getText();
  		driver.findElement(By.xpath("//button[@type='button' and @title='Estimate']")).click();
  		
  		
  		Assert.assertTrue(driver.findElement(By.xpath("//dt[text()='Flat Rate']")).isDisplayed(), "Flat rate is not generated");
  		
  		String flatRate=driver.findElement(By.xpath("//input[@id='s_method_flatrate_flatrate']//following::span[1]")).getText();
  		
  		Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Grand Total']/following::span[3]")).isDisplayed(),"Shipping rate is not added tp total");
  	}
  	
  	
  	@Test(dependsOnMethods= {"verifyShippingCostGenerated"})
  	public void verifyOrderNoISGenerated()
  	{
  		driver.findElement(By.xpath("//li[ @class='method-checkout-cart-methods-onepage-bottom']//button")).click();
  		driver.findElement(By.xpath("//div[@id='checkout-step-billing']//child::button")).click();
  		
  		driver.findElement(By.xpath("//div[@id='checkout-step-shipping_method']//child::button")).click();
  		
  		driver.findElement(By.xpath("//input[@id='p_method_checkmo' and @title='Check / Money order']")).click();
  		
  		driver.findElement(By.xpath("//div[@id='checkout-step-payment']//child::button")).click();
  		driver.findElement(By.cssSelector(".button.btn-checkout")).click();
  		
  		WebDriverWait wait=new WebDriverWait(driver,5);
  		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='page-title']"), "YOUR ORDER HAS BEEN RECEIVED."));
  		
  		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']")).getText(), "YOUR ORDER HAS BEEN RECEIVED.");
  		String orderNo=driver.findElement(By.cssSelector("a[href^='http://live.guru99.com/index.php/sales/order/view/order_id/']")).getText();
  		System.out.println("Order No is"+orderNo);
  	
  	}
  	
  	
  	
  	
}
