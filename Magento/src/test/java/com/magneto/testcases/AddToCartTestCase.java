package com.magneto.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;

import com.magento.pages.AddToCartPage;
import com.magento.pages.HomePage;
import com.magento.pages.MobilePage;
import com.magento.pages.ShoppingCart;

public class AddToCartTestCase extends TestBase
{
	HomePage homepage;
	MobilePage mobilepage;
	AddToCartPage addtocart;
	ShoppingCart	shoppingCart;
	public AddToCartTestCase() throws IOException {
	super();
		
	}
  
  
  @BeforeMethod
  public void setUp() throws IOException
  {
	  initialization();
	  homepage=new HomePage();
	  mobilepage=new MobilePage();
	  addtocart=new AddToCartPage();
	  shoppingCart=new ShoppingCart();
	  
	
	  
	  
  }

@Test
  public void errorMessgaeOnExceedProducts() throws IOException
{
	homepage.validateMobileMenuClicked();
	
	mobilepage.addToCartClicked();
	
	WebElement qtpField=addtocart.qtpField();
	
	qtpField.click();
	
	qtpField.sendKeys("1000");
	
	WebElement updateButton=addtocart.updateButton();
	
	updateButton.click();
	
	String errorMEssage1=addtocart.errorMessageByExceedingQty();
	
	Assert.assertEquals(errorMEssage1, "* The maximum quantity allowed for purchase is 500.");
	
	
	addtocart.clickedEmptyCart();
	
	String errorMEssage2= shoppingCart.shoppingCartErrorMessage();
	
	Assert.assertEquals(errorMEssage2, "You have no items in your shopping cart.");
	
	
	
	
	
	
	
	
	
	
	/*driver.findElement(By.xpath("//input[@title='Qty' and @class='input-text qty']")).click();
	
	
	driver.findElement(By.xpath("//input[@title='Qty' and @class='input-text qty']")).sendKeys("1000");
	driver.findElement(By.xpath("//button[@class='button btn-update' and @value='update_qty']")).click();
	String error=driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
	Assert.assertEquals(error, "* The maximum quantity allowed for purchase is 500.");
	
	driver.findElement(By.id("empty_cart_button")).click();
	
	String error2=driver.findElement(By.xpath("//div[@class='cart-empty']//p[1]")).getText();
	Assert.assertEquals(error2, "You have no items in your shopping cart."
			);*/
	
	
	
												
	
	
	
  }
}
