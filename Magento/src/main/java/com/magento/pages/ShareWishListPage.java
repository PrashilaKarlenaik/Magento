package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class ShareWishListPage extends TestBase
{
	
	@FindBy(id="email_address")
	WebElement emilaAddress;
	
	
	@FindBy(id="message")
	WebElement messgaeBox;
	
	@FindBy(xpath="//button[@title='Share Wishlist']")
	WebElement shareWishlistButton;

	public ShareWishListPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailAddress()
	{
		emilaAddress.sendKeys("prashilakarlenaik@gmail.com");
	}
	
	
	public void enterMessage()
	{
		messgaeBox.sendKeys("test");
	}
	
	public MyWishListPage clickshareWishlistButton() throws IOException
	{
		shareWishlistButton.click();
		
		return new MyWishListPage();
	}
	

	
	
	
	
	
	
	
	

}
