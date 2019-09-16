package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class AddToCartPage extends TestBase
{
	@FindBy(xpath="//input[@title='Qty' and @class='input-text qty']")
	WebElement qtpField;
	
	@FindBy(xpath="//button[@class='button btn-update' and @value='update_qty']")
	WebElement updateButton;
	
	@FindBy(xpath="//p[@class='item-msg error']")
	WebElement errormsgOnQtpExceed;
	
    @FindBy(id="empty_cart_button")
	
	WebElement emptyCart;
	
	

	public AddToCartPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement qtpField()
	{
		return qtpField;
		
	}
	
	public WebElement updateButton()
	{
		return updateButton;
		
	}
	
	public String errorMessageByExceedingQty()
	{
		return errormsgOnQtpExceed.getText();
	}
	
	public ShoppingCart clickedEmptyCart() throws IOException 
	{
		emptyCart.click();
		return new ShoppingCart();
	}
	

}
