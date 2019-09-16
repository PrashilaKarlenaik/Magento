package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class MyAccountPage extends TestBase
{
	@FindBy(linkText="TV")
	WebElement tvMenu;
	
	@FindBy(xpath="//p[@class='hello']")
	WebElement helloMsg;
	
	@FindBy(linkText="MY ORDERS")
	WebElement myOrders;
	

	public MyAccountPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}

	public TvPage clickedtvMenu() throws IOException
	{
		tvMenu.click();
		
		return new TvPage();
		
	}
	
	public String helloMsg()
	{
		return helloMsg.getText();
		
	}
	
	public MyOrdersPage clickMyOrdersMenu() throws IOException
	{
		myOrders.click();
		return new MyOrdersPage();
	}
	
	
}
