package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class MyOrdersPage extends TestBase
{
	
	@FindBy(xpath="//tr[@class='first odd']//child::td[1]")
	WebElement recentlyOrderno;
	
	@FindBy(xpath="//tr[@class='first odd']//child::td[5]")
	WebElement recentlyOrderStatus;
	
	@FindBy(xpath="//tr[@class='first odd']//child::td[6]//a[1]")
	WebElement viewOrders;
	

	public MyOrdersPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public String getRecentlyGeneratedOrderNo()
	{
		return recentlyOrderno.getText();
	}
	
	
	public String getRecentlyOrderItemStatus()
	{
		return recentlyOrderStatus.getText();
	}
	
	
	public ViewOrdersPage clickViewOrdersLink()
	{
		viewOrders.click();
		
		return new ViewOrdersPage();
	}

}
