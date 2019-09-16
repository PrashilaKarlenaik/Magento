package com.magento.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class ViewOrdersPage extends TestBase

{
	
@FindBy(className="link-print")
	
	WebElement printOrder;

	public ViewOrdersPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void  clickPrintLink()
	{
		printOrder.click();
		
		
	}
	
	
	
	

}
