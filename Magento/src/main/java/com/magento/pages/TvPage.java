package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class TvPage extends TestBase

{
	
	@FindBy(xpath="//img[@id='product-collection-image-4']//following::a[3]")
	WebElement lgLcdAddToWishListButton;
	
	@FindBy(xpath="//button[@title='Share Wishlist']")
	WebElement shareWishlistButton;

	public TvPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public MyWishListPage clickLGAddToWishListButton() throws IOException
	{
		lgLcdAddToWishListButton.click();
		return new MyWishListPage();
	}
	
	public ShareWishListPage clickshareWishlistButton() throws IOException
	{
		shareWishlistButton.click();
		return new ShareWishListPage ();
	}
	
	
	
	
	
	
	//img[@id='product-collection-image-4']//following::a[3]

}
