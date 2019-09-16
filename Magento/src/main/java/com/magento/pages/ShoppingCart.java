package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class ShoppingCart extends TestBase
{
	@FindBy(xpath="//div[@class='cart-empty']//p[1]")
	
	WebElement emptyCartErrorMsg;
	
	public ShoppingCart() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String shoppingCartErrorMessage()
	{
		return emptyCartErrorMsg.getText();
	}
	
}
