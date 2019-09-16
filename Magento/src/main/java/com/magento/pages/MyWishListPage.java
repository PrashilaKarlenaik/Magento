package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class MyWishListPage extends TestBase

{
	
	@FindBy(className="success-msg")
	WebElement successMsg;
	
	@FindBy(xpath="//button[@title='Add to Cart' and @type='button']")
	WebElement addToCartButton;
	

	public MyWishListPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getSuccessMessage()
	{
		return successMsg.getText();
	}
	
	public ShoppingCart clickAddToCartButton() throws IOException
	{
		addToCartButton.click();
		return new ShoppingCart();
		
	}
	
	
	

}
